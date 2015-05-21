package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;


public class NodeJsonObject extends BaseJsonObject {

	public static final String VID = "vid";
	public static final String UID = "uid";
	public static final String TITLE = "title";
	public static final String LOG = "log";
	public static final String STATUS = "status";
	public static final String COMMENT = "comment";
	public static final String PROMOTE = "promote";
	public static final String STICKY = "sticky";
	public static final String NID = "nid";
	public static final String TYPE = "type";
	public static final String LANGUAGE = "language";
	public static final String CREATED = "created";
	public static final String CHANGED = "changed";
	public static final String TNID = "tnid";
	public static final String TRANSLATE = "translate";
	public static final String REVISION_TIMESTAMP = "revision_timestamp";
	public static final String REVISION_UID = "revision_uid";
	public static final String CID = "cid";
	public static final String LAST_COMMENT_TIMESTAMP = "last_comment_timestamp";
	public static final String LAST_COMMENT_NAME = "last_comment_name";
	public static final String LAST_COMMENT_UID = "last_comment_uid";
	public static final String COMMENT_COUNT = "comment_count";
	public static final String NAME = "name";
	public static final String PICTURE = "picture";
	public static final String DATA = "data";
	public static final String PATH = "path";

	public NodeJsonObject(String vid, String uid, String title, String log, String status, String comment,
			String promote, String sticky, String nid, String type, String language, String created,
			String changed, String tnid, String translate, String revisionTimeStamp, String revisionUid,
			String cid ,String lastCommentTimeStamp, String lastCommentName, String lastCommentUid, String name,
			String picture, String data, String path){
		super();
		try{
			jsonObj.put(VID, vid);
			jsonObj.put(UID, uid);
			jsonObj.put(TITLE, title);
			jsonObj.put(LOG, log);
			jsonObj.put(STATUS, status);
			jsonObj.put(COMMENT, comment);
			jsonObj.put(PROMOTE, promote);
			jsonObj.put(STICKY, sticky);
			jsonObj.put(NID, nid);
			jsonObj.put(TYPE, type);
			jsonObj.put(LANGUAGE, language);
			jsonObj.put(CREATED, created);
			jsonObj.put(CHANGED, changed);
			jsonObj.put(TNID, tnid);
			jsonObj.put(REVISION_TIMESTAMP, revisionTimeStamp);
			jsonObj.put(REVISION_UID, revisionUid);
			jsonObj.put(CID, cid);
			jsonObj.put(LAST_COMMENT_TIMESTAMP, lastCommentTimeStamp);
			jsonObj.put(LAST_COMMENT_NAME, lastCommentName);
			jsonObj.put(LAST_COMMENT_UID, lastCommentUid);
			jsonObj.put(NAME, name);
			jsonObj.put(PICTURE, picture);
			jsonObj.put(DATA, data);
			jsonObj.put(PATH, path);
		}catch(JSONException e){
			e.printStackTrace();
		}
	}
	
	public NodeJsonObject(JSONObject obj) {
		super(obj);
	}

	public void setVid(String vid){
		try {
			jsonObj.put(VID, vid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getVid(){
		return jsonObj.optString(VID, "");
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

	public void setTitle(String title){
		try {
			jsonObj.put(TITLE, title);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getTitle(){
		return jsonObj.optString(TITLE, "");
	}

	public void setLog(String log){
		try {
			jsonObj.put(LOG, log);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getLog(){
		return jsonObj.optString(LOG, "");
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

	public void setPromote(String promote){
		try {
			jsonObj.put(PROMOTE, promote);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getPromote(){
		return jsonObj.optString(PROMOTE, "");
	}

	public void setStick(String sticky){
		try {
			jsonObj.put(STICKY, sticky);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getSticky(){
		return jsonObj.optString(STICKY, "");
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
	
	public void setType(String type){
		try {
			jsonObj.put(TYPE, type);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getType(){
		return jsonObj.optString(TYPE, "");
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
	
	public void setChanged(String changed){
		try {
			jsonObj.put(CHANGED, changed);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getChanged(){
		return jsonObj.optString(CHANGED, "");
	}
	
	public void setTnid(String tnid){
		try {
			jsonObj.put(TNID, tnid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTnid(){
		return jsonObj.optString(TNID, "");
	}
	
	public void setTranslate(String translate){
		try {
			jsonObj.put(TRANSLATE, translate);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTranslate(){
		return jsonObj.optString(TRANSLATE, "");
	}

	public void setRevisionTimeStamp(String revisionTimeStamp){
		try {
			jsonObj.put(REVISION_TIMESTAMP, revisionTimeStamp);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getRevisionTimeStamp(){
		return jsonObj.optString(REVISION_TIMESTAMP, "");
	}

	
	public void setRevisionUid(String revisionUid){
		try {
			jsonObj.put(REVISION_UID, revisionUid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getRevisionUid(){
		return jsonObj.optString(REVISION_UID, "");
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
	
	public void setLastCommentTimeStamp(String lastCommentTimeStamp){
		try {
			jsonObj.put(LAST_COMMENT_TIMESTAMP, lastCommentTimeStamp);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getLastCommentTimeStamp(){
		return jsonObj.optString(LAST_COMMENT_TIMESTAMP, "");
	}
	
	public void setLastCommentName(String lastCommentName){
		try {
			jsonObj.put(LAST_COMMENT_NAME, lastCommentName);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getLastCommentName(){
		return jsonObj.optString(LAST_COMMENT_NAME, "");
	}
	
	public void setLastCommentUid(String lastCommentUid){
		try {
			jsonObj.put(LAST_COMMENT_UID, lastCommentUid);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String setLastCommentUid(){
		return jsonObj.optString(LAST_COMMENT_UID, "");
	}
	
	public void setCommentCount(String commentCount){
		try {
			jsonObj.put(COMMENT_COUNT, commentCount);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCommentCount(){
		return jsonObj.optString(COMMENT_COUNT, "");
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
	
	public void setPicture(String picture){
		try {
			jsonObj.put(PICTURE, picture);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getPicture(){
		return jsonObj.optString(PICTURE, "");
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
	
	public void setPath(String path){
		try {
			jsonObj.put(PATH, path);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getPath(){
		return jsonObj.optString(PATH, "");
	}
}
