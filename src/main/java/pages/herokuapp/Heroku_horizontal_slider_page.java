package pages.herokuapp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_horizontal_slider_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_horizontal_slider_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопку получения геолокации
     */
    public static String slider_path = "//div[contains(@class,'sliderContainer')]/input";

    /**
     * Метод нажатия на кнопку получения геолокации
     */
    public Heroku_horizontal_slider_page move_slider_right(int steps_to_move_right)  {
        WebElement slider =  set_element_visible(slider_path);

        for (int i = 0; i < steps_to_move_right ; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }


        return new Heroku_horizontal_slider_page(driver);
    }
}
