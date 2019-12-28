import java.util.Scanner;

public class Input {

    Scanner input;

    /**
     * Constructor for the scanner, which handles player input.
     */
    public Input()
    {
        input = new Scanner(System.in);
    }


    public String getInputAsString()
    {
        String input = "";

        if ( this.input != null && this.input.hasNext() ) {
            this.input.nextLine();
        }
        else{ input = "INVALID"; }

        return input;
    }
}
