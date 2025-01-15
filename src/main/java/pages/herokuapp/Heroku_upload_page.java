package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_upload_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_upload_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Путь для загрузки файла
     */
    public static String file_upload_path = "//input[contains(@id,'file-upload')]";
    /**
     *  Путь для отправки загруженного файла в обработку
     */
    public static String file_submit_path = "//input[contains(@id,'file-submit')]";
    /**
     *  Путь для подтверждения загрузки загруженного файла
     */
    public static String file_uploaded_path = "//div[contains(@class,'panel text-center')]";

    /**
     *  директория для хранения файла
     */
    public static String file_directory ="D:\\files\\";
    /**
     *  Название файла
     */
    public static String file_name ="luminoslogo.png";

    /**
     * Метод для загрузки файла на Heroku
     */
    public Heroku_download_page upload_file()  {

        WebElement fileInput =  set_element_visible(file_upload_path);
        fileInput.sendKeys(file_directory+file_name);

        WebElement submit_upload =  set_element_visible(file_submit_path);
        submit_upload.click();

        WebElement file_uploaded =  set_element_visible(file_uploaded_path);

       Assertions.assertEquals(
               Heroku_download_page.file_name,
               file_uploaded.getText()
       );


        return new Heroku_download_page(driver);
    }
}
