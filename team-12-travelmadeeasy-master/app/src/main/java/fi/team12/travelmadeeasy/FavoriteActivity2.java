package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FavoriteActivity2 extends AppCompatActivity {

    private ListView listView;
    private TextView favoriteDestinationName, favoriteDestinationInfo;
    private ImageView favoriteDestinationImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);
        Bundle bundle = getIntent().getExtras();
        int indexOfFavoriteDestination = bundle.getInt("Index of favorite destination");

        Destination favoriteDestinations = FavoriteDestinations.getFavoriteDestinations().getFavoriteDestination(indexOfFavoriteDestination);

        favoriteDestinationName = (TextView) findViewById(R.id.DestinationName);
        favoriteDestinationImage = (ImageView) findViewById(R.id.DestinationImage);
        favoriteDestinationInfo = (TextView) findViewById(R.id.DestinationInfo);

        favoriteDestinationName.setText(favoriteDestinations.getName());
        favoriteDestinationInfo.setText(favoriteDestinations.getInfo());

        switch (favoriteDestinations.getName()) {
            case "Mauritius":
                favoriteDestinationImage.setImageResource(R.drawable.mauritius);
                break;

            case "Miami":
                favoriteDestinationImage.setImageResource(R.drawable.miami);
                break;

            case "Barcelona":
                favoriteDestinationImage.setImageResource(R.drawable.barcelona);
                break;

            case "Blue Lagoon":
                favoriteDestinationImage.setImageResource(R.drawable.bluelagoon);
                break;

            case "Zurich":
                favoriteDestinationImage.setImageResource(R.drawable.zurich);
                break;
        }



    }
}