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
public class ACSEFactsofweek extends ListActivity implements OnItemClickListener
{
    ListView list;
    String[] items = {"Fast Facts", "Interesting Facts", "Odd Facts", "Facts About Certain Species", "Endangered Facts"};
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        System.out.println("onCreate ACSE Class Method Initialise");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factsofweek);
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
            case 0: Intent showFastfacts = new Intent(ACSEFactsofweek.this,ACSEFastfacts.class);
                    startActivity(showFastfacts);
                    break; 
                    
            case 1: Intent showInterestingfacts = new Intent(ACSEFactsofweek.this,ACSEInterestingfacts.class);
                    startActivity(showInterestingfacts);
                    break; 
                    
            case 2: Intent showOddfacts = new Intent(ACSEFactsofweek.this,ACSEOddfacts.class);
                    startActivity(showOddfacts);
                    break;                 
                    
            case 3: Intent showSpeciesfacts = new Intent(ACSEFactsofweek.this,ACSESpeciesfacts.class);
                    startActivity(showSpeciesfacts);
                    break; 
                                      
            case 4: Intent showEndangeredfacts = new Intent(ACSEFactsofweek.this,ACSEEndangeredfacts.class);
                    startActivity(showEndangeredfacts);
                    break; 
        }                 
    }
}	

