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

}
