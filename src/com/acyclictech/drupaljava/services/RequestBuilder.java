package com.acyclictech.drupaljava.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RequestBuilder {
	
	public enum HTTP_METHODS {GET, POST, PUT, DELETE };

	public URL buildUrl(String baseUrl, JSONObject request, String method){
		URL url = null;
		try {
			if(request != null && method.equals(HTTP_METHODS.GET.toString())){
				String jsonObj = URLEncoder.encode(request.toString());				
				url = new URL(baseUrl + "?" + jsonObj);
			}else{
				url = new URL(baseUrl);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return url;
	}
	
	public JSONObject getJsonObject(String baseUrl, JSONObject request, String method){
		JSONObject obj = null;
		try {
			String response = getResponse(baseUrl, method, request);
			obj = new JSONObject(response);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	public JSONArray getJsonArray(String baseUrl, JSONObject request, String method){
		JSONArray obj = null;
		try {
			String response = getResponse(baseUrl, method, request);
			obj = new JSONArray(response);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	private String getResponse(String baseUrl, String method, JSONObject request){
		String response = null;
		try {
			URL url = buildUrl(baseUrl, request, method);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(method);
			if(!method.equals(HTTP_METHODS.GET.toString())){
				connection.setRequestProperty("Content-Type", "application/json");
				OutputStream output = connection.getOutputStream();
				output.write(URLEncoder.encode(request.toString()).getBytes());
				output.close();
			}
			connection.connect();
			int responseCode = connection.getResponseCode();
			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer buffer = new StringBuffer();
			String line = br.readLine();
			while(line != null){
				buffer.append(line).append('\n');
				line = br.readLine();
			}
			is.close();
			response = buffer.toString();
			
			System.out.println(responseCode + ": " + response);
			connection.disconnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
	
	public static void main(String[] args) {
		RequestBuilder rb = new RequestBuilder();
		String baseUrl = "http://ctappw03:8080/ContentMonitor/ContentMonitorRest/query/tree";
		JSONObject request = null;
		JSONObject obj = rb.getJsonObject(baseUrl, request, RequestBuilder.HTTP_METHODS.GET.toString());
		try {
			System.out.println(obj.toString(4));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
