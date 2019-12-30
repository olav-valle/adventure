import java.util.HashMap;
import java.util.Iterator;

/**
 * Class representing an area (a location, room, inside of a cupboard, etc..) in the game world.0
 */
public class Area {

    /**
     * Builder for Area objects.
     */
    public static class Builder{

        private String name; // Name of area
        private String description; // Description of area.
        private HashMap<String, Item> items; // Items located in the area.
        private HashMap<String, Area> exits; //String is name/direction of exit, i.e. "South", "Down" or "Door"

        /**
         * Area builder. Parameter is the name of the area. Other buildable fields are
         * description (withDescription), loot or items (withItems), and connections to
         * other areas, aka exits (withExits).
         * @param name Name of area.
         */
        public Builder(String name)
        {
            if(name != null && !(name.isBlank())){
                this.name = name;
            }

            this.description = ""; //Description of area is set to empty.
            this.items = new HashMap<>(); // Item objects located in this area.
            this.exits = new HashMap<>(); // The other Area objects that this Area is connected to.

        }

        /**
         * Sets the area description.
         * @param description String describing the area.
         * @return the Builder object being built
         */
        public Builder withDescription(String description)
        {
            this.description = description;

            return this;
        }

        /**
         * Adds an exit direction, along with the
         * @param exitDirection String describing exit direction or name.
         * @param connectedArea the Area object the exit leads to.
         * @return the Builder object being built
         */
        public Builder withExit(String exitDirection, Area connectedArea)
        {
            if(exitDirection != null && connectedArea != null) {
                exits.put(exitDirection, connectedArea);
            }

            return this;
        }

        /**
         * Adds items to location.
         * @return Builder object.
         */
        public Builder withItem(String itemDescription, Item item)
        {
            if( itemDescription != null && item != null){
                items.put(itemDescription, item);
            }

            return this;
        }

        /**
         * Builds an area object with the Builders currently set fields.
         * @return The Area class object.
         */
        public Area build()
        {
            Area area = new Area();

            area.name = this.name;
            area.description = this.description;
            area.exits = this.exits;
            area.items = this.items;

            return area;
        }
    }

    private String name; // Name of area
    private String description; // Description of area.
    private HashMap<String, Item> items; // Items located in the area.
    private HashMap<String, Area> exits; //String is name/direction of exit, i.e. "South", "Down" or "Door"
    /**
     * Area constructor. Class object is constructed with builder class.
     */
    private Area() { }

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
        return exits.keySet().iterator();
    }

    /**
     * Returns an iterator of the names of items in the area.
     * @return iterator of String item names/short descriptions
     */
    //TODO return keys, or the actual values (items) and use their getName() methods?
    // Having "local" names, that are not the actual item name seems useful, i.e find an "old dirty ring" (local name)
    // and it turning out to be "The One Ring" (actual Item object name field)
    public Iterator getItemNameIterator()
    {
        return items.keySet().iterator();
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
