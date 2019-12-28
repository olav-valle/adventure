import java.util.HashMap;

/**
 * Represents a character object, used for both the player character (PC)
 * and all non-player characters (NPC) and enemies.
 * Important fields are name, description, inventory and location (current area).
 */
public class Character {

    /**
     * Builder for Character object.
     */
    public static class Builder{

        //name of character
        private String name;

        //character description
        private String bio;

        //items held by character
        private HashMap<String, Item> inventory;

        //current location of character
        private Area location;

        /**
         * Character builder. Parameter is a string with name of entity. Other buildable fields are
         * biography (withBio), inventory (withInventoryItem), and location (withLocation).
         * @param name String of characters full name.
         */
        //TODO make separate last, first, middle and nickname fields? Pseudonym?
        public Builder(String name)
        {
            if(name != null && !(name.isBlank())){
            this.name = name;
            }

            this.bio = "";

            this.inventory = new HashMap<>();

            //TODO figure this location shit out:
            // Some sort of exception handling, I guess?
            // Either in the getLocation method, or in the locations what might call it.
            // Not really sure how handling and Throwables work yet...
            this.location = null;
            // For now, just don't call getLocation on Characters without setting locations first.

        }

        public Builder withBio(String bio){
            if( bio != null){
                this.bio = bio;
            }
            return this;
        }



    }
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
