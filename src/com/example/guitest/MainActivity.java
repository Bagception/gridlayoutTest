package com.example.guitest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void goToItem(View view){
    	Intent item_intent = new Intent(this, AddItem.class);
    	startActivity(item_intent);
    }
    
    public void goToPlace(View view){
    	Intent place_intent = new Intent(this, AddPlace.class);
    	startActivity(place_intent);
    }
    
    public void goToActivity(View view){
    	Intent activity_intent = new Intent(this, AddActivity.class);
    	startActivity(activity_intent);
    }
    
    public void goToContext(View view){
    	Intent context_intent = new Intent(this, AddContext.class);
    	startActivity(context_intent);
    }
}
