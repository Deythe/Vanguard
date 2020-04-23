import java.util.ArrayList;
import java.util.Scanner;

public class Phases {
    public static void drawPhase(Players j){
        j.getMain().add(j.getDeck().getListeCarte().get(1));
        j.getDeck().getListeCarte().remove(1);
    }

    public static void ridePhase(Players j){
        j.printMain();

        if(verifGassist(j)) {

            System.out.println("Veuillez ride une carte de votre main");
            int choix;
            choix = Integer.parseInt(new Scanner(System.in).nextLine()) - 1;
            while (j.getMain().get(choix).getGrade() != j.getTerrain().getTableJoueur()[0][1].getGrade() && j.getMain().get(choix).getGrade() != j.getTerrain().getTableJoueur()[0][1].getGrade() + 1) {
                System.out.println("Erreur : la carte sélectionné n'a pas le bon grade");
                choix = Integer.parseInt(new Scanner(System.in).nextLine()) - 1;
            }

            j.getTerrain().getTableJoueur()[0][1] = j.getMain().get(choix);
            j.getMain().remove(j.getMain().get(choix));
        }
    }

    public static boolean verifGassist(Players j){
        int nb=0;
        for (Cartes c: j.getMain()) {
            if(c.getGrade()!=j.getTerrain().getTableJoueur()[0][1].getGrade()+1){
                nb++;
            }
        }

        if(nb==j.getMain().size()){
            System.out.println("Vous ne pouvez pas ride de grade supérieur");
            System.out.println("Voulez vous Gassist : 1=Oui/2=Non");
            int choix = Integer.parseInt(new Scanner(System.in).nextLine());

            if(choix==1) {
                System.out.println("Veuillez vous défausser de 2 cartes de votre main");
                int carte1 = Integer.parseInt(new Scanner(System.in).nextLine())-1;
                int carte2 = Integer.parseInt(new Scanner(System.in).nextLine())-1;

                while(carte1<0 || carte1>j.getMain().size()-1 || carte2<0 || carte2>j.getMain().size()-1){
                    System.out.println("Erreur : Veuillez recommencé");
                    carte1 = Integer.parseInt(new Scanner(System.in).nextLine())-1;
                    carte2 = Integer.parseInt(new Scanner(System.in).nextLine())-1;
                }

                j.getMain().remove(carte1);
                j.getMain().remove(carte2);

                ArrayList<Cartes> look = new ArrayList<>();
                int pasDeChance = 0;

                for (int i = 0; i < 5; i++) {
                    look.add(j.getDeck().getListeCarte().get(i));
                    j.getDeck().getListeCarte().remove(i);
                    System.out.println(i+1+"- "+look.get(i));

                    if(look.get(i).getGrade() != j.getTerrain().getTableJoueur()[0][1].getGrade() + 1){
                        pasDeChance++;
                    }
                }

                if(pasDeChance==5){
                    for(int i=0; i<5; i++){
                        j.getDeck().getListeCarte().add(j.getDeck().getListeCarte().size()-i, look.get(i));
                    }
                    return false;
                }

                else {
                    int choixCarte;
                    do {
                        System.out.println("Veuillez choisir une carte de grade supérieur de 1 à votre Vanguard");
                        choixCarte = Integer.parseInt(new Scanner(System.in).nextLine())-1;

                    }while(look.get(choixCarte).getGrade() != j.getTerrain().getTableJoueur()[0][1].getGrade() + 1);

                    j.getTerrain().getTableJoueur()[0][1]=look.get(choix);
                    look.remove(choix);

                    for(int i=0; i<4; i++){
                        j.getDeck().getListeCarte().add(j.getDeck().getListeCarte().size()-i, look.get(i));
                    }
                }
            }

            return false;
        }

        else{
            return true;
        }
    }
}
