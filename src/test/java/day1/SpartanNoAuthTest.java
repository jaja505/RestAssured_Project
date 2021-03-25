package day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import test_util.SpartanNoAuthBaseTest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


@DisplayName("Spartan app get Request")
public class SpartanNoAuthTest extends SpartanNoAuthBaseTest {

    //"http://34.229.69.26:8000/api/spartans"



    @Test
    public void sayHello(){
        get("/hello").prettyPeek();

    }


    @Test
    public void getAllSpartans() {

        get("/spartans").prettyPeek();

    }


}
