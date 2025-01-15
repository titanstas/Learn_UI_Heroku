package pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_slow_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_slow_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Элемент с медленно загружаемым контентом
     */
    public static String slow_loading_content_path = "//div[contains(@id,'content')]";


    /**
     * Метод нажатия на медленно загружаемый контент
     */
    public Heroku_slow_page click_slow_downloading_content()  {
        WebElement button =  set_element_visible(slow_loading_content_path);
        button.click();

        return new Heroku_slow_page(driver);
    }
}
