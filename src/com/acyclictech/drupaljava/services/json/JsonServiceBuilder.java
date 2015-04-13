package com.acyclictech.drupaljava.services.json;

import org.json.JSONObject;

public class JsonServiceBuilder {

	
	public void doLogin(){
		JsonObjectRequest jsObjRequest = new JsonObjectRequest
		        (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

		    @Override
		    public void onResponse(JSONObject response) {
		        mTxtDisplay.setText("Response: " + response.toString());
		    }
		}, new Response.ErrorListener() {

		    @Override
		    public void onErrorResponse(VolleyError error) {
		        // TODO Auto-generated method stub

		    }
		});	
	}
	
	public void doLogout(){
		
	}
	
	public void getUrl(){
		
	}
	
	public void doComment(){
		
	}
}
