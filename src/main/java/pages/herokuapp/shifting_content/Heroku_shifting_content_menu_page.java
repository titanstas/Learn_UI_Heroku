package pages.herokuapp.shifting_content;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_shifting_content_menu_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_shifting_content_menu_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Кнопка изменения пикселей на 100
     */
    public static String shifting_pixels_button_path = "//a[contains(@href,'&pixel_shift=100')]";
    /**
     *  Кнопка gallery
     */
    public static String gallery_button_path = "//a[contains(@href,'gallery')]";


    /**
     * Метод нажатия на кнопку gallery с измененным местоположением
     */
    public void click_shifting_gallery()  {
        WebElement button_to_shift_pixels = set_element_visible(shifting_pixels_button_path);
        button_to_shift_pixels.click();

        WebElement button_gallery = set_element_visible(gallery_button_path);
        button_gallery.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/gallery/",driver.getCurrentUrl());
    }

    /**
     * Метод нажатия на кнопку gallery с измененным местоположением с помощью url
     */
    public void click_shifting_gallery_by_url()  {
        driver.navigate().to("https://the-internet.herokuapp.com/shifting_content/menu?pixel_shift=100");

        WebElement button_gallery = set_element_visible(gallery_button_path);
        button_gallery.click();

        Assertions.assertEquals("https://the-internet.herokuapp.com/gallery/",driver.getCurrentUrl());
    }
}
