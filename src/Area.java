import java.util.HashMap;
import java.util.Iterator;

public class Area {

    private String name; // Name of area

    private String description; // Description of area.

    private HashMap<String, Item> items; // Items located in the area.

    private HashMap<String, Area> exits;
    //String is name/direction of exit, i.e. "South", "Down" or "Door"

    /**
     * Area constructor. The only parameter is the name of the area.
     * Description, items and exits are all initialised as empty,
     * and set through setters when and if required.
     * @param name the Name of the area.
     */
    public Area(String name)
    {
        this.name = name;

        this.description = ""; //Description of area.
        this.items = new HashMap<>(); // Item objects located in this area.
        this.exits = new HashMap<>(); // The other Area objects that this Area is connected to.

    }

    /**
     * Returns area name.
     * @return area name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets new name of area.
     * @param newName the new name of the area.
     */
    public void setName(String newName)
    {
        if( (newName != null) && !(newName.isBlank()) ) {
            this.name = newName;
        }
    }

    /**
     * Returns the description of this area.
     * @return description of area.
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
     * Returns an iterator with the names of this areas exits.
     * @return iterator of String names of this areas exits
     */
    public Iterator getExitNameIterator()
    {
        return exits.values().iterator();
    }

    /**
     * Returns the area connected to the specified exit.
     * @param exit the direction of the exit
     */
    public Area getAreaConnectedToExit(String exit)
    {
        return exits.get(exit);
    }
}
