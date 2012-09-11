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
public class ACSEPodcast extends ListActivity implements OnItemClickListener
{
    ListView list;
    String[] items = {"RELU Sustainable Uplands", "People, Plants, Planning & Conservation"};
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        System.out.println("onCreate ACSE Class Method Initialise");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast);
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
            case 0: Intent showRelu = new Intent(ACSEPodcast.this,ACSERelu.class);
                    startActivity(showRelu);
                    break; 
                    
            case 1: Intent showPppc = new Intent(ACSEPodcast.this,ACSEPppc.class);
                    startActivity(showPppc);
                    break;
        }                 
    }
}	

