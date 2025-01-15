package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_javascript_alerts_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_javascript_alerts_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Кнопка алерта JS
     */
    public static String js_alert_path = "//button[contains(@onclick,'jsAlert()')]";
    /**
     *  Кнопка подтверждения JS
     */
    public static String js_confirm_path = "//button[contains(@onclick,'jsConfirm()')]";
    /**
     *  Кнопка prompt JS
     */
    public static String js_prompt_path = "//button[contains(@onclick,'jsPrompt()')]";
    /**
     *  Результат выполнения JS
     */
    public static String js_result_path = "//p[contains(@id,'result')]";
    //p[contains(@id,'result')]

    /**
     * Метод нажатия кнопки ок на алерте JS
     */
    public Heroku_login_page accept_js_alert()  {
        WebElement button =  set_element_visible(js_alert_path);
        button.click();
        driver.switchTo().alert().accept();
        WebElement result =  set_element_visible(js_result_path);

        Assertions.assertEquals("You successfully clicked an alert",result.getText());
        return new Heroku_login_page(driver);
    }

    /**
     * Метод нажатия кнопки ок на подтверждении JS
     */
    public Heroku_login_page accept_js_confirm()  {
        WebElement button =  set_element_visible(js_confirm_path);
        button.click();
        driver.switchTo().alert().accept();
        WebElement result =  set_element_visible(js_result_path);

        Assertions.assertEquals("You clicked: Ok",result.getText());
        return new Heroku_login_page(driver);
    }

    /**
     * Метод ввода значения в prompt JS
     */
    public Heroku_login_page insert_data_into_js_prompt(String js_prompt_input)  {
        WebElement button =  set_element_visible(js_prompt_path);
        button.click();

        Alert alert =driver.switchTo().alert();
        alert.sendKeys(js_prompt_input);
        alert.accept();

        WebElement result =  set_element_visible(js_result_path);
        Assertions.assertEquals("You entered: "+js_prompt_input,result.getText());
        return new Heroku_login_page(driver);
    }
}
