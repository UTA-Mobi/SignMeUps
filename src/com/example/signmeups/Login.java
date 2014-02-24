package com.example.signmeups;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

Button loginButton = (Button)findViewById(R.id.login_button);
    
    loginButton.setOnClickListener(new View.OnClickListener(){
    	@Override
		public void onClick(View view){
    		Intent intent = new Intent(Login.this, FrontEnd.class);
    		startActivity(intent);
    		
    		// this will do login validation
    	}
    });
    
Button signUpButton = (Button)findViewById(R.id.signup_button);
    
    signUpButton.setOnClickListener(new View.OnClickListener(){
    	public void onClick(View view){
    		
    		Intent intent = new Intent(Login.this, SignUp.class);
    		startActivity(intent);
    		
    	}
    });
    
    }
    
    
    
    
}
