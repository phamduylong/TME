package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AdventureDestinationsActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button saveBtn;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);

        //Get intent and integer (index of destination)
        Bundle bundle = getIntent().getExtras();
        int indexOfDestination = bundle.getInt("Destination's index");


        sp = getSharedPreferences("Favorite adventure destinations", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();


        TextView destinationName = (TextView) findViewById(R.id.DestinationName);
        TextView destinationInfo = (TextView) findViewById(R.id.DestinationInfo);



        Destination destinationsList = Destinations.getDestinations().getAdventureDestination(indexOfDestination);

        Destinations destinations = Destinations.getDestinations();

        FavoriteDestinations favoriteDestinationsList = FavoriteDestinations.getFavoriteDestinations();

        saveBtn = (Button) findViewById(R.id.saveBtn);


        //Setting onclicklistener for save button (not done yet)
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favoriteDestinationsList.addFavoriteDestinations(destinations.getAdventureDestination(indexOfDestination));
                editor.putInt("Saved adventure destination's index", indexOfDestination);
                editor.commit();
            }
        });


        imageView = (ImageView) findViewById(R.id.DestinationImage);


        //Using switch case to define which destination was chosen by user by its index, and then show the image of that destination
        switch (indexOfDestination) {
            case 0:
                imageView.setImageResource(R.drawable.amalfi_coast);
                break;
            case 1:
                imageView.setImageResource(R.drawable.patagonia);
                break;
            case 2:
                imageView.setImageResource(R.drawable.austria);
                break;
            case 3:
                imageView.setImageResource(R.drawable.galapagosislands);
                break;

        }
        destinationName.setText(destinationsList.getName());
        destinationInfo.setText(destinationsList.getInfo());
    }
}