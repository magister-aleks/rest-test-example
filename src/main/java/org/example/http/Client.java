package org.example.http;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
//import org.springframework.stereotype.Service;

//@Service
public class Client {

    /**
     * Создаем базовую спецификацию, логирование только при наличи ошибок
     * @return RequestSpecification
     */
    public static RequestSpecification specification() {
        return RestAssured.given().filter(new AllureRestAssured()).log().ifValidationFails();
    }

}
