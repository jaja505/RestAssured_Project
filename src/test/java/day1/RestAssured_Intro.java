package day1;

import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

@DisplayName("Intro to RestAssured")
public class RestAssured_Intro {

    @DisplayName("Testing Hello endpoint")
    @Test
    public void testHelloEndPoint(){

        //http://34.229.69.26:8000/api

       Response response =   get("http://34.229.69.26:8000/api/hello");
       //extracting information from Response object
        System.out.println("response.statusCode() = " + response.statusCode());

        System.out.println("response.getHeader(\"Content-Type\") = " + response.getHeader("Content-Type"));

        System.out.println("response.asString() = " + response.asString());

        assertThat(response.statusCode(),is(200));
        assertThat(response.getHeader("Content-Type"),is("text/plain;charset=UTF-8"));
        assertThat(response.contentType(),startsWith("text/plain"));
        assertThat(response.asString(),is(equalToIgnoringCase("Hello from Sparta")));

        System.out.println("response.header(\"Date\") = " + response.header("Date"));

        System.out.println("response.time() = " + response.time());
        System.out.println("response.getTime() = " + response.getTime());

        System.out.println("==================================================");
        response.prettyPrint();
        System.out.println("==================================================");
        response.prettyPeek();
    }

    @DisplayName("Testing Get/apia/spartans/{id}")
    @Test
    public void testSingleSpartan(){

        //get("http://34.229.69.26:8000/api/spartans/1");
        Response response = get("http://34.229.69.26:8000/api/spartans/1").prettyPeek();

        assertThat(response.statusCode(), is(equalTo(200)));
        assertThat(response.contentType(),is("application/json"));
        assertThat(response.header("Connection"),is("keep-alive"));

        //getting the field value of Json Body
       // System.out.println("response.asString() = " + response.asString());

        System.out.println("====================================================");
        System.out.println("response.path(\"id\") = " + response.path("id"));
        System.out.println("response.path(\"name\") = " + response.path("name"));
        System.out.println("response.path(\"gender\") = " + response.path("gender"));




    }



}
