package com.example;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RestAssuredTest extends BaseTest {



    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://httpbin.org";
    }

    @Test
    public void getTest() {
        sendGet(request)
                .then().statusCode(200)
//                .assertThat()
//                .body("url", equals("https://httpbin.org/get"))
                .log().all()/*.ifError()*/;
    }

    @Step("Send {httpbin}/get")
    public Response sendGet(RequestSpecification requestSpecification) {
        return requestSpecification.when().log().all().get("/get");
    }
}
