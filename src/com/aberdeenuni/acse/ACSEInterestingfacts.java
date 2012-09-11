package com.aberdeenuni.acse;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ACSEInterestingfacts extends Activity 
{
    String data = "<html><body><p><strong>Deepest   Roots</strong></p><p>A Wild Fig tree at Echo Caves, near Ohrigstad, Mpumalanga, South Africa has   roots reaching 400 feet making it the deepest a tree&rsquo;s roots have penetrated.</p><p><strong>The Fastest Growing Tree </strong></p><p>In 1974, it was noted that an Albizzia falcata in Sabah, Malaysia had grown   35 feet and 3 inches in 13 months: an approximate of 1.1 inches per day.</p><p><strong>The Greatest Girth</strong></p><p>In the late 18th century a European Chestnut known as the Tree of the Hundred   Horses on Mount Etna in Sicily, in Italy had a circumference of 190 feet. It has   since separated into three parts. <br /><p><strong>The Most Dangerous Tree</strong></p><p>The Manchineel Tree of the Caribbean coast and the Florida Everglades is a   species that secretes an exceptionally poisonous and acid sap. Upon contact to   the skin, a break out of blisters would occur. In the occasions where there is   contact to the eye, a person can be blinded, and a bite of its fruit causes   blistering and severe pain. This tree has been feared ever since the Spanish   explorers came to the Americas in the 16th century. </p><strong>The Most Massive Tree</strong><p>The &quot;Lindsey Creek Tree&quot;, a Coast Redwood with a minimum trunk volume of   90,000 cubic feet and a minimum total mass of 3630 tons was the most massive   known tree until it blew over in a storm in 1905. The most massive living tree   is &quot;General Sherman&quot;, a giant sequoia found in the Sequoia National Park in   California. It is 275 feet tall with a girth of 102 feet and 8 inches. </p><p><strong>The Oldest Tree</strong></p><p>Found in the Prairie Creek Redwoods State Park in California, the oldest tree   recognized is a Redwood known as Eternal God. The tree is believed to be 12,000   years old, although it is argued as being only 7,000 years old, which still   makes it the oldest. </p><p><strong>The Slowest Growing Tree</strong></p><p>A White Cedar located in the Great Lakes area of Canada, has only grown to   less than 4 inches tall during its 155 years. </p><p><strong>The Tallest Tree</strong></p><p>In 1872, an Australian Eucalyptus at Watts River, Victoria in Australia was   said to measure to 435 feet, but it is speculated that it probably measured to   over 500 feet at some point in its life. The tallest living tree is a Coast   Redwood known as the &quot;Mendocino Tree&quot; found in Montgomery State Reserve in   California. This tree, which is over 1000 years old, is more than 367 feet and 6   inches tall and still growing.</p></body></html>";

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.interestingfacts);

		WebView webView = (WebView) findViewById(R.id.webview);
		webView.loadData(data, "text/html", "UTF-8");  
	}
}
