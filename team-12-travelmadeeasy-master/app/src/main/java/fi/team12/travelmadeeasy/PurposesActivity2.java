package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * @author Long Pham
 */
public class PurposesActivity2 extends AppCompatActivity {


    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purposes2);
        //get intent and extras
        Bundle bundle = getIntent().getExtras();
        int indexOfPurpose = bundle.getInt("Purpose's index");

        //get reference
        Destinations destinations = Destinations.getDestinations();



        listView = (ListView) findViewById(R.id.lvDestinations);


        //using if to check the index of purpose, then switch to the suitable activity (another listview)
        if (indexOfPurpose == 0) {
            listView.setAdapter(new ArrayAdapter<Destination>(
                    this,
                    android.R.layout.simple_expandable_list_item_1,
                    destinations.getAllLeisureDestinations())
            );

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent destinationActivity = new Intent(PurposesActivity2.this, LeisureDestinationsActivity.class);
                    destinationActivity.putExtra("Destination's index", position);
                    startActivity(destinationActivity);

                }
            });
        }

        if (indexOfPurpose == 1) {
            listView.setAdapter(new ArrayAdapter<Destination>(
                    this,
                    android.R.layout.simple_expandable_list_item_1,
                    destinations.getAllFamilyDestinations())
            );

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent destinationActivity = new Intent(PurposesActivity2.this, FamilyDestinationsActivity.class);
                    destinationActivity.putExtra("Destination's index", position);
                    startActivity(destinationActivity);

                }
            });
        }

        if (indexOfPurpose == 2) {
            listView.setAdapter(new ArrayAdapter<Destination>(
                    this,
                    android.R.layout.simple_expandable_list_item_1,
                    destinations.getAllHoneymoonDestinations())
            );

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent destinationActivity = new Intent(PurposesActivity2.this, HoneymoonDestinationsActivity.class);
                    destinationActivity.putExtra("Destination's index", position);
                    startActivity(destinationActivity);

                }
            });
        }

        if (indexOfPurpose == 3) {
            listView.setAdapter(new ArrayAdapter<Destination>(
                    this,
                    android.R.layout.simple_expandable_list_item_1,
                    destinations.getAllModernDestinations())
            );

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent destinationActivity = new Intent(PurposesActivity2.this, ModernDestinationsActivity.class);
                    destinationActivity.putExtra("Destination's index", position);
                    startActivity(destinationActivity);

                }
            });
        }

        if (indexOfPurpose == 4) {
            listView.setAdapter(new ArrayAdapter<Destination>(
                    this,
                    android.R.layout.simple_expandable_list_item_1,
                    destinations.getAllHistoricDestinations())
            );

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent destinationActivity = new Intent(PurposesActivity2.this, HistoricDestinationsActivity.class);
                    destinationActivity.putExtra("Destination's index", position);
                    startActivity(destinationActivity);

                }
            });
        }

        if (indexOfPurpose == 5) {
            listView.setAdapter(new ArrayAdapter<Destination>(
                    this,
                    android.R.layout.simple_expandable_list_item_1,
                    destinations.getAllAdventureDestinations())
            );

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent destinationActivity = new Intent(PurposesActivity2.this, AdventureDestinationsActivity.class);
                    destinationActivity.putExtra("Destination's index", position);
                    startActivity(destinationActivity);

                }
            });
        }
        }
        }
