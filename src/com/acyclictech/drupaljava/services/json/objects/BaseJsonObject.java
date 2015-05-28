package com.acyclictech.drupaljava.services.json.objects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class BaseJsonObject {

	protected JSONObject jsonObj;

	public BaseJsonObject() {
		jsonObj = new JSONObject();
	}

	public BaseJsonObject(JSONObject obj) {
		jsonObj = obj;
	}

	public String toString() {
		try {
			return jsonObj.toString(4);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public JSONObject getJsonObject() {
		return jsonObj;
	}

	public void build(String objString) {
		try {
			jsonObj = new JSONObject(objString);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Map<String, String> getMap() {
		Map<String, String> data = new HashMap<String, String>();
		Iterator<String> iter = jsonObj.keys();
		try {
			while (iter.hasNext()) {
				String key = iter.next();
				String value = jsonObj.getString(key);
				data.put(key, value);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
