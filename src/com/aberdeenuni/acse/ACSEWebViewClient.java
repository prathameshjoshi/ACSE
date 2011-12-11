package com.aberdeenuni.acse;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ACSEWebViewClient extends WebViewClient 
{

	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) 
	{
		view.loadUrl(url);
		return true;
	}

}
