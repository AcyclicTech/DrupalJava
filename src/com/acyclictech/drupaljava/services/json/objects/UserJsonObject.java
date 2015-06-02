package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;

public class UserJsonObject extends BaseJsonObject {
//{"uid":"1","name":"admin","pass":"1a1dc91c907325c69271ddf0c944bc72","mail":"kyle@workhabit.com","mode":"0",
	//"sort":"0","threshold":"0","theme":"","signature":"","signature_format":"0","created":"1286571725",
	//"access":"1294792121","login":"1293782855","status":"1","timezone":null,"language":"","picture":"",
	//"init":"kyle@workhabit.com","data":"a:0:{}","roles":{"2":"authenticated user"}}
	
	public static final String UID = "uid";
	public static final String NAME = "username";
	public static final String PASS = "password";
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
	
	public UserJsonObject(JSONObject jsonObject) {
		super(jsonObject);
	}

	public void setUid(String uid){
		try {
			jsonObj.put(UID, uid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUid(){
		return jsonObj.optString(UID, "");
	}
	
	public void setName(String name){
		try {
			jsonObj.put(NAME, name);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getName(){
		return jsonObj.optString(NAME, "");
	}
	
	public void setPassword(String pass){
		try {
			jsonObj.put(PASS, pass);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getPassword(){
		return jsonObj.optString(PASS, "");
	}
	
	public void setMail(String mail){
		try {
			jsonObj.put(MAIL, mail);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getMail(){
		return jsonObj.optString(MAIL, "");
	}
	
	public void setSort(String sort){
		try {
			jsonObj.put(SORT, sort);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSort(){
		return jsonObj.optString(SORT, "");
	}
	
	public void setThreshold(String threshold){
		try {
			jsonObj.put(THRESHOLD, threshold);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getThreshold(){
		return jsonObj.optString(THRESHOLD, "");
	}
	
	public void setTheme(String theme){
		try {
			jsonObj.put(THEME, theme);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTheme(){
		return jsonObj.optString(THEME, "");
	}
	
	public void setSignature(String signature){
		try {
			jsonObj.put(SIGNATURE, signature);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSignature(){
		return jsonObj.optString(SIGNATURE, "");
	}
	
	public void setSignatureFormate(String signatureFormat){
		try {
			jsonObj.put(SIGNATURE_FORMAT, signatureFormat);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSignatureFormate(){
		return jsonObj.optString(SIGNATURE_FORMAT, "");
	}
	
	public void setCreated(String created){
		try {
			jsonObj.put(CREATED, created);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCreated(){
		return jsonObj.optString(CREATED, "");
	}
	
	public void setLastAccess(String access){
		try {
			jsonObj.put(ACCESS, access);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getLastAccess(){
		return jsonObj.optString(ACCESS, "");
	}
	
	public void setLastLogin(String login){
		try {
			jsonObj.put(LOGIN, login);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getLastLogin(){
		return jsonObj.optString(LOGIN, "");
	}
	
	public void setStatus(String status){
		try {
			jsonObj.put(STATUS, status);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getStatus(){
		return jsonObj.optString(STATUS, "");
	}
	
	public void setTimeZone(String timezone){
		try {
			jsonObj.put(TIMEZONE, timezone);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTimeZone(){
		return jsonObj.optString(TIMEZONE, "");
	}
	
	public void setLanguage(String language){
		try {
			jsonObj.put(LANGUAGE, language);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getLanguage(){
		return jsonObj.optString(LANGUAGE, "");
	}
	
	public void setInit(String init){
		try {
			jsonObj.put(INIT, init);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getInit(){
		return jsonObj.optString(INIT, "");
	}
	
	public void setData(String data){
		try {
			jsonObj.put(DATA, data);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getData(){
		return jsonObj.optString(DATA, "");
	}
	
	public void setRoles(String roles){
		try {
			jsonObj.put(ROLES, roles);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getRoles(){
		return jsonObj.optString(ROLES, "");
	}
}
