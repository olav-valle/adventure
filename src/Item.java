/**
 * Class representing items. Holds information about an item, including
 * item name, description and weight.
 */
public class Item {

    private String name;
    private String description;
    private int weight;

    //TODO implement different item types; weapon, consumable, etc...

    /**
     * Item object constructor. Only requires
     * @param name name of item.
     */
    public Item(String name)
    {
        this.name = name;
        this.weight = 0;
        this.description = "";
    }

    /**
     * Sets new item name.
     * @param newName new name of item
     */
    public void setName(String newName)
    {
        if((newName != null) && !(newName.isEmpty())){
            this.name = newName;
        }
    }

    /**
     * Set item description string.
     * @param description string describing item.
     */
    public void setDescription(String description)
    {
        if((description != null) && !(description.isEmpty()))
        {
            this.description = description;
        }
    }

    /**
     * Set item weight.
     * @param weight int value of item weight in metric grams.
     */
    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    /**
     * Returns item name.
     * @return item name as String.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns string description of item;
     * @return String describing item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns item weight as an int representing weight in metric grams. 1000g == 1kg.
     * @return item weight in grams
     */
    public int getWeight() {
        return weight;
    }
}
