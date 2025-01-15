package pages.herokuapp.shifting_content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class Heroku_shifting_content_list_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_shifting_content_list_page(WebDriver driver) {
        super(driver);
    }
    /**
     *  Элемент содержащий изменяющиеся тексты
     */
    public static String shifting_text_list_path = "//div[contains(@class,'large-6 columns large-centered')]";


    /**
     * Метод получения изменяющегося текста
     */
    public String get_shifting_text_attribute(String text_to_find)  {
       WebElement  text_element = set_element_visible(shifting_text_list_path);
        int begin_index = text_element.getText().indexOf(text_to_find);
        String search_text = text_element.getText().substring(begin_index,begin_index+text_to_find.length());
        System.out.println(search_text);

        return search_text;
    }
}
