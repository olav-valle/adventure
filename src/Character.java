import java.util.HashMap;

/**
 * Represents a character object, used for both the player character (PC)
 * and all non-player characters (NPC) and enemies.
 * Important fields are name, description, inventory and location (current area).
 */
public class Character {

    //name of character
    private String name;

    //character description
    private String bio;

    //items held by character
    private HashMap<String, Item> inventory;

    //current location of character
    private Area location;


    /**
     * Character object constructor.
     * @param name name of character.
     */
    public Character(String name)
    {
        this.name = name;
    }

}
