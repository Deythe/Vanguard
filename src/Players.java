import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    private String name;
    private Decks deck;
    private ArrayList<Cartes> main;
    private ArrayList<Cartes> defausse;
    private Terrain terrain;
    private int blast;

    public Players() {
        System.out.println("Veuillez choisir un nom pour cette partie");
        this.name = new Scanner(System.in).nextLine();
        this.deck = null;
        this.main = null;
        this.defausse = null;
        this.terrain=new Terrain(this);
        this.blast=0;
        System.out.println("Bonjour "+this.name);
    }

    public String toString(){
        return this.name;
    }

    public void setDeck(Decks deck) {
        this.deck = deck;
    }

    public Decks getDeck() {
        return deck;
    }

    public ArrayList<Cartes> getMain() {
        return main;
    }

    public void setMain(ArrayList<Cartes> main) {
        this.main = main;
    }

    public void printMain(){
        for(int i=0; i<this.main.size(); i++){
            System.out.println(i+1 +": "+this.main.get(i));
        }
    }

    public Terrain getTerrain(){
        return this.terrain;
    }

    public int getBlast() {
        return blast;
    }
}
