package fi.team12.travelmadeeasy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Long Pham
 */
public class Purposes {
    private static final Purposes purposes = new Purposes();

    /**
     * Get reference to Destinations storage (Singleton)
     * @return
     */

    public static Purposes getPurposes() {
        return purposes;
    }

    /**
     * private constructor used to store data
     */
    private List<Purpose> purposesList;

    private Purposes() {
        purposesList = new ArrayList<>();
        purposesList.add(new Purpose("Leisure Trip"));
        purposesList.add(new Purpose("Family Trip"));
        purposesList.add(new Purpose("Honeymoon Trip"));
        purposesList.add(new Purpose("Modern World Travel"));
        purposesList.add(new Purpose("Historic Landmark Road Trip"));
        purposesList.add(new Purpose("Adventure Trip"));
    }

    /**
     * method to get all purposes used by listview
     * @return
     */
    public List<Purpose> getAllPurposes() {
        return this.purposesList;
    }

    /**
     * method to get a purpose referring to its index in arraylist
     * @param indexOfPurpose
     * @return
     */
    public Purpose getPurpose (int indexOfPurpose) {
        return this.purposesList.get(indexOfPurpose);
    }


    /**
     * method used to add purpose to singleton class
     * @param purpose
     */
    public void addPurpose (Purpose purpose) {
        this.purposesList.add(purpose);
    }
}

