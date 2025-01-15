package pages.herokuapp;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import pages.BasePage;

import java.util.List;
import java.util.Set;

public class Heroku_javascript_error_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_javascript_error_page(WebDriver driver) {
        super(driver);
    }
    /**
     * Метод получения логов из браузера
     */
    public Heroku_javascript_error_page get_all_level_logs_js() {
        Set<String> logtyp = driver.manage().logs().getAvailableLogTypes();
        for (String s : logtyp) {
            System.out.println(logtyp);
        }
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> lg = logEntries.getAll();
        for (LogEntry logEntry : lg) {
            System.out.println(logEntry);

        }
        return new Heroku_javascript_error_page(driver);
    }

}
