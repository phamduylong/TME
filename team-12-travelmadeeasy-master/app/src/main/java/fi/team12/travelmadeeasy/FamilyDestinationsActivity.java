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
public class FamilyDestinationsActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);


        //Use bundle to get intent and extras that intent contains
        Bundle bundle = getIntent().getExtras();
        int indexOfDestination = bundle.getInt("Destination's index");


        TextView destinationName = (TextView) findViewById(R.id.DestinationName);
        TextView destinationInfo = (TextView) findViewById(R.id.DestinationInfo);

        Destination destinationsList = Destinations.getDestinations().getFamilyDestination(indexOfDestination);

        Destinations destinations = Destinations.getDestinations();

        FavoriteDestinations favoriteDestinationsList = FavoriteDestinations.getFavoriteDestinations();

        saveBtn = (Button) findViewById(R.id.saveBtn);


        //Set onclicklistener for save button
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favoriteDestinationsList.addFavoriteDestinations(destinations.getFamilyDestination(indexOfDestination));
            }
        });


        imageView = (ImageView) findViewById(R.id.DestinationImage);


        //using switch case to determine the destination chosen by user and show the correct image
        switch (indexOfDestination) {
            case 0:
                imageView.setImageResource(R.drawable.hamilton);
                break;
            case 1:
                imageView.setImageResource(R.drawable.florence);
                break;
            case 2:
                imageView.setImageResource(R.drawable.bali);
                break;
        }

        destinationName.setText(destinationsList.getName());

        destinationInfo.setText(destinationsList.getInfo());

    }
}