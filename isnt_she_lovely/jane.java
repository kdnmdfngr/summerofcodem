import java.util.*;
public class jane {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Welcome back, my friend. It's been a long time. Forgive me, but... what is your name?");
        String playerName = console.nextLine();
        System.out.println(playerName + "! That's a lovely name :) I'm sad to have forgotten it, but at least the novelty has come back, hearing your voice.");
        System.out.println("But our time is running out. " + playerName + ", I'm afraid i'll have to leave you again.");
        System.out.println("I'll get back in touch with you when I can. But for now... just rest, okay? This mess hasn't done you any good. \n I'll try to put you in a good dream, but there's not much I can do before the launch mechanics kick in.");
        System.out.println("Goodbye, " + playerName + ". 'Til we meet again.");
        console.close();
    }
}