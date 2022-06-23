package com.project.application;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
	
	BottomNavigationView bottomNav;
	HomeFragment home = new HomeFragment();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		bottomNav = findViewById(R.id.bottomNav);
		bottomNav.setSelectedItemId(R.id.nav_home);
		getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, home).commit();
		bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
			
			@Override
			public boolean onNavigationItemSelected(MenuItem item){
				Fragment selectFragment = null;
				
				switch(item.getItemId()){
					case R.id.nav_home:
						selectFragment = new HomeFragment();
						break;
					case R.id.nav_katalog:
						selectFragment = new KatalogFragment();
						break;
					case R.id.nav_chat:
						selectFragment = new ChatFragment();
						break;
					case R.id.nav_promosi:
						selectFragment = new PromosiFragment();
						break;
					case R.id.nav_aplikasi:
						selectFragment = new AplikasiFragment();
						break;
				}
				
				getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectFragment).commit();
				return true;
			}
		});
        
    }
    
}
/*don't forget to subscribe my YouTube channel for more Tutorial and mod*/
/*
https://youtube.com/channel/UC_lCMHEhEOFYgJL6fg1ZzQA */
