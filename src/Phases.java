import java.util.Scanner;

public class Phases {
    public static void drawPhase(Players j){
        j.getMain().add(j.getDeck().getListeCarte().get(1));
        j.getDeck().getListeCarte().remove(1);
    }

    public static void ridePhase(Players j){
        j.printMain();
        System.out.println("Veuillez ride une carte de votre main");
        int choix;
        choix = Integer.parseInt(new Scanner(System.in).nextLine());
        while(j.getMain().get(choix).getGrade()!=j.getTerrain().getTableJoueur()[0][1].getGrade() && j.getMain().get(choix).getGrade()!=j.getTerrain().getTableJoueur()[0][1].getGrade()+1){
            System.out.println("Erreur : la carte sélectionné n'a pas le bon grade");
            choix = Integer.parseInt(new Scanner(System.in).nextLine());
        }

        j.getTerrain().getTableJoueur()[0][1]=j.getMain().get(choix);
    }
}
