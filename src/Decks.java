import java.io.IOException;
import java.util.ArrayList;

public class Decks {
    private String name;
    private ArrayList<Cartes> listeCarte;

    public Decks(String a) {
        this.name = a;
        this.listeCarte = new ArrayList<>();
    }

    public void InitDeck() throws IOException {
        for(int i =0; i<50; i++){
            this.listeCarte.add(new Cartes(this.name, i));
        }
        this.melangeDeck();
    }

   public void melangeDeck() {
       ArrayList<Cartes> deckMelange = new ArrayList<>();
       int taille=this.getListeCarte().size();

       for(int i=0; i<taille; i++){
           int choix=(int)(Math.random()*this.getListeCarte().size());
           deckMelange.add(this.getListeCarte().get(choix));
           this.getListeCarte().remove(choix);
       }

       this.listeCarte=deckMelange;
   }

   public ArrayList<Cartes> getListeCarte() {
       return listeCarte;
   }
}
