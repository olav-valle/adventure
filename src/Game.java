import java.util.HashMap;

public class Game {

    private final Character player;
    private HashMap<String, Character> characters;
    private HashMap<String, Area> areas;

    public Game()
    {
        areas = new HashMap<>();
        characters = new HashMap<>();
        player = new Character();
    }
}
