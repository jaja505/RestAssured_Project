package test_util;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public abstract class SpartanNoAuthBaseTest {

    @BeforeAll
    public static void init() {
        // this will et the part of URL at RestAssured
        baseURI = "http://34.229.69.26:8000";
        // port = 8000;
        basePath = "/api";
    }

    @AfterAll
    public static void cleanup(){
        RestAssured.reset();
    }
}
