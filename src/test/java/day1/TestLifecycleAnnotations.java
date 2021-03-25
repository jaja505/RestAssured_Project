package day1;


import org.junit.jupiter.api.*;

@DisplayName("Learning Test LifeCycle Annotations")
public class TestLifecycleAnnotations {

    @BeforeAll
    public static void init (){
        System.out.println("Before all is running ");
    }

    @AfterAll
    public static void close(){
        System.out.println("After all is running ");
    }
    
    @BeforeEach
    public void initEach(){
        System.out.println("Before each is running");
    }

    @AfterEach
    public void tearDownEach(){
        System.out.println("TearDownEach is running");
    }


    @Test
    public void test1(){
        System.out.println("Test 1 is Running");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 is Running");
    }


}

/*These is the way it Runner

Before all is running
Before each is running
Test 1 is Running
TearDownEach is running
Before each is running
Test 2 is Running
TearDownEach is running
After all is running
 */
