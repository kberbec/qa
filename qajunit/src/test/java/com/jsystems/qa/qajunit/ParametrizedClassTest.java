package com.jsystems.qa.qajunit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
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
}




