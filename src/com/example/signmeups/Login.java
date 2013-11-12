package com.example.signmeups;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    


Button loginButton = (Button)findViewById(R.id.login_button);
    
    loginButton.setOnClickListener(new View.OnClickListener(){
    	public void onClick(View view){
    		Intent intent = new Intent(Login.this, FrontEnd.class);
    		startActivity(intent);
    		
    	}
    });
    }
    
    
    
    
}
