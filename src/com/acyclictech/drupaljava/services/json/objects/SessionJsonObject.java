package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;

public class SessionJsonObject extends BaseJsonObject {

	
/**{"token":"6eS5kbUE0b1SKl9O4ZbWlNRoLXaoe0S3RObSNMmrWAE",
	"session_name":"SESS8c4502931ff278cca5bc749acc34866c",
	"sessid":"UdLpVYZwntkck4AK8j2BGb0NIVN3IEJIcTQSI4kFcWY",
	"user":
		{"uid":"1",
		"mail":"jon@localhost.com",
		"status":"1",
		"theme":"",
		"data":false,
		"init":"jon@localhost.com",
		"access":"1433247951",
		"picture":"0",
		"timezone":"America/Denver",
		"created":"1422817623",
		"roles":
			{"2":"authenticated user"},
		"name":"jon",
		"login":1433248227,
		"language":"",
		"signature":"",
		"signature_format":"plain_text"}}
	*/
	public static final String SESSID = "sessid";
	public static final String SESSION_NAME = "session_name";
	public static final String USER = "user";

	public SessionJsonObject(){
		jsonObj = new JSONObject();
	}

	public SessionJsonObject(JSONObject userObj){
		jsonObj = userObj;
	}
	
	public SessionJsonObject(String sessid, String sessionName, UserJsonObject userObj){
		this();
		try{
			jsonObj.put(SESSID, sessid);
			jsonObj.put(SESSION_NAME, sessionName);
			jsonObj.put(USER, userObj.toString());
		}catch(JSONException e){
			e.printStackTrace();
		}
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(SESSID, sessId);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}

	public void setSessionName(String sessionName){
		try {
			jsonObj.put(SESSION_NAME, sessionName);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessionName(){
		return jsonObj.optString(SESSION_NAME, "");
	}

	public void setUser(UserJsonObject userObj){
		try {
			jsonObj.put(USER, userObj.getJsonObject());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public JSONObject getUser(){
		return jsonObj.optJSONObject(USER);
	}
}
