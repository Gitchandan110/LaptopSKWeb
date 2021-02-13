package com.TestNGScript.file;

import org.testng.annotations.Test;

import com.Commonutills.file.ApiPayLoad;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class SK_ThermalCameraAPI extends ApiPayLoad{
	
	@Test
	
	public void ThermalRequest() {
		
		
		JSONObject Postrequest=new JSONObject(PostRequestBody());
		System.out.println(Postrequest.toJSONString());
		
		given().
		header("Content-Type", "application/json").header
		("Authorization", "Basic Tk9QRFFJSHJieHFUanVOOk1ndEYxeElHY09WZUdvZzVzWnJoa3BmeVNsRG01WFpmekNlYkRMOVJO").
		body(Postrequest.toJSONString()).
		when().post("https://safety-test.kuvrr.com/api/v1/callbacks/FaceMaskThermalScanRecord/").
		then().statusCode(200);
		
		
	}
	
	
	

}