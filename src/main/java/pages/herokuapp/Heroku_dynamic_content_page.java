package pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class Heroku_dynamic_content_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_dynamic_content_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Картинка имперского солдата
     */
    public static String empire_soldier_img_path = "//img[contains(@src, '/img/avatars/Original-Facebook-Geek-Profile-Avatar-6.jpg')]";
    /**
     * Картинки
     */


    /**
     *Адрес картинки имперского солдата
     */
    public static String empire_soldier_img_src = "https://the-internet.herokuapp.com/img/avatars/Original-Facebook-Geek-Profile-Avatar-6.jpg";




    public static String images = "//div[contains(@class, 'large-2 columns')]/img";

    public void search_empire_soldier()
    {
        List <WebElement> elements = set_elements_visible(images);
        List<String> image_sources = elements.stream().map(x-> x.getAttribute("src")).toList();
        for (int i = 0; i < image_sources.size(); i++) {
            if (image_sources.get(i).equalsIgnoreCase(empire_soldier_img_src))
            {
                System.out.println("Имперский солдат найден на картинке номер "+ (i+1));
            }
            else {
                System.out.println("Имперского солдата нет на картинке номер "+(i+1));
            }
        }


    }
}
