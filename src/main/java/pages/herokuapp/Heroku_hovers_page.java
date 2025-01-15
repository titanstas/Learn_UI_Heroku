package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Heroku_hovers_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_hovers_page(WebDriver driver) {
        super(driver);
    }

    /**
     *  Картинки для наведения и получения данных пользователей
     */
    public static String users_avatars_path = "//div[contains(@class,'figure')]";
    /**
     *  Данные найденных пользователей
     */
    public static String users_data_path = "//div[contains(@class,'figcaption')]";


    /**
     * Метод ввода логина
     */
    public Heroku_hovers_page get_all_avatars ()  {
        List<WebElement> avatars =  set_elements_visible(users_avatars_path);
        Actions actions = new Actions(driver);
        List<String> users_text = new ArrayList<>();
        for (int i = 0; i < avatars.size(); i++) {
            actions.moveToElement(avatars.get(i)).build().perform();
            users_text.add(
                    avatars.get(i).findElements(By.xpath(users_data_path)).get(i).getText()
            );
        }

        for (int i = 0; i < users_text.size(); i++) {
            Assertions.assertTrue(
                    users_text.get(i).contains("user"+(i+1))
            );
        }

        //users_text.stream().forEach(x-> System.out.println(x));


        return new Heroku_hovers_page(driver);
    }
}
