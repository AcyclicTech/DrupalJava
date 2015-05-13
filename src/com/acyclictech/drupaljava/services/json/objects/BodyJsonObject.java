package com.acyclictech.drupaljava.services.json.objects;

import org.json.JSONException;
import org.json.JSONObject;

public class BodyJsonObject extends BaseJsonObject {
	/*
	 * body: { "und" : [{ "value" :
	 * "/usr/share/drupal7/modules\r\n\r\nModules:\r\nctools\r\nlibraries\r\nservices\r\nrest-service\r\n\r\ncreate rest service\r\ntest url: http://10.0.2.15/drupal7/rest/node.json"
	 * , "summary" : "", "format" : "plain_text", "safe_value" :
	 * "<p>/usr/share/drupal7/modules</p>\n<p>Modules:<br />\nctools<br />\nlibraries<br />\nservices<br />\nrest-service</p>\n<p>create rest service<br />\ntest url: <a href=\"http://10.0.2.15/drupal7/rest/node.json\">http://10.0.2.15/drupal7/rest/node.json</a></p>\n"
	 * , "safe_summary" : "" } ] },
	 */
	public static final String UND = "und";
	public static final String VALUE = "value";
	public static final String SUMMARY = "summary";
	public static final String FORMAT = "format";
	public static final String SAFE_VALUE = "safe_value";
	public static final String SAFE_SUMMARY = "safe_summary";

	public BodyJsonObject() {
		jsonObj = new JSONObject();
	}

	public BodyJsonObject(String und, String value, String summary,
			String format, String safeValue, String safeSummary) {
		this();
		try {
			jsonObj.put(UND, und);
			jsonObj.put(VALUE, value);
			jsonObj.put(SUMMARY, summary);
			jsonObj.put(FORMAT, format);
			jsonObj.put(SAFE_VALUE, safeValue);
			jsonObj.put(SAFE_SUMMARY, safeSummary);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setUnd(String und) {
		try {
			jsonObj.put(UND, und);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getUnd() {
		return jsonObj.optString(UND, "");
	}

	public void setValue(String value) {
		try {
			jsonObj.put(VALUE, value);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getValue() {
		return jsonObj.optString(VALUE, "");
	}

	public void setSummary(String summary) {
		try {
			jsonObj.put(SUMMARY, summary);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getSummary() {
		return jsonObj.optString(SUMMARY, "");
	}

	public void setFormat(String format) {
		try {
			jsonObj.put(FORMAT, format);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getFormat() {
		return jsonObj.optString(FORMAT, "");
	}

	public void setSafeValue(String safeValue) {
		try {
			jsonObj.put(SAFE_VALUE, safeValue);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getSafeValue() {
		return jsonObj.optString(SAFE_VALUE, "");
	}

	public void setSafeSummary(String safeSummary) {
		try {
			jsonObj.put(SAFE_SUMMARY, safeSummary);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getSafeSummary() {
		return jsonObj.optString(SAFE_SUMMARY, "");
	}
}
