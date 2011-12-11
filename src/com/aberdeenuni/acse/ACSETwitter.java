package com.aberdeenuni.acse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.lang.StringBuilder;

public class ACSETwitter extends Activity 
{
    ListView tweetlist;
	StringBuilder sb = new StringBuilder();
    List<String> tweets = new ArrayList<String>();

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twitter);
        tweetlist = (ListView)findViewById(android.R.id.list);
		String readTwitterFeed = readTwitterFeed();
		try 
		{
			JSONArray jsonArray = new JSONArray(readTwitterFeed);
			for (int i = 0; i < jsonArray.length(); i++) 
			{
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				sb.append(jsonObject.getString("text"));
				sb.append('\n');
				sb.append(jsonObject.getString("created_at"));
				tweets.add(sb.toString());
			}
	        tweetlist.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,tweets));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public String readTwitterFeed() 
	{
		StringBuilder builder = new StringBuilder();
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet("http://twitter.com/statuses/user_timeline/AberdeenCES.json");
		try 
		{
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			if (statusCode == 200) 
			{
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				BufferedReader reader = new BufferedReader(new InputStreamReader(content));
				String line;
				while ((line = reader.readLine()) != null) 
				{
					builder.append(line);
				}
			} 
			else 
			{
				Log.e(ACSETwitter.class.toString(), "Failed to download file");
			}
		} 
		catch (ClientProtocolException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return builder.toString();
	}
}
