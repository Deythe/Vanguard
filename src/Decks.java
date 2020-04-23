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
    }

   public ArrayList<Cartes> melangéDeck() {
       ArrayList<Cartes> deckMélangé = new ArrayList<>();
       for(int i=0; i<this.getListeCarte().size(); i++){
           int taille=this.getListeCarte().size();
           int choix=(int) (Math.random() * taille)+1;
           deckMélangé.set(i,this.getListeCarte().get(choix));
           this.getListeCarte().remove(choix);
       }
       this.listeCarte=deckMélangé;
   }

   public ArrayList<Cartes> getListeCarte() {
       return listeCarte;
   }
}
