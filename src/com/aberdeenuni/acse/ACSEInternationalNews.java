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
public class ACSEInternationalNews extends ListActivity implements OnItemClickListener
{
    ListView list;
    String[] items = {"Environment Guardian","BBC","Reuters"};
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        System.out.println("onCreate ACSE Class Method Initialise");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internationalnews);
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
            case 0: Intent showGuardian = new Intent(ACSEInternationalNews.this,ACSEGuardian.class);
                    startActivity(showGuardian);
                    break; 
                    
            case 1: Intent showBbc = new Intent(ACSEInternationalNews.this,ACSEBbc.class);
                    startActivity(showBbc);
                    break;
            case 2: Intent showReuters = new Intent(ACSEInternationalNews.this,ACSEReuters.class);
                    startActivity(showReuters);
                    break;
        }                 
    }
}	

