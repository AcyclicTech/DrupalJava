package com.acyclictech.drupaljava.services.json.objects;

import java.util.Map;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.acyclictech.drupaljava.services.json.JsonUtilities;
import com.acyclictech.drupaljava.services.json.objects.BaseJsonObject;

public class NodeListJsonObject extends BaseJsonObject{
	public static final String NID = "nid";
	public static final String VID = "vid";
	public static final String TYPE = "type";
	public static final String LANGUAGE = "language";
	public static final String TITLE = "title";
	public static final String UID = "uid";
	public static final String STATUS = "status";
	public static final String CREATED = "created";
	public static final String CHANGED = "changed";
	public static final String COMMENT = "comment";
	public static final String PROMOTE = "promote";
	public static final String STICKY = "sticky";
	public static final String TNID = "tnid";
	public static final String TRANSLATE = "translate";
	public static final String URI = "uri";

	public NodeListJsonObject(){
		jsonObj = new JSONObject();
	}
	
	public NodeListJsonObject(String nid, String vid, String type, String langauge, String title, String uid,
			String status, String created, String changed, String comment, String promote, String sticky,
			String tnid, String translate, String uri){
		this();
		try{
			jsonObj.put(NID, nid);
			jsonObj.put(VID, vid);
			jsonObj.put(TYPE, type);
			jsonObj.put(LANGUAGE, langauge);
			jsonObj.put(TITLE, title);
			jsonObj.put(UID, uid);
			jsonObj.put(STATUS, status);
			jsonObj.put(CREATED, created);
			jsonObj.put(CHANGED, changed);
			jsonObj.put(COMMENT, comment);
			jsonObj.put(PROMOTE, promote);
			jsonObj.put(STICKY, sticky);
			jsonObj.put(TNID, tnid);
			jsonObj.put(TRANSLATE, translate);
			jsonObj.put(URI, uri);
		}catch(JSONException e){
			e.printStackTrace();
		}
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
	
	public void setUri(String uri){
		try {
			jsonObj.put(URI, uri);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUri(){
		return jsonObj.optString(URI, "");
	}
	
	//[{'nid':'2','vid':'2','type':'blog','language':'und','title':'Linux','uid':'1','status':'1','created':'1428289127','changed':'1428290484','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/2'},{'nid':'1','vid':'1','type':'blog','language':'und','title':'Page 1','uid':'1','status':'1','created':'1428287496','changed':'1428287496','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/1'}]
	public static Map<String, String> parseNodes(JSONArray jsonObj){
		Map<String, String> nodeList = new TreeMap<String, String>();
		for(int i = 0; i < jsonObj.length(); i++){
			try {
				JSONObject arrayObj = jsonObj.getJSONObject(i); 
				String nId = arrayObj.getString("nid");
				nodeList.put(nId, arrayObj.getString("title"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return nodeList;
	}
	
	public static void main(String[] args) {
		String testMessage = "[{'nid':'2','vid':'2','type':'blog','language':'und','title':'Linux','uid':'1','status':'1','created':'1428289127','changed':'1428290484','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/2'},{'nid':'1','vid':'1','type':'blog','language':'und','title':'Page 1','uid':'1','status':'1','created':'1428287496','changed':'1428287496','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/1'}]";
		JSONArray jsonObj = JsonUtilities.parseArrayObj(testMessage);
		Map<String, String> nodes = NodeListJsonObject.parseNodes(jsonObj);
		System.out.println(nodes);
	}

}
