package com.aberdeenuni.acse;
import java.util.ArrayList;
import java.util.List;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ACSEBbc extends ListActivity 
{
	private List<Message> messages;
    
    @Override
    public void onCreate(Bundle icicle) 
    {
        super.onCreate(icicle);
        setContentView(R.layout.bbc);
        loadFeed(ParserType.ANDROID_SAX_BBC);
    }

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) 
	{
		super.onListItemClick(l, v, position, id);
		Intent viewMessage = new Intent(Intent.ACTION_VIEW, Uri.parse(messages.get(position).getLink().toExternalForm()));
		this.startActivity(viewMessage);
	}

	private void loadFeed(ParserType type)
	{
    	try
    	{
	    	FeedParser parser = FeedParserFactory.getParser(type);
	    	messages = parser.parse();
	    	List<String> titles = new ArrayList<String>(messages.size());
	    	for (Message msg : messages)
	    	{
	    		titles.add(msg.getTitle());
	    	}
	    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row,titles);
	    	this.setListAdapter(adapter);
    	} 
    	catch (Throwable t)
    	{
    		Log.e("AndroidNews",t.getMessage(),t);
    	}
    }
}
