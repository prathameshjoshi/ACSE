package com.aberdeenuni.acse;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ACSESpeciesfacts extends Activity 
{
    String data = "<html><body><p><strong>The Baobab Tree</strong></p><p>Found in Africa, including Madagascar, and northwest Australia, the baobab is thought to be a relic of the flora of Gondwanaland, the super-continent that was once comprised of Africa, Antarctica, Australia and South America. According to African folklore, when the gods gave every animal a tree, the hyena, having arrived late, received the Baobab. He was so disgusted that he planted it upside down.</p><p><strong>Bristle-Cone Pines</strong></p><p>Individual trees in this species are thought to be over 4500 years old, making it a species that is capable of living the longest of any known species.</p><p><strong>Douglas Fir </strong></p><p>This species has been renamed many times since its discovery. They have also been falsely labeled a spruce, hemlock, and even a pine; they actually are not even true firs. Its new name means false hemlock. The Douglas Fir comprises   over 50% of western forests and produces more timber than any other American species.</p><p><strong>Eastern Cottonwoods </strong></p><p>They reach to up to thirteen feet its first year and grow to five feet a year, being able to They;re one of the fastest growing trees.</p><p><strong>Ginko </strong></p><p>This species are the only survivor of an entire plant family. They are the world's oldest living tree species, their origins dating back to the Age of   Dinosaurs. They were thought to have been extinct by the western world until 7 preserved Ginko trees were found in an ancient monastery in China. Years later, they were discovered growing wild in the remote valleys of eastern China.</p><p><strong>Scotch Pines </strong></p><p>These are the most widespread pine in the world.</p><p><strong>Sequoias</strong></p><p>The giant Sequoias average 10-15 feet in diameter when mature and can grow to heights of 250-300 feet. The largest Sequoia, known as the General Sherman Tree, can be found in Sequoia National Park in California. It has a trunk 30 feet across at the base and has a height of 275 feet. General Sherman, with a volume of 52,500 square feet, is considered the largest living thing in the world.</p><p><strong>Witch hazel </strong></p><p>The Witch hazel has seed pods that will contract as they dry and shoot out their contents like bullets over surprising distances. The forked branches of   this shrub or small tree were used as divining rods to detect underground   sources of water. In addition, several well preserved mammoth specimens were   discovered with Witch hazel leaves in their stomachs, indicating a dependence on   the plant for food.</p><p><strong>White Mulberry </strong></p><p>The leaves of this tree are the primary source of food for silkworms.   Therefore, the cultivation of this tree is very widespread throughout many Asian   nations due to the importance of silk to their economies.</p><p><strong>White Oak</strong></p><p>This tree;s wood is often used to make barrels for whiskey and sherry, giving   rise to its alternate name, Stave Oak.</p></body></html>";

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.speciesfacts);

		WebView webView = (WebView) findViewById(R.id.webview);
		webView.loadData(data, "text/html", "UTF-8");  
	}
}
