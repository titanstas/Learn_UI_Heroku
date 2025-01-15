package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Heroku_download_secure_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_download_secure_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Элемент для загрузки первого файла из Heroku
     */
    public static String file_path = "//a[contains(@href,'download_secure')]";





    /**
     *  директория для хранения файла
     */
    public static String file_directory ="D:\\files\\";

    /**
     *  Название файла
     */
    public static String file_name ="secure_downloaded_file.png";


    /**
     * Метод загрузки и чтения данных файла , проверяет каждую секунду загрузился ли файл
     */
    public Heroku_download_page download_file()  {


        int seconds_without_file = 0;
        Path download_file_directory= Paths.get(file_directory);
        Path download_file_path = Paths.get(file_directory+file_name);

            //Увидеть все файлы в директории
        try {
            Files.list(download_file_directory).forEach(x-> System.out.println(x));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Нажатие на элемент для загрузки файла
        WebElement button =  set_element_visible(file_path);
        button.click();





        //Создание директории для хранения файла
        if (!Files.exists(download_file_directory)) {
            try {
                Files.createDirectory(download_file_directory);
            } catch (IOException e) {
                System.out.println("Не создается директория");
            }
        }
        System.out.println("------------------------------------------");
            //Увидеть все файлы в директории
        try {
            Files.list(download_file_directory).forEach(x-> System.out.println(x));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        // Цикл для провеки, что файл появился
//        while (!Files.exists(download_file_path))
//        {
//            try {
//                Thread.sleep(1000);
//                seconds_without_file++;
//            }
//            catch (InterruptedException e) {throw new RuntimeException(e);}
//
//            System.out.println("Файла нет "+ seconds_without_file+ " секунд");
//
//            if (seconds_without_file>10)
//                break;
//        }


       // Assertions.assertTrue(Files.exists(download_file_path));

        //Чтение содержимого файла по байтам
//        try {
//            System.out.println(
//                    Arrays.toString(Files.readAllBytes(download_file_path))
//            );
//        } catch (IOException e) {
//            System.out.println("Нет файла для чтения");
//        }


        return new Heroku_download_page(driver);
    }
}
