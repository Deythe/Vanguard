import java.util.ArrayList;

public class Terrain {
    private Players Joueur;
    private Cartes[][] tableJoueur;

    public Terrain(Players joueur) {
        this.Joueur =joueur;
        this.tableJoueur = new Cartes[2][3];
    }

    public Cartes[][] getTableJoueur() {
        return tableJoueur;
    }

    public void initTerrain(){
        for(Cartes c : this.Joueur.getDeck().getListeCarte()){
            if (c.getGrade()==0 && c.isNormalUnit()){
                this.tableJoueur[0][1]= c;
                this.Joueur.getDeck().getListeCarte().remove(c);
                break;
            }
        }

       this.Joueur.setMain(new ArrayList<>());

       for(int i=0; i<5; i++){
            Phases.drawPhase(Joueur);
       }
    }

   public void printTerrain(){
        for(int i = 0; i< tableJoueur.length; i++){
            for(int j = 0; j< tableJoueur[i].length; j++){
                if(tableJoueur[i][j] != null){
                    System.out.print("X");
                }
                else{
                    System.out.print("R");
                }
            }
            System.out.println("");
        }
    }
}
