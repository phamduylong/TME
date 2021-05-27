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
public class LeisureDestinationsActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button saveBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);

        //Getting intent and its extra
        Bundle bundle = getIntent().getExtras();
        int indexOfDestination = bundle.getInt("Destination's index");


        TextView destinationName = (TextView) findViewById(R.id.DestinationName);
        TextView destinationInfo = (TextView) findViewById(R.id.DestinationInfo);

        Destination destinationsList = Destinations.getDestinations().getLeisureDestination(indexOfDestination);

        Destinations destinations = Destinations.getDestinations();

        FavoriteDestinations favoriteDestinationsList = FavoriteDestinations.getFavoriteDestinations();

        //set onclicklistener
        saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favoriteDestinationsList.addFavoriteDestinations(destinations.getLeisureDestination(indexOfDestination));
            }
        });


        imageView = (ImageView) findViewById(R.id.DestinationImage);

        //switch case to determine which image will be shown
        switch (indexOfDestination) {
            case 0:
                imageView.setImageResource(R.drawable.mauritius);
                break;
            case 1:
                imageView.setImageResource(R.drawable.miami);
                break;
            case 2:
                imageView.setImageResource(R.drawable.barcelona);
                break;
            case 3:
                imageView.setImageResource(R.drawable.bluelagoon);
                break;
            case 4:
                imageView.setImageResource(R.drawable.zurich);
                break;
        }

        destinationName.setText(destinationsList.getName());

        destinationInfo.setText(destinationsList.getInfo());

    }
}