import java.util.Scanner;

public class EndlessStrings1 {
    public static void main(String[] args) {

        // Scanner initiated
        Scanner keyboard = new Scanner(System.in);
        String userInput = "*";

        // Loop as far as the user is inserting data
        while (!userInput.equals("")) {

            System.out.print("\n(Press ENTER Key to Exit)? or \nEnter a string to PRINT: ");
            userInput = keyboard.nextLine();

            System.out.println(userInput);

        }
        // close scanner
        keyboard.close();
    }
}
