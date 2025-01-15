package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.herokuapp.Heroku_javascript_error_page;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage {

    /**
     * Основная переменная для хранения драйвера
     */
    public WebDriver driver;

    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    /**
     * Xpath
     */

    /**
     * Заголовок страницы
     */
    public static String title_path = "//h3";





    /**
     * Метод для возвращения элемента и проверки того, что элемент видно
     */
    public WebElement set_element_visible(String elementXpath)
    {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
        } catch (Exception e) {
            System.out.println("Элемент с xpath =\"" +elementXpath+  "\" не видно");
        }

        return driver.findElement(By.xpath(elementXpath));
    }


    /**
     * Метод для возвращения элемента и проверки того, что элемент видно с изменяющимся xpath
     */
    public  WebElement set_element_visible(String elementXpath, String ... xpathParameter )
    {

        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(elementXpath, xpathParameter))));
        } catch (Exception e) {
            System.out.println("Элемент с xpath =\"" +String.format(elementXpath, xpathParameter)+  "\" не видно");
        }

        return driver.findElement(By.xpath(String.format(elementXpath, xpathParameter)));
    }

    /**
     * Метод для возвращения элементов и проверки того, что элементы видно
     */
    public List<WebElement> set_elements_visible(String elementXpath)
    {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
        } catch (Exception e) {
            System.out.println("Элементов с xpath =\"" +elementXpath+  "\" не видно");
        }

        return driver.findElements(By.xpath(elementXpath));
    }

    /**
     * Метод для возвращения элементов и проверки того, что элементы видно с изменяющимся xpath
     */
    public List<WebElement> set_elements_visible(String elementXpath, String ... xpathParameter)
    {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(elementXpath, xpathParameter))));
        } catch (Exception e) {
            System.out.println("Элементов с xpath =\"" +elementXpath+  "\" не видно");
        }

        return driver.findElements(By.xpath(elementXpath));
    }

    /**
     * Метод для проверки того, что элемент не видно
     */
    public boolean element_visible (String elementXpath) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
        } catch (Exception e) {
            System.out.println("Элемент с xpath = \"" +elementXpath+  "\" не видно");
            return false;
        }
        return true;
    }

    /**
     * Метод для проверки того, что элемент не видно с изменяющимся xpath
     */
    public boolean element_visible (String elementXpath, String ... xpathParameter) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(elementXpath, xpathParameter))));
        } catch (Exception e) {
            System.out.println("Элемент с xpath = \"" +String.format(elementXpath, xpathParameter)+  "\" не видно");
            return false;
        }
        return true;
    }
    /**
     * Метод для проверки того, что элемент не видно
     */
    public boolean element_invisible (String elementXpath)
    {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementXpath)));
        } catch (Exception e) {
            System.out.println("Элемент с xpath = \"" +elementXpath+  "\" видно");
            return false;
        }

        return true;
    }
    /**
     * Метод для проверки того, что алерт  видно
     */
    public boolean alert_visible ()
    {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        }
        catch (Exception e)
        {
            System.out.println("Алерт не виден");
            return false;
        }

        return true;
    }
    /**
     * Метод для проверки того, что алерт не видно
     */
    public boolean alert_invisible ()
    {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
        } catch (Exception e) {
            System.out.println("Алерт виден");
            return false;
        }

        return true;
    }

    /**
     * Метод для проверки того, что элемент не видно с изменяющимся xpath
     */
    public boolean element_invisible (String elementXpath, String ... xpathParameter)
    {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(String.format(elementXpath, xpathParameter))));
        } catch (Exception e) {
            System.out.println("Элемент с xpath= " +elementXpath+  " видно");
            return false;
        }

        return true;
    }
    /**
     * Метод для перемещения мышки к указанному элементу
     */
    public void moveTo (WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void get_all_level_logs() {
        Set<String> logtyp = driver.manage().logs().getAvailableLogTypes();
        for (String s : logtyp) {
            System.out.println(s);
        }
        LogEntries logEntries = driver.manage().logs().get(LogType.PERFORMANCE);
        List<LogEntry> lg = logEntries.getAll();
        for (LogEntry logEntry : lg) {
            System.out.println(logEntry);

        }
    }





}
