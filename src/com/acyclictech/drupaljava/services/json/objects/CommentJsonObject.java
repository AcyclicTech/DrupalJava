package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;

public class CommentJsonObject extends BaseJsonObject {
	public static final String CID = "cid";
	public static final String PID = "pid";
	public static final String NID = "nid";
	public static final String UID = "uid";
	public static final String SUBJECT = "subject";
	public static final String COMMENT = "comment";
	public static final String HOSTNAME = "hostname";
	public static final String TIMESTAMP = "timestamp";
	public static final String STATUS = "status";
	public static final String FORMAT = "format";
	public static final String THREAD = "thread";
	public static final String NAME = "name";
	public static final String MAIL = "mail";
	public static final String HOMEPAGE = "homepage";
	
	public CommentJsonObject(){
		jsonObj = new JSONObject();
	}
	
	public CommentJsonObject(String cid, String pid, String nid, String uid, String subject, String comment,
			String hostName, String timeStamp, String status, String format, String thread, String name,
			String mail, String homePage){
		this();
		try {
			jsonObj.put(CID, cid);
			jsonObj.put(PID, pid);
			jsonObj.put(NID, nid);
			jsonObj.put(UID, uid);
			jsonObj.put(SUBJECT, subject);
			jsonObj.put(COMMENT, comment);
			jsonObj.put(HOSTNAME, hostName);
			jsonObj.put(TIMESTAMP, timeStamp);
			jsonObj.put(STATUS, status);
			jsonObj.put(FORMAT, format);
			jsonObj.put(THREAD, thread);
			jsonObj.put(NAME, name);
			jsonObj.put(MAIL, mail);
			jsonObj.put(HOMEPAGE, homePage);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setCid(String cid){
		try {
			jsonObj.put(CID, cid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCid(){
		return jsonObj.optString(CID, "");
	}

	public void setPid(String pid){
		try {
			jsonObj.put(PID, pid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getPid(){
		return jsonObj.optString(PID, "");
	}

	public void setNid(String nid){
		try {
			jsonObj.put(NID, nid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getNid(){
		return jsonObj.optString(NID, "");
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

	public void setSubject(String subject){
		try {
			jsonObj.put(SUBJECT, subject);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getSubject(){
		return jsonObj.optString(SUBJECT, "");
	}

	public void setComment(String comment){
		try {
			jsonObj.put(COMMENT, comment);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getComment(){
		return jsonObj.optString(COMMENT, "");
	}

	public void setHostName(String hostName){
		try {
			jsonObj.put(HOSTNAME, hostName);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHostName(){
		return jsonObj.optString(HOSTNAME, "");
	}

	public void setTimeStamp(String timeStamp){
		try {
			jsonObj.put(TIMESTAMP, timeStamp);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTimeStamp(){
		return jsonObj.optString(TIMESTAMP, "");
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

	public void setFormat(String format){
		try {
			jsonObj.put(FORMAT, format);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getFormat(){
		return jsonObj.optString(FORMAT, "");
	}

	public void setThread(String thread){
		try {
			jsonObj.put(THREAD, thread);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getThread(){
		return jsonObj.optString(THREAD, "");
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

	public void setHomePage(String homePage){
		try {
			jsonObj.put(HOMEPAGE, homePage);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHomePage(){
		return jsonObj.optString(HOMEPAGE, "");
	}
}
