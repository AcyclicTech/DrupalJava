package com.acyclictech.drupaljava.services.json.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.acyclictech.drupaljava.services.json.JsonUtilities;

public class NodeListJsonObject extends BaseJsonObject{
	public List<NodeJsonObject> nodeList = null;
	private JSONArray jsonArray;

	public NodeListJsonObject(){
		jsonArray = new JSONArray();
		nodeList = new ArrayList<NodeJsonObject>();
	}

	public NodeListJsonObject(JSONArray arrayObj){
		jsonArray = arrayObj;
		nodeList = new ArrayList<NodeJsonObject>();
		for(int i = 0; i < jsonArray.length(); i++){
			JSONObject obj = jsonArray.optJSONObject(i);
			NodeJsonObject dataObj = new NodeJsonObject(obj);
			nodeList.add(dataObj);
		}
	}

	public List<NodeJsonObject> getNodes(){
		return nodeList;
	}
	
	public void getNodes(List<NodeJsonObject> nodes){
		this.nodeList = nodes;
	}

	@Override
	public String toString() {
		return "NodeListJsonObject [nodeList=" + nodeList + "]";
	}

	/**
	 * curl -v -H 'Content-Type:application/x-www-form-urlencoded' -H 'X-CSRF-Token: H9-1mC-RJY6PG1b_svsWYEJZoxthrKcMQnHnYwEOtfQ' -X POST --data "username=jon&password=password" http://192.168.56.1/drupal7/rest/user/login.json
	 * @param args
	 */
	
//	//[{'nid':'2','vid':'2','type':'blog','language':'und','title':'Linux','uid':'1','status':'1','created':'1428289127','changed':'1428290484','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/2'},{'nid':'1','vid':'1','type':'blog','language':'und','title':'Page 1','uid':'1','status':'1','created':'1428287496','changed':'1428287496','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/1'}]
//	public static Map<String, String> parseNodes(JSONArray jsonObj){
//		Map<String, String> nodeList = new TreeMap<String, String>();
//		for(int i = 0; i < jsonObj.length(); i++){
//			try {
//				JSONObject arrayObj = jsonObj.getJSONObject(i); 
//				String nId = arrayObj.getString("nid");
//				nodeList.put(nId, arrayObj.getString("title"));
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return nodeList;
//	}
	
	public static void main(String[] args) {
		String testMessage = "[{'nid':'2','vid':'2','type':'blog','language':'und','title':'Linux','uid':'1','status':'1','created':'1428289127','changed':'1428290484','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/2'},{'nid':'1','vid':'1','type':'blog','language':'und','title':'Page 1','uid':'1','status':'1','created':'1428287496','changed':'1428287496','comment':'2','promote':'1','sticky':'0','tnid':'0','translate':'0','uri':'http://192.168.56.1/drupal7/rest/node/1'}]";
		JSONArray jsonObj = JsonUtilities.parseArrayObj(testMessage);
//		Map<String, String> nodes = NodeListJsonObject.parseNodes(jsonObj);
//		System.out.println(nodes);
	}

}
