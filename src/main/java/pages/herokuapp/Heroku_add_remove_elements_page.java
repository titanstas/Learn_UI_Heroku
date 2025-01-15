package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_add_remove_elements_page extends BasePage {

    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_add_remove_elements_page(WebDriver driver) {
        super(driver);
    }




    /**
     * Кнопка добавления элемента
     */
    public static String add_element_path = "//button[contains(@onclick, 'addElement')]";

    /**
     * Кнопка удаления одного элемента
     */
    public static String remove_element_path = "//button[contains(@class, 'added-manually')]";





    /**
     * Метод добавления одного элемента
     */
    public Heroku_add_remove_elements_page add_element()
    {
        set_element_visible(add_element_path);
        WebElement adding_Element = set_element_visible(add_element_path);
        adding_Element.click();

        return new Heroku_add_remove_elements_page(driver);
    }

    /**
     * Метод добавления N элементов
     *
     * @return
     */
    public Heroku_add_remove_elements_page add_n_elements(int n)
    {

        WebElement adding_Element = set_element_visible(add_element_path);
        for (int i = 0; i < n; i++) {
            adding_Element.click();
        }
        return new Heroku_add_remove_elements_page(driver);
    }

    /**
     * Метод удаления одного элемента
     *
     * @return
     */
    public Heroku_add_remove_elements_page remove_element()
    {

        WebElement removing_element = set_element_visible(remove_element_path);;
        removing_element.click();

        return new Heroku_add_remove_elements_page(driver);
    }

    /**
     * Метод удаления N элементов
     *
     * @return
     */
    public Heroku_add_remove_elements_page remove_n_elements(int n)
    {

        WebElement removing_element = set_element_visible(remove_element_path);;
        for (int i = 0; i < n; i++) {
            removing_element.click();
        }

        return new Heroku_add_remove_elements_page(driver);

    }

    /**
     * Метод удаления всех элементов
     *
     */
    public Heroku_add_remove_elements_page remove_all_elements() {
        boolean elements_to_remove_is_displayed = true;

        while (elements_to_remove_is_displayed)
        {
            try {

                WebElement  removing_element = set_element_visible(remove_element_path);;
                removing_element.click();
            }
            catch (Exception e)
            {
                elements_to_remove_is_displayed=false;
            }

        }
        return new Heroku_add_remove_elements_page(driver);

    }
}
