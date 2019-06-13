package com.jsystems.qa.qaapi;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("Api tests")
public class ApiTest {

    @Test
    public void firstAppTest(){

        RestAssured

                .given()
                .get("http://www.mocky.io/v2/5a6b69ec3100009d211b8aeb")
                .then()
                .assertThat()
                .statusCode(200 )
                .body("name", equalTo("Piotr"))
                .body("surname", equalTo("Kowalski"));
    }
    @Test
    public void nestedJsonTest(){

        RestAssured

                .given()
                .get("http://www.mocky.io/v2/5a6a58222e0000d0377a7789")
                .then()
                .assertThat()
                .statusCode(200 )
                .body("[0].name", equalTo("Piotr"))
                .body("[0].surname", equalTo("Kowalski"));
              //  .body("[0].device[0].device.model.produce"), equalTo("Kowalski"))
    }

}