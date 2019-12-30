import java.util.List;
import java.util.Scanner;

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
        String input = "";

        if ( this.input != null && this.input.hasNext() ) {
            input = this.input.nextLine();
        }
        else{ input = "INVALID"; } //TODO should this be here, or handle the NULL on the callers end?

        return input;
    }

    /**
     * Returns an integer input by user, or -1 if input was not a valid integer
     * @return
     */
    public int getIntInput(){


        return 0;
    }

    /**
     * Returns
     * @return
     */
    public List<String> getCommandList()
    {
        if( input.hasNext() && !(input.next().isBlank()) ){

        }
    }
}
