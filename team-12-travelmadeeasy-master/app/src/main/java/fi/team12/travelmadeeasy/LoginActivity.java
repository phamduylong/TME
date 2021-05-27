package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Long Pham
 */

public class LoginActivity extends AppCompatActivity {
    private Button loginBtn, signUpBtn;
    private TextView appTitle, loginText;
    private EditText username, password;
    private SharedPreferences sp;
    private String usernameStr, passwordStr;
    private int logInCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        signUpBtn = (Button) findViewById(R.id.signUpBtn);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        appTitle = (TextView) findViewById(R.id.appTitle);
        sp = getSharedPreferences("User's account information", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        //set OnClickListener for sign up button
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //use shared preferences to store username and password (haven't known how to use databases yet)
                editor.putString(username.getText().toString(), username.getText().toString());
                editor.putString(username.getText().toString() + "#", password.getText().toString());
                //check if username or password contains #, which is used to check username and password is the right match
                if (username.getText().toString().contains("#") || password.getText().toString().contains("#")) {
                    Toast.makeText(LoginActivity.this, "# is not allowed", Toast.LENGTH_SHORT).show();
                    return;
                } else if (sp.getAll().containsValue(username)) {
                    Toast.makeText(LoginActivity.this, "username was taken", Toast.LENGTH_LONG).show();
                    return;
                }
                editor.apply();
                //Notify user that they have signed up succesfully
                Toast.makeText(LoginActivity.this, "Signed up successfully", Toast.LENGTH_LONG).show();
                //make both field empty for user to log in
                username.setText("");
                password.setText("");

            }
        });

        //set onClickListener for login button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if username and password are correct
                if (sp.getString(username.getText().toString(), "").equals(username.getText().toString())
                        && sp.getString(username.getText().toString() + "#"," ").equals(password.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Logged in successfully", Toast.LENGTH_LONG).show();
                    username.setText("");
                    password.setText("");
                    Intent intent = new Intent(LoginActivity.this, DefaultActivity.class);
                    startActivity(intent);
                    //count times logged in and saving to shared preferences
                    logInCounter+=1;
                    editor.putInt("Log in count", logInCounter);


                }

                //checking if user has signed up or not

                else if (sp.getAll().containsValue(username) == false) {
                    Toast.makeText(LoginActivity.this, "Please sign up before signing in", Toast.LENGTH_LONG).show();
                }

                else {
                    //announcing to user that username or password incorrect
                    Toast.makeText(LoginActivity.this, "Incorrect username or password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


}