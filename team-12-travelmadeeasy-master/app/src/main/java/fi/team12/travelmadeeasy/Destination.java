package fi.team12.travelmadeeasy;

/**
 * @author Manish Subedi
 */
public class Destination {
    private final String name, info, categories;


    /**
     * constructor takes name information and category of the destination to be parameter
     * @param name
     * @param info
     * @param categories
     */
    public Destination (String name, String info, String categories) {
        this.name = name;
        this.info = info;
        this.categories = categories;
    }

    /**
     * return name of destination
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * return information about destination
     * @return
     */

    public String getInfo() {
        return info;
    }

    /**
     * method return category of destination
     * @return
     */

    public String getCategories() {
        return categories;
    }


    /**
     * toString method override to return information represent destination (it's name)
     * @return
     */
    @Override
    public String toString() {
        return name;
    }
}
