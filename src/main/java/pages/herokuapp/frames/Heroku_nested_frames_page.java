package pages.herokuapp.frames;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_nested_frames_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_nested_frames_page(WebDriver driver) {
        super(driver);
    }


    /**
     *  Элемент с текстом
     */
    public static String text_element_path = "//body";
    /**
     *  Верхний frame
     */
    public static String top_frame_path = "//frame[contains(@name,'frame-top')]";
    /**
     *  Нижний frame
     */
    public static String bottom_frame_path = "//frame[contains(@name,'frame-bottom')]";
    /**
     *  Левый верхний frame
     */
    public static String left_top_frame_path = "//frame[contains(@name,'frame-left')]";
    /**
     *  Средний верхний frame
     */
    public static String middle_top_frame_path = "//frame[contains(@name,'frame-middle')]";
    /**
     *  Правый верхний frame
     */
    public static String right_top_frame_path = "//frame[contains(@name,'frame-right')]";


    /**
     * Метод перехода на верхний внешний фрейм
     */
    public Heroku_nested_frames_page switch_to_top_frame()  {
        WebElement frame =  set_element_visible(top_frame_path);
        driver.switchTo().frame(frame);

        return new Heroku_nested_frames_page(driver);
    }

    /**
     * Метод перехода на левыйц верхний внешний фрейм
     */
    public Heroku_nested_frames_page switch_to_left_top_frame()  {
        WebElement left_frame =  set_element_visible(left_top_frame_path);
        driver.switchTo().frame(left_frame);

        return new Heroku_nested_frames_page(driver);
    }

    /**
     * Метод перехода на средний верхний внешний фрейм
     */
    public Heroku_nested_frames_page switch_to_right_top_frame()  {
        WebElement left_frame =  set_element_visible(middle_top_frame_path);
        driver.switchTo().frame(left_frame);

        return new Heroku_nested_frames_page(driver);
    }

    /**
     * Метод перехода на средний верхний внешний фрейм
     */
    public Heroku_nested_frames_page switch_to_middle_top_frame()  {
        WebElement left_frame =  set_element_visible(middle_top_frame_path);
        driver.switchTo().frame(left_frame);

        return new Heroku_nested_frames_page(driver);
    }

    /**
     * Метод перехода на нижний внешний фрейм
     */
    public Heroku_nested_frames_page switch_to_bottom_frame()  {
        WebElement frame =  set_element_visible(bottom_frame_path);
        driver.switchTo().frame(frame);

        return new Heroku_nested_frames_page(driver);
    }


    /**
     * Метод получения текста из левого frame
     */
    public Heroku_nested_frames_page get_text_left_top_frame()  {

        switch_to_top_frame();
        switch_to_left_top_frame();

        WebElement text_element =  set_element_visible(text_element_path);
        Assertions.assertEquals("LEFT", text_element.getText());
        System.out.println(text_element.getText());


        return new Heroku_nested_frames_page(driver);
    }

    /**
     * Метод получения текста из нижнего frame
     */
    public Heroku_nested_frames_page get_text_bottom_frame()  {

        switch_to_bottom_frame();


        WebElement text_element =  set_element_visible(text_element_path);
        Assertions.assertEquals("BOTTOM", text_element.getText());
        System.out.println(text_element.getText());


        return new Heroku_nested_frames_page(driver);
    }
}
