package day1;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


//setting display name of the test class in test result using @DisplayName
@DisplayName("Day 1 of Junit5 Test")
public class Junit5_intro {

    @DisplayName("Testing Numbers")
    @Test
    public void test(){
        System.out.println("Learning JUnit5");

        assertEquals(1,2);
    }

    @DisplayName("Testing name start with J")
    @Test
    public void testName(){
        String name = "Jair";
        //assertEquals('A', name.charAt(0));
        assertTrue(name.startsWith("J"));

    }







}
