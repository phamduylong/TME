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
public class HoneymoonDestinationsActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);


        //get intent and its extras
        Bundle bundle = getIntent().getExtras();
        int indexOfDestination = bundle.getInt("Destination's index");


        TextView destinationName = (TextView) findViewById(R.id.DestinationName);
        TextView destinationInfo = (TextView) findViewById(R.id.DestinationInfo);
        saveBtn = (Button) findViewById(R.id.saveBtn);

        Destination destinationsList = Destinations.getDestinations().getHoneymoonDestination(indexOfDestination);

        Destinations destinations = Destinations.getDestinations();

        FavoriteDestinations favoriteDestinationsList = FavoriteDestinations.getFavoriteDestinations();


        //set onclicklistener

        saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favoriteDestinationsList.addFavoriteDestinations(destinations.getHoneymoonDestination(indexOfDestination));
            }
        });


        imageView = (ImageView) findViewById(R.id.DestinationImage);


        //switch case to determine which picture shown

        switch (indexOfDestination) {
            case 0:
                imageView.setImageResource(R.drawable.hawaii);
                break;
            case 1:
                imageView.setImageResource(R.drawable.venice);
                break;
            case 2:
                imageView.setImageResource(R.drawable.santorini);
                break;
            case 3:
                imageView.setImageResource(R.drawable.paris);
                break;
            case 4:
                imageView.setImageResource(R.drawable.madeira);
                break;
        }



        destinationName.setText(destinationsList.getName());

        destinationInfo.setText(destinationsList.getInfo());



    }
}