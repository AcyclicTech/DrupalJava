package com.acyclictech.drupaljava.services.json;

import java.util.Map;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtilities {
	public static JSONArray parseArrayObj(String nodeList){
		JSONArray jsonObj = null;
		try {
			jsonObj = new JSONArray(nodeList);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObj;
	}

	public static JSONObject parseObj(String nodeList){
		JSONObject jsonObj = null;
		try {
			jsonObj = new JSONObject(nodeList);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObj;
	}

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

	public static Map<String, String> parseNodes(JSONObject jsonObj){
		Map<String, String> nodeList = new TreeMap<String, String>();
		for(int i = 0; i < jsonObj.length(); i++){
			try {
				String nId = jsonObj.getString("nid");
				nodeList.put(nId, jsonObj.getString("title"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return nodeList;
	}

}
