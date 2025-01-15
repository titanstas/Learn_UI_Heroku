package pages.herokuapp;


import api.data.Edits_request;
import api.data.Edits_response;
import org.Stas.Secrets;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static api.specification.Specification.*;
import static io.restassured.RestAssured.given;

public class Heroku_typos_page extends BasePage {
    /**
     * Конструктор для присвоения значения переменной драйверу в этом классе, из драйвера класса BaseTests
     *
     * @param driver
     */
    public Heroku_typos_page(WebDriver driver) {
        super(driver);
    }


    /**
     *  Кнопка редактирования элемента таблицы в 6ом столбце Action
     */
    public static String element_with_typos = "//p[2]";

    /**
     *  Метод проверки предложения на английском языке
     */
    public void check_typos () {
        WebElement text_element =  set_element_visible(element_with_typos);
        String text = text_element.getText();
       // System.out.println(text);




        String url = "https://api.sapling.ai/api/v1/edits";
        String key = Secrets.Api_key;

        String params = "{\"key\":\""+key+"\", \"text\":\""+text+"\", \"session_id\":\"check_typos\"}";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(params))
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
    /**
     *  Метод проверки предложения на английском языке с использованием RestAssured
     */
    public void check_typos2 () {
        WebElement text_element =  set_element_visible(element_with_typos);
        String text = text_element.getText();


        String key = Secrets.Api_key;

        installSpec(requestSpec());
        installSpec(responseSpec200());

        Edits_request request = new Edits_request(key , text, "test_session" );
        Edits_response response = given()
                .body(request)
                .when()
                .post("api/v1/edits")
                .then()
                .log().body()
                .extract().as(Edits_response.class);

        deleteSpec();
    }
}
