package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;

public class UserJsonObject extends BaseJsonObject {
//{"uid":"1","name":"admin","pass":"1a1dc91c907325c69271ddf0c944bc72","mail":"kyle@workhabit.com","mode":"0",
	//"sort":"0","threshold":"0","theme":"","signature":"","signature_format":"0","created":"1286571725",
	//"access":"1294792121","login":"1293782855","status":"1","timezone":null,"language":"","picture":"",
	//"init":"kyle@workhabit.com","data":"a:0:{}","roles":{"2":"authenticated user"}}
	
	public static final String UID = "uid";
	public static final String NAME = "name";
	public static final String PASS = "pass";
	public static final String MAIL = "mail";
	public static final String MODE = "mode";
	public static final String SORT = "sort";
	public static final String THRESHOLD = "threshold";
	public static final String THEME = "theme";
	public static final String SIGNATURE = "signature";
	public static final String SIGNATURE_FORMAT = "signature_format";
	public static final String CREATED = "created";
	public static final String ACCESS = "access";
	public static final String LOGIN = "login";
	public static final String STATUS = "status";
	public static final String TIMEZONE = "timezone";
	public static final String LANGUAGE = "language";
	public static final String PICTURE = "picture";
	public static final String INIT = "init";
	public static final String DATA = "data";
	public static final String ROLES = "roles";

	public UserJsonObject(){
		jsonObj = new JSONObject();
	}
	
	public UserJsonObject(String uid, String name, String pass, String mail, String sort, String threshold,
			String theme, String signature, String signatureFormat, String created, String access, String login,
			String status, String timezone, String language, String picture, String init, String data, String roles){
		this();
		try{
			jsonObj.put(UID, uid);
			jsonObj.put(NAME, name);
			jsonObj.put(PASS, pass);
			jsonObj.put(MAIL, mail);
			jsonObj.put(SORT, sort);
			jsonObj.put(THRESHOLD, threshold);
			jsonObj.put(THEME, theme);
			jsonObj.put(SIGNATURE, signature);
			jsonObj.put(SIGNATURE_FORMAT, signatureFormat);
			jsonObj.put(CREATED, created);
			jsonObj.put(ACCESS, access);
			jsonObj.put(LOGIN, login);
			jsonObj.put(STATUS, status);
			jsonObj.put(TIMEZONE, timezone);
			jsonObj.put(LANGUAGE, language);
			jsonObj.put(PICTURE, picture);
			jsonObj.put(INIT, init);
			jsonObj.put(DATA, data);
			jsonObj.put(ROLES, roles);
		}catch(JSONException e){
			e.printStackTrace();
		}
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(UID, uid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(NAME, name);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(PASS, pass);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(MAIL, mail);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(SORT, sort);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(THRESHOLD, threshold);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(THEME, theme);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(SIGNATURE, signature);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(SIGNATURE_FORMAT, signatureFormat);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(CREATED, created);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(ACCESS, access);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(LOGIN, login);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(STATUS, status);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(TIMEZONE, timezone);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(LANGUAGE, language);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(SESSID, "");
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
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(INIT, sessId);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(INIT, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(DATA, sessId);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(DATA, "");
	}
	
	public void setSessId(String sessId){
		try {
			jsonObj.put(ROLES, sessId);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSessId(){
		return jsonObj.optString(ROLES, "");
	}
}
