package com.aberdeenuni.acse;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ACSEAbout extends Activity 
{

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);

		WebView webView = (WebView) findViewById(R.id.webview);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://www.aces.ac.uk/about/");

		webView.setWebViewClient(new ACSEWebViewClient());

	}
}
