package pages.herokuapp.frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_frames_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_frames_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопка перехода на страницу Nested frames
     */
    public static String nested_frames_button_path = "//a[contains(@href,'nested_frames')]";
    /**
     *  Кнопка перехода на страницу iFrame
     */
    public static String iframe_button_path = "//a[contains(@href,'iframe')]";




    /**
     * Метод перехода на страницу Nested frames
     */
    public Heroku_nested_frames_page go_to_nested_frames()  {
        WebElement button =  set_element_visible(nested_frames_button_path);
        button.click();
        return new Heroku_nested_frames_page(driver);
    }
    /**
     * Метод перехода на страницу iFrame
     */
    public Heroku_iframes_page go_to_iframes()  {
        WebElement button =  set_element_visible(iframe_button_path);
        button.click();
        return new Heroku_iframes_page(driver);
    }
}
