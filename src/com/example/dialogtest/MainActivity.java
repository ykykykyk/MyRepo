package com.example.dialogtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.audiofx.BassBoost.Settings;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity implements android.view.View.OnClickListener {
	//private static final OnCheckedChangeListener OnCheckedChangeListener = null;
	private  CheckBox checkBox1;
	private Button btn_dialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//checkBox1=(CheckBox)findViewById(R.id.checkBox1);
		btn_dialog = (Button) findViewById(R.id.btn_dialog);
		//checkBox1.setOnCheckedChangeListener((OnCheckedChangeListener));
		btn_dialog.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == btn_dialog){
		View view=View.inflate(this, R.layout.activitydialog, null);
		checkBox1 = (CheckBox) view.findViewById(R.id.checkBox1);
		new AlertDialog.Builder(this)
		.setView(view)
		.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				if(checkBox1.isChecked()){
				
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				MainActivity.this.startActivity(intent);
				}
				
			}
		} )
		.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
				MainActivity.this.startActivity(intent);
			}
		})
		
		
		.show();
		
	}
	
	








}
	}



