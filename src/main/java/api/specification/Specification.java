package api.specification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {
    /**
     * Метод для добавления спецификации запроса
     */
    public static RequestSpecification requestSpec() {
        return  new RequestSpecBuilder()
                .setBaseUri("https://api.sapling.ai/")
                .setContentType("application/json")
                .build();
    }
    /**
     * Метод для добавления спецификации ответа 200
     */
    public static ResponseSpecification responseSpec200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
    /**
     * Метод для установки спецификации запроса
     */
    public static void installSpec(RequestSpecification requestSpec){
        RestAssured.requestSpecification = requestSpec;
    }
    /**
     * Метод для установки спецификации ответа
     */
    public static void installSpec(ResponseSpecification responseSpec){
        RestAssured.responseSpecification = responseSpec;
    }
    /**
     * Метод для установки спецификации запроса и ответа
     */
    public static void installSpec(RequestSpecification requestSpec, ResponseSpecification responseSpec){
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = responseSpec;
    }
    /**
     * Метод для удаления спецификации
     */
    public static void deleteSpec() {
        RestAssured.requestSpecification = null;
        RestAssured.responseSpecification = null;
    }
}
