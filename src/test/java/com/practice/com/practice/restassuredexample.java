package com.practice.com.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class restassuredexample {
    @Test
    public void UserRegistrationSuccessful() {
        RestAssured.baseURI ="https://demoqa.com";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("UserName", "test_rest");
        requestParams.put("Password", "rest@123");
        request.body(requestParams.toString());
        Response response = request.post("/Account/v1/User");
        ResponseBody body = response.getBody();
// Deserialize the Response body into JSONSuccessResponse
       // JSONSuccessResponse responseBody = body.as(JSONSuccessResponse.class);
// Use the JSONSuccessResponseclass instance to Assert the values of Response.
        //Assert.assertEquals("OPERATION_SUCCESS", );
        //Assert.assertEquals("Operation completed successfully", responseBody.Message);
        //
        }
}
