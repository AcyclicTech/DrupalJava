package com.acyclictech.drupaljava.services.json;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

import com.acyclictech.drupaljava.services.json.objects.CommentJsonObject;
import com.acyclictech.drupaljava.services.json.objects.NodeJsonObject;
import com.acyclictech.drupaljava.services.json.objects.NodeListJsonObject;
import com.acyclictech.drupaljava.services.json.objects.UserJsonObject;

public class JsonServiceBuilder {

	private String baseUrl;

	public JsonServiceBuilder(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	// node CRUD + index
	public NodeListJsonObject getNodeIndex(UserJsonObject userObject) {
		String jsonResponse = doGet("/node", null, userObject);
		JSONArray jsonArray = JsonUtilities.parseArrayObj(jsonResponse);
		NodeListJsonObject listObject = new NodeListJsonObject(jsonArray);
		return listObject;
	}

	public NodeJsonObject getNode(NodeJsonObject node, UserJsonObject userObject) {
		String jsonResponse = doGet("/", node.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		NodeJsonObject nodeObject = new NodeJsonObject(jsonObject);
		return nodeObject;

	}

	public NodeJsonObject createNode(NodeJsonObject node, UserJsonObject userObject) {
		String jsonResponse = doPost("/", node.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		NodeJsonObject nodeObject = new NodeJsonObject(jsonObject);
		return nodeObject;
	}

	public NodeJsonObject deleteNode(NodeJsonObject node, UserJsonObject userObject) {
		String jsonResponse = doDelete("/", node.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		NodeJsonObject nodeObject = new NodeJsonObject(jsonObject);
		return nodeObject;
	}

	// comment CRUD
	public CommentJsonObject getCommentIndex(CommentJsonObject comment, UserJsonObject userObject) {
		String jsonResponse = doGet("/", comment.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		CommentJsonObject nodeObject = new CommentJsonObject(jsonObject);
		return nodeObject;
	}

	public CommentJsonObject createComment(CommentJsonObject comment, UserJsonObject userObject) {
		String jsonResponse = doPost("/", comment.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		CommentJsonObject nodeObject = new CommentJsonObject(jsonObject);
		return nodeObject;
	}

	public CommentJsonObject deleteComment(CommentJsonObject comment, UserJsonObject userObject) {
		String jsonResponse = doDelete("/", comment.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		CommentJsonObject nodeObject = new CommentJsonObject(jsonObject);
		return nodeObject;
	}

	// user CRUD
	public void getUserIndex(UserJsonObject userObject) {

	}

	public UserJsonObject getUser(String uid, UserJsonObject userObject) {
		String jsonResponse = doGet("/", userObject.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		UserJsonObject nodeObject = new UserJsonObject(jsonObject);
		return nodeObject;
	}

	public UserJsonObject createUser(UserJsonObject userObject) {
		String jsonResponse = doPost("/", userObject.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		UserJsonObject nodeObject = new UserJsonObject(jsonObject);
		return nodeObject;
	}

	public UserJsonObject deleteUser(UserJsonObject userObject) {
		String jsonResponse = doDelete("/", userObject.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		UserJsonObject nodeObject = new UserJsonObject(jsonObject);
		return nodeObject;
	}

	// login
	public UserJsonObject login(UserJsonObject userObject) {
		return null;
	}

	// logout
	public UserJsonObject logout(UserJsonObject userObject) {
		return null;
	}

	private String doGet(String path, JSONObject obj, UserJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			//InputStream response = conn.getInputStream();
			jsonResponse = conn.getResponseMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResponse;
	}

	private String doPost(String path, JSONObject obj, UserJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			//InputStream response = conn.getInputStream();
			jsonResponse = conn.getResponseMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResponse;
	}

	private String doPut(String path, JSONObject obj, UserJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("PUT");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			//InputStream response = conn.getInputStream();
			jsonResponse = conn.getResponseMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResponse;
	}

	private String doDelete(String path, JSONObject obj, UserJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("DELETE");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			//InputStream response = conn.getInputStream();
			jsonResponse = conn.getResponseMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResponse;
	}
	
	public static void main(String[] args) {
		JsonServiceBuilder builder = new JsonServiceBuilder("http://192.168.56.1/drupal7/rest/");
		NodeListJsonObject nodeList = builder.getNodeIndex(null);
		System.out.println(nodeList.toString());
	}
}
