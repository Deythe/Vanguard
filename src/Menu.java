import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void choixDeckPlayer(Players joueur) throws IOException {
        int choix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("Quel deck voulais vous jouer?");
        System.out.println("1: Kagero");
        choix = Integer.parseInt(sc.nextLine());
        switch(choix){
            case 1:
                joueur.setDeck(new Decks("Kagero"));
                joueur.getDeck().InitDeck();
                break;
        }
    }
}
