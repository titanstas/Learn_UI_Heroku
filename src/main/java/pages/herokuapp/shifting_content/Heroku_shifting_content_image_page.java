package pages.herokuapp.shifting_content;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_shifting_content_image_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_shifting_content_image_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопка изменения пикселей на 100
     */
    public static String shifting_pixels_button_path = "//a[contains(@href,'&pixel_shift=100')]";
    /**
     *  Кнопка картинки
     */
    public static String image_button_path = "//img[contains(@src,'/img/avatar.jpg')]";



    /**
     * Метод получения источника картинки с измененным местоположением
     */
    public void get_shifting_image_attribute()  {
        WebElement button_to_shift_pixels = set_element_visible(shifting_pixels_button_path);
        button_to_shift_pixels.click();

        WebElement image = set_element_visible(image_button_path);
        Assertions.assertEquals("https://the-internet.herokuapp.com/img/avatar.jpg",image.getAttribute("currentSrc"));
        System.out.println(image.getAttribute("currentSrc"));
    }

    /**
     * Метод получения источника картинки с измененным местоположением с помощью url
     */
    public void get_shifting_image_attribute_by_url()  {
        driver.navigate().to("https://the-internet.herokuapp.com/shifting_content/image?pixel_shift=100");

        WebElement image = set_element_visible(image_button_path);
        Assertions.assertEquals("https://the-internet.herokuapp.com/img/avatar.jpg",image.getAttribute("currentSrc"));
        System.out.println(image.getAttribute("currentSrc"));
    }
}
