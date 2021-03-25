package day1;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;

public class HamcrestMatchersIntro {


    @Test
    public void simpleTest1() {

        // assert 10  equal to 5+5
        // this is the syntax for hamcrest way of assertion
        // assertThat( some actual value , some matcher that describe what you are trying to do)
        assertThat(5 + 5, is(10));
        assertThat(5 + 5, equalTo(10));
        // All matchers has 2 overloaded version
        //first that accept actual value
        //second that accept another matchers
        // below examples is method is accepting another matcher equalTo to make it readable
        assertThat(5 + 5, is(equalTo(10)));


        //negative assertion 5+5 not 11
        assertThat(5 + 5, not(11));
        assertThat(5 + 5, is(not(11)));
        assertThat(5 + 5, is(not(equalTo(11))));

        //number comparison
        // greaterThan()
        assertThat(5 + 5, is(greaterThan(9)));

        //lessThan()
        assertThat(5 + 5, is(lessThan(15)));

        // greaterThanOrEqualTo()
        assertThat(5 + 5, is(greaterThanOrEqualTo(9)));

        //lessThanOrEqualTo()
        assertThat(5 + 5, is(lessThanOrEqualTo(14)));

    }

    @DisplayName("Matchers related to Strings")
    @Test
    public void StringMatchers(){

        String msg = "B21 is learning Hamcrest";

        assertThat(msg,equalTo("B21 is learning Hamcrest"));
        assertThat(msg, is("B21 is learning Hamcrest"));
        assertThat(msg,is(equalTo("B21 is learning Hamcrest")));

        // check if this msg start with B21

        assertThat(msg, startsWithIgnoringCase("B21"));

        assertThat(msg, startsWith("B21"));

        assertThat(msg, endsWith("Hamcrest"));
        assertThat(msg,endsWithIgnoringCase("CREST"));


        assertThat(msg, containsStringIgnoringCase("learning"));
        assertThat(msg, containsString("learning"));

        String str = "   ";
        assertThat(str, is(blankOrNullString()));


        assertThat(str.trim(), is(emptyString()));

    }

    @DisplayName("Hamcrest support for Collecction")
    @Test
    public void testCollection(){

        List<Integer> list = Arrays.asList(1,3,4,6,5,88,99,44,67);

        //checking the side of this list
        assertThat(list, hasSize(9));

        //checking if this list hasItem 7
        assertThat(list, hasItem(99));

        assertThat(list,hasItems(1,3,99));


        //check if everyitems is this list is greater than 0
        assertThat(list,everyItem(is(greaterThan(0))));



    }



}
