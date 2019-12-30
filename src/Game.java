
import java.util.HashMap;

public class Game {

    private Input input;

    private HashMap<String, Character> characters;
    private HashMap<String, Area> areas;

    private Character player;
    private String start;


    public Game()
    {
        input = new Input();

        areas = new HashMap<>();

        Area startArea = new Area.Builder("Nowhere")
                .withDescription("To the north, in the distance, you see smoke rising as if from a large fire. \n" +
                        "To the east, south and west, you see nothing of interest.")
                .build();

        start = startArea.getName();

        areas.put(startArea.getName(), startArea);

        characters = new HashMap<>(); //all NPCs are stored in HashMap

        player = makeCharacter(); //TODO refactor to menu option

        this.start();
    }

    /**
     * Starts a new game, and keeps it going until user exits the program.
     */
    private void start()
    {
        this.player.setLocation(areas.get(start));

        this.printIntro();
        System.out.println("What do you do?");
        this.requestAction();

    }

    /**
     * Requests an action input from the user.
     */
    private void requestAction()
    {

    }

    /**
     * Presents the user with an introduction to the game.
     */
    private void printIntro()
    {
        System.out.println("You are lost. Completely and utterly lost.");
        System.out.println(areas.get(player.getLocation()).getDescription());
    }


    /**
     * Walks the user through generating a character.
     * @return
     */
    private Character makeCharacter() {

        System.out.println("Hi there. What's your name, then?");
        String name = input.getStringInput();

        System.out.println("Hello, " + name + ".");
        System.out.println("So, what's your story? Tell me about yourself.");
        String bio = input.getStringInput();
        //TODO implement multiline bio field.
        // Find a way to handle line breaks in Input class?

        System.out.println("I see... Fascinating.");
        System.out.println("Well, welcome to the first day of the rest of your new life. Good luck!");

        //TODO add item selection
        //TODO add stat allocation.

        return new Character.Builder(name).withBio(bio).build();

    }


}
