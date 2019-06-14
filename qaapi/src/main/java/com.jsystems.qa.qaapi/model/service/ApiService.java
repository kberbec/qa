package com.jsystems.qa.qaapi.model.service;

import com.jsystems.qa.qaapi.model.model.error.ErrorResponce;
import com.jsystems.qa.qaapi.model.model.user.MyUser;
import com.jsystems.qa.qaapi.model.model.user.User;
import io.restassured.RestAssured;

import java.util.List;

public class ApiService {
   private static final String USERS_LIST = "/5a6a58222e0000d0377a7789";
   private static final String USER = "/5a6b69ec3100009d211b8aeb";
    public static final String ERROR_URL = "/5a690b452e000054007a73cd";
    public static final String POST_URL = "/5a690a1b2e000051007a73cb";

    public static List<User> getuser(){
        return  RestAssured

                .given()
           //     .get("http://www.mocky.io/v2/5a6a58222e0000d0377a7789")
                .get(USERS_LIST)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .getList("", User.class);

    }


    public static List<User> getuser(){
        return  RestAssured

                .given()
                //     .get("http://www.mocky.io/v2/5a6a58222e0000d0377a7789")
                .queryParam("name","Kowalski")
                .get(USER)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .getList("", User.class);

    }

    public static ErrorResponce getErrorResponce(){
    return RestAssured
            .given()
            .spec()
            .when()
            .get(ERROR_URL)
            .then()
            .assertThat()
            .statusCode(400)
            .extract()
            .asErrorCodeResponce
    }
}