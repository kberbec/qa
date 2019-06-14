package com.jsystems.qa.qaapi.model.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponce {
    @JsonProperty("Error")
    public ErrorBody error;

    public static class ErrorBody {
        @JsonProperty ("error.code")
                public int errorCode;

        @JsonProperty ("Validation.error")
                public String validationError;
        public String message;

    }

}
