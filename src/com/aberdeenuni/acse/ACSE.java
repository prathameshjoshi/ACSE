package com.aberdeenuni.acse;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.util.Log;
import java.lang.System;
import java.lang.*;
import android.widget.ImageView;
import 	android.view.ViewGroup;

public class ACSE extends ListActivity implements OnItemClickListener
{
    ListView list;
    String[] items = {"Events","News","Youtube","Twitter","Facebook","Slideshare", "International News","Podcast","Fact of the week","Barcode Scanner","About"};
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        System.out.println("onCreate ACSE Class Method Initialise");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       // setListAdapter(new IconAdapter());
        list = (ListView)findViewById(android.R.id.list);
        list.setOnItemClickListener(this);
        list.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,items));
    }
    
    @Override
    public void onItemClick(AdapterView arg0, View v, int position, long arg3) 
    {
        System.out.println("onItemClick ACSE Class Method Initialise");
        switch(position)
        {
            case 0: Intent showEvents = new Intent(ACSE.this,ACSEEvents.class);
                    startActivity(showEvents);
                    break; 
                    
            case 1: Intent showNews = new Intent(ACSE.this,ACSENews.class);
                    startActivity(showNews);
                    break;
            case 2: Intent showYoutube = new Intent(ACSE.this,ACSEYoutube.class);
                    startActivity(showYoutube);
                    break;                    
            case 3: Intent showTwitter = new Intent(ACSE.this,ACSETwitter.class);                    
                    startActivity(showTwitter);
                    break;
            case 4: Intent showFacebook = new Intent(ACSE.this,ACSEFacebook.class);
                    startActivity(showFacebook);
                    break;     
            case 5: Intent showSlideshare = new Intent(ACSE.this,ACSESlideshare.class);
                    startActivity(showSlideshare);
                    break;            
            case 6: Intent showInternationalNews = new Intent(ACSE.this,ACSEInternationalNews.class);
                    startActivity(showInternationalNews);
                    break;                                                            
            case 7: Intent showPodcast = new Intent(ACSE.this,ACSEPodcast.class);
                    startActivity(showPodcast);
                    break;   
            case 8: Intent showFactsofweek = new Intent(ACSE.this,ACSEFactsofweek.class);
                    startActivity(showFactsofweek);
                    break;                                                                             
            
            case 9: Intent showBarcodescanner = new Intent(ACSE.this,ACSEBarcodescanner.class);
                    startActivity(showBarcodescanner);
                    break;                                
                    
            case 10: Intent showAbout = new Intent(ACSE.this,ACSEAbout.class);
                    startActivity(showAbout);
                    break;                                        
        }                 
    }
}	

