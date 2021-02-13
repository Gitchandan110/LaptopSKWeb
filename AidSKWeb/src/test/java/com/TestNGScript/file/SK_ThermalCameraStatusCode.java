package com.TestNGScript.file;

import org.testng.annotations.Test;
import com.Commonutills.file.ApiPayLoad;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;

public class SK_ThermalCameraStatusCode extends ApiPayLoad {

	@Test

	public void ThermalRequest() {

		JSONObject Postrequest = new JSONObject(PostRequestBody());
		System.out.println(Postrequest.toJSONString());

		Response res=given()
		.header("Content-Type", "application/json")
		.header("Authorization", "Basic Tk9QRFFJSHJieHFUanVOOk1ndEYxeElHY09WZUdvZzVzWnJoa3BmeVNsRG01WFpmekNlYkRMOVJO")
		.body(Postrequest.toJSONString())
		.when()
		.post("https://safety-test.kuvrr.com/api/v1/callbacks/FaceMaskThermalScanRecord/")
		.then()
		.extract()
		.response();
		
		System.out.println("Post Response Status Code is :"+ res.statusCode());
		System.out.println("Post Response headers are :"+ res.headers());
		System.out.println("Post Response body are :"+ res.body());
		System.out.println("Post Response Time is :"+ res.timeIn(TimeUnit.MILLISECONDS)+ " milliseconds");
	
		
	

	}

}