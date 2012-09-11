package com.aberdeenuni.acse;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ACSEOddfacts extends Activity 
{
    String data = "<html><body><p><strong>Landowning   Tree</strong></p><p>One of the oldest property owners in the city of Athens, GA is a White Oak. A   deed granted by Col. William H. Jackson, dating back to 1820, states that the   tree own the 64 square feet of land on which it grows in addition to owning   itself. The deed was granted in the Colonel&rsquo;s will to protect the beloved oak.   Unfortunately, the original tree blew down during a storm in 1952, but the   citizens of Athens planted another, grown from one of the original tree's   acorns. </p><p><strong>Sleeping Tree</strong></p><p>In 1927, a group left Bombay to look into rumors about a tree that lay down   at night and went to sleep. As explained by in a publication in the Bombay   Chronicle, the tree slowly inclined toward the earth at nightfall, until by   midnight it lay completely on the ground. It then began to rise slowly and would   stand upright by dawn. </p></body></html>";

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oddfacts);

		WebView webView = (WebView) findViewById(R.id.webview);
		webView.loadData(data, "text/html", "UTF-8");  
	}
}
