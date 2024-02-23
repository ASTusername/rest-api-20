package com.demoqa.api;

import com.demoqa.models.CredentialsModel;
import com.demoqa.models.LoginResponseModel;

import static com.demoqa.data.UserData.PASSWORD;
import static com.demoqa.data.UserData.USERNAME;
import static com.demoqa.data.BaseURIs.loginURI;
import static com.demoqa.spec.Specifications.*;
import static io.restassured.RestAssured.given;

public class AuthorizationApi {

    public static LoginResponseModel login(){
        CredentialsModel credentialsModel = new CredentialsModel();
        credentialsModel.setUserName(USERNAME);
        credentialsModel.setPassword(PASSWORD);

        return
                given(mainRequest)
                        .body(credentialsModel)
                        .when()
                        .post(loginURI)
                        .then()
                        .spec(response200)
                        .extract().as(LoginResponseModel.class);
    }
}
