import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Class for handling user text input.
 */
public class Input {

    private Scanner input;

    /**
     * Constructor for the scanner, which handles player input.
     */
    public Input()
    {
        input = new Scanner(System.in);
    }

    /**
     * Returns the next line of system input as a string.
     * @return The next line of system input as a string.
     */
    public String getStringInput()
    {
        System.out.print(">");
        String input = "";

        if ( this.input != null && this.input.hasNextLine() ) {
            input = this.input.nextLine();
        }
        else{ input = "INVALID"; } //TODO should this be here, or handle the NULL on the callers end?

        return input;
    }

    /**
     * Returns an integer input by user, or -1 if input was not a valid integer
     * @return
     */
    public int getIntInput()
    {
        System.out.print(">");


        return 0;
    }

    /**
     * Returns a user input string of commands as a list, by separating the string by regex " ".
     * @return list of single words in a user input string.
     */
    public List<String> getCommandList()
    {
        System.out.print(">");

        List<String> inputList = new ArrayList<>();

        if( input.hasNext() && !(input.next().isBlank()) ){
            inputList = Arrays.asList(input.nextLine().split(" "));
        }
        return inputList;
    }

}
