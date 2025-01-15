package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_geolocation_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_geolocation_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопку получения геолокации
     */
    public static String geolocation_button_path = "//button[contains(@onclick,'getLocation')]";
    /**
     *  Latitude геолокации
     */
    public static String geolocation_Latitude_path = "//div[contains(@id,'lat-value')]";
    /**
     *  Longitude геолокации
     */
    public static String geolocation_Longitude_path = "//div[contains(@id,'long-value')]";

    /**
     * Метод нажатия на кнопку получения геолокации
     */
    public Heroku_login_page click_get_geolocation_button()  {
        WebElement geolocation =  set_element_visible(geolocation_button_path);
        geolocation.click();

        WebElement geolocation_Latitude =  set_element_visible(geolocation_Latitude_path);
        WebElement geolocation_Longitude =  set_element_visible(geolocation_Longitude_path);

        Assertions.assertFalse(geolocation_Latitude.getText().isEmpty());
        Assertions.assertFalse(geolocation_Longitude.getText().isEmpty());

        System.out.println(geolocation_Latitude.getText());
        System.out.println(geolocation_Longitude.getText());
        return new Heroku_login_page(driver);
    }
}
