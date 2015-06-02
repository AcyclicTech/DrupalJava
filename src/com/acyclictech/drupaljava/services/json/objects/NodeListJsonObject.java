package com.acyclictech.drupaljava.services.json.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.acyclictech.drupaljava.services.json.JsonUtilities;

/**
NodeListJsonObject [nodeList=[{
    "changed": "1428290484",
    "comment": "2",
    "created": "1428289127",
    "language": "und",
    "nid": "2",
    "promote": "1",
    "status": "1",
    "sticky": "0",
    "title": "Linux",
    "tnid": "0",
    "translate": "0",
    "type": "blog",
    "uid": "1",
    "uri": "http://192.168.56.1/drupal7/rest/node/2",
    "vid": "2"
}, {
    "changed": "1428287496",
    "comment": "2",
    "created": "1428287496",
    "language": "und",
    "nid": "1",
    "promote": "1",
    "status": "1",
    "sticky": "0",
    "title": "Page 1",
    "tnid": "0",
    "translate": "0",
    "type": "blog",
    "uid": "1",
    "uri": "http://192.168.56.1/drupal7/rest/node/1",
    "vid": "1"
}]]
 */
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
}
