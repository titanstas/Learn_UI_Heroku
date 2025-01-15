package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_notification_message_rendered_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_notification_message_rendered_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Кнопка для получения уведомления
     */
    public static String notification_message_button_path = "//a[contains(@href,'notification_message')]";
    /**
     *   Уведомление
     */
    public static String notification_message_path = "//div[contains(@class,'flash notice')]";
    /**
     *  Кнопка для закрытия уведомления
     */
    public static String notification_message_close_button_path = "//a[contains(@class,'close')]";



    /**
     * Метод получения уведомления
     */
    public Heroku_notification_message_rendered_page get_notification_message()  {
        WebElement button =  set_element_visible(notification_message_button_path);
        button.click();

        WebElement notification_message =  set_element_visible(notification_message_path);
        System.out.println(notification_message.getText());

        return new Heroku_notification_message_rendered_page(driver);
    }

    /**
     * Метод получения уведомления
     */
    public Heroku_notification_message_rendered_page close_notification_message()  {
        WebElement button =  set_element_visible(notification_message_close_button_path);
        button.click();

        Assertions.assertTrue(element_invisible(notification_message_path));

        return new Heroku_notification_message_rendered_page(driver);
    }
}
