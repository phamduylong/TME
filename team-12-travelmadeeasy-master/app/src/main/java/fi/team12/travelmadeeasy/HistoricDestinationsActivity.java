package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Long Pham
 */
public class HistoricDestinationsActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);


        //User bundle to get intent and the extra contained
        Bundle bundle = getIntent().getExtras();
        int indexOfDestination = bundle.getInt("Destination's index");


        TextView destinationName = (TextView) findViewById(R.id.DestinationName);
        TextView destinationInfo = (TextView) findViewById(R.id.DestinationInfo);

        Destination destinationsList = Destinations.getDestinations().getHistoricDestination(indexOfDestination);

        Destinations destinations = Destinations.getDestinations();

        FavoriteDestinations favoriteDestinationsList = FavoriteDestinations.getFavoriteDestinations();


        //set onCLickListener
        saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favoriteDestinationsList.addFavoriteDestinations(destinations.getHistoricDestination(indexOfDestination));
            }
        });


        imageView = (ImageView) findViewById(R.id.DestinationImage);

        //Using switch case to get the correct image shown to user
        switch (indexOfDestination) {
            case 0:
                imageView.setImageResource(R.drawable.london);
                break;
            case 1:
                imageView.setImageResource(R.drawable.rome);
                break;
            case 2:
                imageView.setImageResource(R.drawable.kathmandu);
                break;
            case 3:
                imageView.setImageResource(R.drawable.athens);
                break;
            case 4:
                imageView.setImageResource(R.drawable.egypt);
                break;
            case 5:
                imageView.setImageResource(R.drawable.khiva);
        }



        destinationName.setText(destinationsList.getName());

        destinationInfo.setText(destinationsList.getInfo());

    }
}