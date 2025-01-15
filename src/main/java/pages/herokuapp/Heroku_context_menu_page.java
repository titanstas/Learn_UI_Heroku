package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class Heroku_context_menu_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_context_menu_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Кнопка вызова контекстного меню
     */
    public static String button_context_menu_path= "//div[contains(@id, 'hot-spot')]";



    /**
     * Метод нажатия на кнопку ок в контекстном меню
     */
    public void click_context_menu() throws InterruptedException {
        WebElement button = set_element_visible(button_context_menu_path);
        Actions actions = new Actions(driver);
        actions.contextClick(button).build().perform();
        Thread.sleep(2000);
        Assertions.assertTrue(alert_visible());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        Assertions.assertTrue(alert_invisible());
        //  Assertions.assertTrue(ExpectedConditions.alertIsPresent().);
    }


}
