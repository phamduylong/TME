package fi.team12.travelmadeeasy;

import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

public class FavoriteDestinations {
    private static final FavoriteDestinations favoriteDestinations = new FavoriteDestinations();
    private SharedPreferences sp;

    public void getSavedIndex () {

    }

    /**
     * Get reference to favorite destinations collection
     * @return
     */

    public static FavoriteDestinations getFavoriteDestinations() {
        return favoriteDestinations;
    }

    private List<Destination>favoriteDestinationsList;

    /**
     * private constructor
     */
    private FavoriteDestinations() {
        this.favoriteDestinationsList = new ArrayList<>();

    }

    /**
     * get favorite destination list (used by listview to list all favorites)
     * @return
     */

    public List<Destination> getAllFavoriteDestinations () {
        return this.favoriteDestinationsList;
    }

    /**
     * get a favorite destination in the list by refering to its index
     * @param indexOfFavoriteDestination
     * @return
     */

    public Destination getFavoriteDestination (int indexOfFavoriteDestination) {
        return this.favoriteDestinationsList.get(indexOfFavoriteDestination);
    }

    /**
     * add a destination to the favorite list
     * @param destination
     */

    public void addFavoriteDestinations (Destination destination) {
        this.favoriteDestinationsList.add(destination);
    }


}
