package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DefaultActivity extends AppCompatActivity {
    private ImageView iconTravel, iconCity, iconFavorite, iconInfo;
    private int backBtnCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

        iconTravel = (ImageView) findViewById(R.id.iconTravel);

        //set onclicklistener for imageview

        iconTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DefaultActivity.this, PurposesActivity.class);
                startActivity(intent);
            }
        });

        //set onclicklistener for imageview

        iconInfo = (ImageView) findViewById(R.id.iconInfo);

        iconInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DefaultActivity.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });

        iconFavorite = (ImageView) findViewById(R.id.iconFavorite);

        iconFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DefaultActivity.this, FavoriteActivity.class);
                startActivity(intent);
            }
        });

    }

    //set onBackButtonListener

    @Override
    public void onBackPressed() {
        Toast.makeText(DefaultActivity.this, "Press back again to exit", Toast.LENGTH_LONG).show();
        this.backBtnCounter+=1;
        //if user pressed back button twice the app will automatically close
        if (this.backBtnCounter%2==0) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
            System.exit(0);
        }
    }
}