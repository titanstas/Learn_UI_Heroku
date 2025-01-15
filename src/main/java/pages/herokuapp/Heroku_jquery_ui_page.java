package pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Heroku_jquery_ui_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_jquery_ui_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопка Enabled
     */
    public static String button_enabled_path = "//a[contains(text(),'Enabled')]";
    /**
     *  Кнопка Downloads
     */
    public static String button_downloads_path = "//a[contains(text(),'Downloads')]";
    /**
     *  Кнопка загрузки файла pdf, csv , xls
     */
    public static String button_pdf_download_path = "//a[contains(@href,'menu.%s')]";
    /**
     *  директория для хранения файла
     */
    public static String file_directory ="D:\\files\\";

    /**
     *  Название файла
     */
    public static String file_name ="menu.%s";





    /**
     * Метод загрузки файла в формате pdf, csv, xls
     * @param file_type - тип файла, может быть pdf или csv или xls
     */
    public Heroku_slow_page download_file(String file_type)  {
        WebElement button_enabled =  set_element_visible(button_enabled_path);
        button_enabled.click();
        WebElement button_downloads =  set_element_visible(button_downloads_path);
        button_downloads.click();
        WebElement button_file_type_download =  set_element_visible(button_pdf_download_path, file_type);
        button_file_type_download.click();

        int seconds_without_file = 0;
        Path download_file_path = Paths.get(file_directory+String.format(file_name, file_type));

        // Цикл для провеки, что файл появился
        while (!Files.exists(download_file_path))
        {
            try {
                Thread.sleep(1000);
                seconds_without_file++;
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Файла нет "+ seconds_without_file+ " секунд");

            if (seconds_without_file>10) {
                System.out.println("Файла "+String.format(file_name, file_type)+" нет в директории "+file_directory);
                break;
            }
        }

        return new Heroku_slow_page(driver);
    }
}
