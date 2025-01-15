package herokuapp;

import helpers.Drivers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTests {


    /**
     * Основная переменная для хранения драйвера
     */
    WebDriver driver;


    /**
     * Метод для инициализации драйвера из класса Drivers, максимизации окна и установки неявных ожиданий перед каждым тестом
     */
    @BeforeEach
    public void before(){

        driver = Drivers.Setdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);




    }
//    /**
//     * Метод для закрытия браузера после каждого теста
//     */
//    @AfterEach
//    public void after(){
//        driver.quit();
//    }





}
