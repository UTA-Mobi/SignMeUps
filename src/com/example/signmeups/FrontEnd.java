package com.example.signmeups;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontEnd extends Activity {
    @Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_end);
        
        

        Button loginButton = (Button)findViewById(R.id.button1);
    
        loginButton.setOnClickListener(new View.OnClickListener(){
    	@Override
		public void onClick(View view){
    		Intent intent = new Intent(FrontEnd.this, Login.class);
    		startActivity(intent);
    		
    	}
    });
    }
    
    
    
    

}
