package com.jsystems.qa.qajunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


@DisplayName("parametrized test")
public class ParametrizedClassTest {
    @DisplayName("First parametrized test")
    @ParameterizedTest(name = "Parametrized test with value (0)")
    @ValueSource(strings = {"Hello", "Hello, JUnit", "Hello Students"})
    public void paramSecondTest(String value) {

        assertTrue(value.contains("Hello"));
    }

    @DisplayName("CSV second parametrized test")
    @ParameterizedTest(name = "Parametrized test with value name {0} and value {1}")
    @CsvSource(value = {"Hello, 5", "Hello Unit 5, 15", "'Hello 5!', 25"}, delimiter = ',')
    public void paramMultiargTest(String param1, int param2) {

        assertTrue(param1.contains("Hello"));
        assertTrue(param2 % 5 == 0);
    }


    @DisplayName("CSV second parametrized test")
    @ParameterizedTest(name = "Parametrized test with value name {0} and value {1}")
    @CsvFileSource(resources = "/plik.csv", delimiter = ',')
    public void paramCsvMultiargTest(String param1, int param2) {
        assertTrue(param1.contains("Hello"));
        assertTrue(param2 % 5 == 0);
    }
}

