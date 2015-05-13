package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;

public class BaseJsonObject {

	protected JSONObject jsonObj;
	
	public String toString(){
		try {
			return jsonObj.toString(4);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public JSONObject getJsonObject(){
		return jsonObj;
	}
	
	public void build(String objString){
		try {
			jsonObj = new JSONObject(objString);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
