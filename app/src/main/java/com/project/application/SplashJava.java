package com.project.application;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class SplashJava extends AppCompatActivity {
	
	private int waktu_loading = 3500;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_layout);
		
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent inten = new Intent(SplashJava.this,MainActivity.class);
				startActivity(inten);
				finish();
			}
		},waktu_loading);
	}
    
}
