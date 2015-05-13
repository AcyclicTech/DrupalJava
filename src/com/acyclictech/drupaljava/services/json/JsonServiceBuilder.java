package com.acyclictech.drupaljava.services.json;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;

public class JsonServiceBuilder {

	private String baseUrl;

	public JsonServiceBuilder(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	// node CRUD + index
	public void getNodeIndex() {

	}

	public void getNode(String nid) {

	}

	public void createNode() {

	}

	public void deleteNode() {

	}

	// comment CRUD
	public void getCommentIndex() {

	}

	public void getComment(String cid) {

	}

	public void createComment() {

	}

	public void deleteComment() {

	}

	// user CRUD
	public void getUserIndex() {

	}

	public void getUser(String uid) {

	}

	public void createUser() {

	}

	public void deleteUser() {

	}

	// login
	public void login() {

	}

	// logout
	public void logout() {

	}

	private void doGet(JSONObject obj) {
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL("http://www.example.com/page.php");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			InputStream response = conn.getInputStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doPost(JSONObject obj) {
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL("http://www.example.com/page.php");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			InputStream response = conn.getInputStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doPut(JSONObject obj) {
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL("http://www.example.com/page.php");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("PUT");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			InputStream response = conn.getInputStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void doDelete(JSONObject obj) {
		try {
			String type = "application/json";
			String encodedData = URLEncoder.encode(obj.toString());
			URL u = new URL("http://www.example.com/page.php");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("DELETE");
			conn.setRequestProperty("Content-Type", type);
			OutputStream os = conn.getOutputStream();
			os.write(encodedData.getBytes());
			InputStream response = conn.getInputStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
