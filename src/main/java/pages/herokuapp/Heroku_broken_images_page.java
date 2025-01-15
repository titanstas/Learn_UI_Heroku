package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Heroku_broken_images_page extends BasePage {

    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_broken_images_page(WebDriver driver) {
        super(driver);
    }


    /**
     * Картинка
     */
    public static String image_path = "//img";




    /**
     * Метод поиска сломанных картинок
     */
    public void find_broken_image()
    {
        for (WebElement image : set_elements_visible(image_path))
        {
            if (isImageBroken(image))
            {
                System.out.println("Сломанная картинка " +image.getAttribute("src"));
            }

        }
    }
    /**
     * Метод получения информации, является ли картинка сломанной
     */
    public boolean isImageBroken(WebElement image)
    {
        return  image.getAttribute("naturalWidth").equals("0") ||
                image.getAttribute("naturalHeight").equals("0");

    }
}
