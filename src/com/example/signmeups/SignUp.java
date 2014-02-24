package com.example.signmeups;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;


public class SignUp extends Activity {
	
	
	private Button SignUpButton;
	CharSequence success = "Successfully signed up!";
	CharSequence fail = "Failed to sign up";
	
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up);

		
		

		SignUpButton = (Button)findViewById(R.id.signUpButton);
		SignUpButton.setOnClickListener(new View.OnClickListener() {
			
			
			Context context = getApplicationContext();
			@Override
			public void onClick(View v) {
				
				final EditText orgName,orgEmail,orgPass;
				
				orgName=(EditText)findViewById(R.id.OrgName);
				orgEmail=(EditText)findViewById(R.id.OrgEmail);
				orgPass=(EditText)findViewById(R.id.OrgPassword);
				
				ParseObject OrgLogin = new ParseObject("SignUp");
				
				
				int duration = Toast.LENGTH_SHORT;
				Toast toast = Toast.makeText(context, "Success", duration);
				toast.show();
				
				
				OrgLogin.put("OrgName", orgName.getText().toString());
				OrgLogin.put("OrgEmail", orgEmail.getText().toString());
				OrgLogin.put("OrgPassword", orgPass.getText().toString());
				
				OrgLogin.saveInBackground();

				
				
//				
//	    		ParseQuery<ParseObject> query = ParseQuery.getQuery("SignUps");
//	    		query.whereExists(orgEmail);
//	    		
	    		/*query object to see if data was saved*/
	    		
//	    		query.findInBackground(new FindCallback<ParseObject>() {
//	    			
//	    		    public void done(List<ParseObject> scoreList, ParseException e) {
//	    		        if (e ==null) {
//	    					int duration = Toast.LENGTH_SHORT;
//	    					Toast toast = Toast.makeText(context, "e==null", duration);
//	    					toast.show();
//	    					OrgLogin.put("OrgName", orgName);
//	    					OrgLogin.put("OrgEmail", orgEmail);
//	    					OrgLogin.put("OrgPassword", orgPassword);
//	    					OrgLogin.saveInBackground();
//	    		    		Intent intent = new Intent(SignUp.this, Login.class);
//	    		    		startActivity(intent);
//	    		        } else {
//	    					int duration = Toast.LENGTH_SHORT;
//	    					Toast toast = Toast.makeText(context, success, duration);
//	    					toast.show();
//	    					OrgLogin.put("OrgName", orgName);
//	    					OrgLogin.put("OrgEmail", orgEmail);
//	    					OrgLogin.put("OrgPassword", orgPassword);
//	    					OrgLogin.saveInBackground();
//	    		    		Intent intent = new Intent(SignUp.this, Login.class);
//	    		    		startActivity(intent);
//	    		        }
//	    		    }
//	    		});
			}
		});
	}
}
