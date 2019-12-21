public class Item {

    private String name;
    private String description;
    private int weight;

    //TODO implement different item types; weapon, consumable, etc...

    /**
     * Item object constructor.
     * @param name name of item.
     */
    public Item(String name)
    {
        this.name = name;

    }

    public void setDescription(String description)
    {
        if((description != null) && !(description.isEmpty()))
        {

        }
    }


}
