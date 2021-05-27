package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Long Pham
 */
public class GuideActivity1 extends AppCompatActivity {
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide1);
        //get shared preferences that was initialized in login activity
        sp = getSharedPreferences("Log in counter", MODE_PRIVATE);

        //check if user logged in more than once to decide whether to show guides or not
        if(sp.getInt("Log in count", 0) >= 1) {
            Intent intent = new Intent (GuideActivity1.this, LoginActivity.class);
        }

        Button btn1 = findViewById(R.id.firstGuideNextBtn);
        Button btn2 = findViewById(R.id.firstGuideSkipBtn);

        //set onClickListener for next button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GuideActivity2.class);
                startActivity(intent);
            }
        });

        //set onClickListener for skip button
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}