package pages.herokuapp.frames;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_iframes_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_iframes_page(WebDriver driver) {
        super(driver);
    }


    /**
     *  iframe
     */
    public static String iframe_path = "//iframe[contains(@class,'tox-edit-area__iframe')]";
    /**
     *  Текст из редактора в iframe
     */
    public static String text_editor_path = "//body[contains(@aria-label,'Rich Text Area. Press ALT-0 for help.')]";


    /**
     * Метод переключения на iframe
     */
    public Heroku_frames_page switch_to_iframe()  {
        WebElement iframe =  set_element_visible(iframe_path);
        driver.switchTo().frame(iframe);
        return new Heroku_frames_page(driver);
    }

    public Heroku_nested_frames_page get_text_iframe()  {

        switch_to_iframe();


        WebElement text_element =  set_element_visible(text_editor_path);
        Assertions.assertEquals("Your content goes here.", text_element.getText());
        System.out.println(text_element.getText());


        return new Heroku_nested_frames_page(driver);
    }
}
