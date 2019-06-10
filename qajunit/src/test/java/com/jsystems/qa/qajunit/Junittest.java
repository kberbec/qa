package com.jsystems.qa.qajunit;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class Junittest {

    final String stringTestowy = "stringTestowy";
    final String testowy = null;

    @Test
    @DisplayName("First test")
//    @Disabled("first unit test")
    @Tag("All")
    public void firstTest(){


        assertTrue(true, "message for test result");
        assertTrue(stringTestowy.equals("stringTestowy"), "message for test result");
        assertTrue(5==2+3, "Message for testresult");
        assertTrue(true);
        assertFalse(false);
        assertFalse(stringTestowy.matches("^s"));
        assertEquals("stringTestowy", stringTestowy);
//        assertNotNull(testowy);
        assertSame("stringTestowy", stringTestowy);
//        assertThat();

    }

    @Test
    @DisplayName("SEC TEST")
    @Tag("All")
    @RepeatedTest(value=5, name="Repeated test")
    public void secondTest() {
        assertThat(stringTestowy).isEqualTo("stringTestowy");
        System.out.println(0.2*0.2);
        assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);
//        assertTrue(0.2*0.2==0.4);

    }


    @Test
    @DisplayName("arry test")
    public void arryTest(){

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5);

        assertTrue(list1.containsAll(list2));
        assertThat(list1).hasSize(5);
        assertThat(list2).containsAnyOf(1,2,3,4,5,6,7,8);


    }

    @Nested
    @DisplayName("nested class test")
    public class NestedSuiteClassTest
    {
        final String stringTestowy= "stringTestowy";
        public void nestedTest(){

            assertThat(stringTestowy).isEqualTo("stringTestowy");
        }
    }
}