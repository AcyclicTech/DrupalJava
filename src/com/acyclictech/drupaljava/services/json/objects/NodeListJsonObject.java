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
