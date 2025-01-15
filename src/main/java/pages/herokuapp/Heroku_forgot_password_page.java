package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_forgot_password_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_forgot_password_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Поле для ввода email
     */
    public static String insert_email_field_path = "//input[contains(@name,'email')]";
    /**
     *  Кнопка Retrieve password
     */
    public static String retrieve_password_button_path = "//button[contains(@type,'submit')]";
    /**
     *  Подтверждение нажатия кнопки Retrieve password
     */
    public static String retrieve_password_button_confirm_path = "//h1";



    /**
     * Метод для ввода в поле email
     */
    public Heroku_forgot_password_page insert_email(String email )  {
        WebElement button =  set_element_visible(insert_email_field_path);
        button.sendKeys(email);

        return new Heroku_forgot_password_page(driver);
    }
    /**
     * Метод нажатия на кнопку Retrieve password
     */
    public Heroku_forgot_password_page submit_password_retrieve()  {
        WebElement button =  set_element_visible(retrieve_password_button_path);
        button.click();

        Assertions.assertEquals(
                "Internal Server Error",
                set_element_visible(retrieve_password_button_confirm_path).getText());
        return new Heroku_forgot_password_page(driver);
    }
}
