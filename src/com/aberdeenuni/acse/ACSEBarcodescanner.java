package com.aberdeenuni.acse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class ACSEBarcodescanner extends Activity 
{

	TextView format=null;
	TextView contents=null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.barcodescanner);
		
		format=(TextView)findViewById(R.id.format);
		contents=(TextView)findViewById(R.id.contents);
	}
	
	public void doScan(View v) 
	{
		IntentIntegrator.initiateScan(this);
	}
	
	public void onActivityResult(int request, int result, Intent i) 
	{
		IntentResult scan=IntentIntegrator.parseActivityResult(request, result, i);
		
		if (scan!=null) 
		{
			format.setText(scan.getFormatName());
			contents.setText(scan.getContents());
		}
	}
	
	@Override
	public void onSaveInstanceState(Bundle state) 
	{
		state.putString("format", format.getText().toString());
		state.putString("contents", contents.getText().toString());
	}
	
	@Override
	public void onRestoreInstanceState(Bundle state) 
	{
		format.setText(state.getString("format"));
		contents.setText(state.getString("contents"));
	}
}
