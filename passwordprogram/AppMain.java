//program outline
/* 1. greet user
    2. password check
    3. prompt user for password
    4. read
    5. check
    6. grant password or not
*/

import java.util.*;

public class AppMain {
    public static void main(String[] args) {

        // greet
        System.out.println("what is goody my gang");

        // password check!
        // password prompt first
        System.out.println("gimme the magic word. the single one you can describe EVERYTHING WITH");
        Scanner console = new Scanner(System.in);
        String magicWord = "gnarly";

        // read the password
        String guess = console.nextLine();

        while (!guess.equals(magicWord)) {
            System.out.println("no??? :(");

            // recheck

            System.out.println("like- boba tea. tesla in a bad way. fried chicken. party in the hollywood hills");

            // read password
            guess = console.nextLine();
        }
        // now password check
        if (guess.equals(magicWord)) {
            System.out.println("everything's gnarly :)");
            System.out.println("yippee!!!");
        }

        System.out.println("END OF PROGRAM");

        console.close();
    }
}