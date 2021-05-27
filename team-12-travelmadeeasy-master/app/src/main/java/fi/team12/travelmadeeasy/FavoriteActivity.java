package fi.team12.travelmadeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class FavoriteActivity extends AppCompatActivity {

    private ListView listView;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        sp = getSharedPreferences("Favorite adventure destination", MODE_PRIVATE);

        int adventuresp = sp.getInt("Saved adventure destination's index", 0);

        FavoriteDestinations favoriteDestinations = FavoriteDestinations.getFavoriteDestinations();

        listView = (ListView) findViewById(R.id.lvFavorite);

        listView.setAdapter(new ArrayAdapter<Destination>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                favoriteDestinations.getAllFavoriteDestinations())
        );

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent favoriteActivity2 = new Intent();
                favoriteActivity2.putExtra("Index of favorite destination", position);
                startActivity(favoriteActivity2);
            }
        });
    }
}