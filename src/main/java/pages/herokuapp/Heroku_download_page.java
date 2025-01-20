package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tags;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Heroku_download_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_download_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Элемент для загрузки файла из Heroku файл
     */
    public static String file_path = "//div//following-sibling::h3//following-sibling::a";


    /**
     *  директория для хранения файла
     */
    public static String file_directory ="D:\\files\\";




    /**
     * Метод загрузки и чтения данных файла , проверяет каждую секунду загрузился ли файл
     */
    public Heroku_download_page download_file()  {
        //Нажатие на элемент для загрузки файла
        WebElement button =  set_element_visible(file_path);
        button.click();


        //Название файла
        String file_name =button.getText();
        //Время секунд без файла
        int seconds_without_file = 0;
        //Путь к директории
        Path download_file_directory= Paths.get(file_directory);
        //Путь к файлу
        Path download_file_path = Paths.get(file_directory+file_name);


        //Создание директории для хранения файла
        if (!Files.exists(download_file_directory)) {
            try {
                Files.createDirectory(download_file_directory);
            } catch (IOException e) {
                System.out.println("Не создается директория");
            }
        }


        // Цикл для провеки, что файл появился
        while (!Files.exists(download_file_path))
        {
            try {
                Thread.sleep(1000);
                seconds_without_file++;
            }
            catch (InterruptedException e) {e.printStackTrace();}

            System.out.println("Файла нет "+ seconds_without_file+ " секунд");

            if (seconds_without_file>10) {
                System.out.println("Файла "+file_name+" нет в директории "+file_directory);
                break;
            }
        }


        Assertions.assertTrue(Files.exists(download_file_path));

        //Чтение содержимого файла по байтам в кидировке UTF_8
        try {
            byte[] file_bytes = Files.readAllBytes(download_file_path);
            String file_lines = new String(file_bytes, StandardCharsets.UTF_8);
            System.out.println(file_lines);
        } catch (IOException e) {
            System.out.println("Нет файла для чтения");
        }


        return new Heroku_download_page(driver);
    }

}
