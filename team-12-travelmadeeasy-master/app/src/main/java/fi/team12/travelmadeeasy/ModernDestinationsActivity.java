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

public class ModernDestinationsActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);

        //getting intent and extras
        Bundle bundle = getIntent().getExtras();
        int indexOfDestination = bundle.getInt("Destination's index");


        TextView destinationName = (TextView) findViewById(R.id.DestinationName);
        TextView destinationInfo = (TextView) findViewById(R.id.DestinationInfo);

        Destination destinationsList = Destinations.getDestinations().getModernDestination(indexOfDestination);

        Destinations destinations = Destinations.getDestinations();

        FavoriteDestinations favoriteDestinationsList = FavoriteDestinations.getFavoriteDestinations();

        //onclicklistener set
        saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favoriteDestinationsList.addFavoriteDestinations(destinations.getModernDestination(indexOfDestination));
            }
        });


        imageView = (ImageView) findViewById(R.id.DestinationImage);

        //switch case again to determine the picture to be shown
        switch (indexOfDestination) {
            case 0:
                imageView.setImageResource(R.drawable.newyork);
                break;
            case 1:
                imageView.setImageResource(R.drawable.tokyo);
                break;
            case 2:
                imageView.setImageResource(R.drawable.seoul);
                break;
            case 3:
                imageView.setImageResource(R.drawable.singapore);
                break;
            case 4:
                imageView.setImageResource(R.drawable.hongkong);
                break;
        }



        destinationName.setText(destinationsList.getName());

        destinationInfo.setText(destinationsList.getInfo());

    }
}