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
public class PurposesActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purposes);


        //get reference
        Destinations destinations = Destinations.getDestinations();

        Purposes purposes = Purposes.getPurposes();

        //set adapter for listview
        listView = (ListView) findViewById(R.id.lvPurposes);
        listView.setAdapter(new ArrayAdapter<Purpose>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                purposes.getAllPurposes())
        );

        //set on item select
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent purposeActivity = new Intent(PurposesActivity.this, PurposesActivity2.class);
                purposeActivity.putExtra("Purpose's index", position);
                startActivity(purposeActivity);

            }
        });
    }
}