package com.jsystems.qa.qaapi.model.specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import com.jsystems.qa.qaapi.model.configuration.ApiConfig;

import javax.security.auth.login.Configuration;

public class Specifications {

    public static RequestSpecification requestSpecBuilder() {
        return new RequestSpecBuilder()
//                .addHeader()
                .setContentType(ContentType.JSON)
                .setBaseUri(Configuration.BASE_URL)
                .setBasePath("/v2")
                .build();
    }

}