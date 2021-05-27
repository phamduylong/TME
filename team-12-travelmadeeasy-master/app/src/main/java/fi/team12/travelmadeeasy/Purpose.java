package fi.team12.travelmadeeasy;


/**
 * @author Otabek Rakhimov
 */
public class Purpose {
    private String purpose;

    /**
     * Return purpose of the trip
     * @return
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Constructor
     * @param purpose
     */
    public Purpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * Represent the content inside with a toString method
     * @return
     */
    //Helps represent content inside
    @Override
    public String toString() {
        return purpose;
    }
}
