package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;

public class SessionJsonObject extends BaseJsonObject {

//	{"sessid":"853c6c7f6eaa051724080dff202eeec0","session_name":"SESS8b1f176c338bbcc3922a56004cec3c41","user":{"uid":"1","name":"admin","pass":"1a1dc91c907325c69271ddf0c944bc72","mail":"kyle@workhabit.com","mode":"0","sort":"0","threshold":"0","theme":"","signature":"","signature_format":"0","created":"1286571725","access":"1294794381","login":1294794548,"status":"1","timezone":null,"language":"","picture":"","init":"kyle@workhabit.com","data":"a:0:{}","roles":{"2":"authenticated user"}}}
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
