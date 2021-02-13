package com.Commonutills.file;

import java.util.HashMap;
import java.util.Map;

public class ApiPayLoad  {
	
	
	public Map<String, String>headersWithToken(){
		
		Map<String, String>defaultHeaders=new HashMap<String, String>();
		
		defaultHeaders.put("Content-Type", "application/json");
		
		defaultHeaders.put("Authorization", "Basic T1BEUUlIcmJ4cVRqdU46TWd0RjF4SUdjT1ZlR29nNXNacmhccGZ5U2xEbTVYWmZ6Q2ViREw5Ug==");
		
		return defaultHeaders;
		
	}
	
	
	
	public Map<String, String>PostRequestBody(){
		
		Map<String, String>body=new HashMap<String, String>();
		
		body.put("eventTime", "Tue Oct 12 10:03:20 CDT 2020");
		body.put("faceTemperature", "101");
		body.put("description", "id=591");
		body.put("alertImage", "");
		body.put("faceTargetFile", "");
		body.put("cameraName", "CkThermal");
		return body;
		
	}
	
	
}
