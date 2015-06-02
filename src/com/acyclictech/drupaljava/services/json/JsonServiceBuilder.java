package com.acyclictech.drupaljava.services.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONObject;

import com.acyclictech.drupaljava.services.json.objects.CommentJsonObject;
import com.acyclictech.drupaljava.services.json.objects.NodeJsonObject;
import com.acyclictech.drupaljava.services.json.objects.NodeListJsonObject;
import com.acyclictech.drupaljava.services.json.objects.SessionJsonObject;
import com.acyclictech.drupaljava.services.json.objects.UserJsonObject;

public class JsonServiceBuilder {
	/**
	 * curl -v -H 'Content-Type:application/x-www-form-urlencoded' -H 'X-CSRF-Token: H9-1mC-RJY6PG1b_svsWYEJZoxthrKcMQnHnYwEOtfQ' -X POST --data "username=jon&password=password" http://192.168.56.1/drupal7/rest/user/login.json
	 */

	private String baseUrl;
	String TOKEN_HEADER = "X-CSRF-Token";
	private String restUrl;
	
	private String sessionId = null;

	public JsonServiceBuilder(String baseUrl, String restUrl) {
		this.baseUrl = baseUrl;
		this.restUrl = restUrl;

		String jsonResponse = doGet("/services/session/token", null, null);//"H9-1mC-RJY6PG1b_svsWYEJZoxthrKcMQnHnYwEOtfQ";
		sessionId = jsonResponse;
	}

	// node CRUD + index
	public NodeListJsonObject getNodeIndex(SessionJsonObject userObject) {
		String jsonResponse = doGet("/rest/node.json", null, userObject);
		JSONArray jsonArray = JsonUtilities.parseArrayObj(jsonResponse);
		NodeListJsonObject listObject = new NodeListJsonObject(jsonArray);
		return listObject;
	}

	public NodeJsonObject getNode(NodeJsonObject node, SessionJsonObject userObject) {
		String jsonResponse = doGet("/rest/node/" + node.getNid() + ".json", node.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		NodeJsonObject nodeObject = new NodeJsonObject(jsonObject);
		return nodeObject;

	}

	public NodeJsonObject createNode(NodeJsonObject node, SessionJsonObject userObject) {
		String jsonResponse = doPost("/rest", node.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		NodeJsonObject nodeObject = new NodeJsonObject(jsonObject);
		return nodeObject;
	}

	public NodeJsonObject deleteNode(NodeJsonObject node, SessionJsonObject userObject) {
		String jsonResponse = doDelete("/rest", node.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		NodeJsonObject nodeObject = new NodeJsonObject(jsonObject);
		return nodeObject;
	}

	// comment CRUD
	public CommentJsonObject getCommentIndex(CommentJsonObject comment, SessionJsonObject userObject) {
		String jsonResponse = doGet("/rest", comment.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		CommentJsonObject nodeObject = new CommentJsonObject(jsonObject);
		return nodeObject;
	}

	public CommentJsonObject createComment(CommentJsonObject comment, SessionJsonObject userObject) {
		String jsonResponse = doPost("/rest", comment.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		CommentJsonObject nodeObject = new CommentJsonObject(jsonObject);
		return nodeObject;
	}

	public CommentJsonObject deleteComment(CommentJsonObject comment, SessionJsonObject userObject) {
		String jsonResponse = doDelete("/rest", comment.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		CommentJsonObject nodeObject = new CommentJsonObject(jsonObject);
		return nodeObject;
	}

	// user CRUD
	public void getUserIndex(SessionJsonObject userObject) {

	}

	public UserJsonObject getUser(String uid, SessionJsonObject userObject) {
		String jsonResponse = doGet("/rest", userObject.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		UserJsonObject nodeObject = new UserJsonObject(jsonObject);
		return nodeObject;
	}

	public UserJsonObject createUser(SessionJsonObject userObject) {
		String jsonResponse = doPost("/rest", userObject.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		UserJsonObject nodeObject = new UserJsonObject(jsonObject);
		return nodeObject;
	}

	public UserJsonObject deleteUser(SessionJsonObject userObject) {
		String jsonResponse = doDelete("/rest", userObject.getJsonObject(), userObject);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		UserJsonObject nodeObject = new UserJsonObject(jsonObject);
		return nodeObject;
	}

	// login
	public SessionJsonObject login(UserJsonObject userObject) {
		String jsonResponse = doPostMap("/rest/user/login.json", userObject.getMap(), null);
		JSONObject jsonObject = JsonUtilities.parseObj(jsonResponse);
		SessionJsonObject nodeObject = new SessionJsonObject(jsonObject);
		return nodeObject;
	}

	// logout
	public UserJsonObject logout(UserJsonObject userObject) {
		return null;
	}

	private String doGet(String path, JSONObject obj, SessionJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = null;
			if(userObject != null){
				//encodedData = URLEncoder.encode(obj.toString());
			}
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", type);
			if(sessionId != null){
				conn.setRequestProperty(TOKEN_HEADER, sessionId.replaceAll("\\n", ""));
			}
			if(encodedData != null){
				OutputStream os = conn.getOutputStream();
				os.write(encodedData.getBytes());
			}
			jsonResponse = getResponse(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResponse;
	}

	private String doPostMap(String path, Map<String, String> params, SessionJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/x-www-form-urlencoded";
			String encodedData = null;
			StringBuffer paramString = new StringBuffer();
			if(params != null && params.size() != 0){
				for(Entry<String, String> e: params.entrySet()){
					paramString.append(e.getKey()).append('=').append(e.getValue()).append('&');
				}
				paramString.setLength(paramString.length() - 1);
				//encodedData = URLEncoder.encode(paramString.toString());
				encodedData = paramString.toString();
			}
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", type);
			conn.setRequestProperty(TOKEN_HEADER, sessionId.replaceAll("\\n", ""));
			if(encodedData != null){
				OutputStream os = conn.getOutputStream();
				os.write(encodedData.getBytes());
			}
			//InputStream response = conn.getInputStream();				
			jsonResponse = getResponse(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResponse;
	}

	private String doPost(String path, JSONObject obj, SessionJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = null;
			if(obj != null){
				encodedData = URLEncoder.encode(obj.toString());
			}
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", type);
			conn.setRequestProperty(TOKEN_HEADER, sessionId);
			if(encodedData != null){
				OutputStream os = conn.getOutputStream();
				os.write(encodedData.getBytes());
			}
			//InputStream response = conn.getInputStream();				
			jsonResponse = getResponse(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResponse;
	}

	private String doPut(String path, JSONObject obj, SessionJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("PUT");
			conn.setRequestProperty("Content-Type", type);
			conn.setRequestProperty(TOKEN_HEADER, sessionId.replaceAll("\\n", ""));
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

	private String doDelete(String path, JSONObject obj, SessionJsonObject userObject) {
		String jsonResponse = null;
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL(baseUrl + path);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("DELETE");
			conn.setRequestProperty("Content-Type", type);
			conn.setRequestProperty(TOKEN_HEADER, sessionId.replaceAll("\\n", ""));
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
	
	private String getResponse(HttpURLConnection conn) {
		try {
			InputStream response = conn.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(response));
			String line = reader.readLine();
			StringBuffer sb = new StringBuffer();
			while(line != null){
				sb.append(line).append('\n');
				line = reader.readLine();
			}
			reader.close();
			return sb.toString().trim();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}

	public static void main(String[] args) {
		JsonServiceBuilder builder = new JsonServiceBuilder("http://192.168.56.1/drupal7", "/rest");
		NodeListJsonObject nodeList = builder.getNodeIndex(null);
//		System.out.println(nodeList.toString());
		UserJsonObject userObj = new UserJsonObject();
		userObj.setName("jon");
		userObj.setPassword("password");
		SessionJsonObject sessionObj = builder.login(userObj);
//		System.out.println(sessionObj);
		
		NodeJsonObject nodeObj = builder.getNode(nodeList.getNodes().get(0), sessionObj);
		System.out.println(nodeObj);
		
	}
}
