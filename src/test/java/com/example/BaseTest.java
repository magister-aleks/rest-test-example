package com.example;


import io.restassured.specification.RequestSpecification;
import org.example.http.Client;

public class BaseTest {

    public final RequestSpecification request = Client.specification();
}
