import java.io.IOException;
import java.util.ArrayList;

public class TestDuJeu {
    public static void main(String[] args) throws IOException {
        Players p1 = new Players();
        Menu.choixDeckPlayer(p1);
        p1.getTerrain().initTerrain();

        ArrayList<Cartes> main = new ArrayList<>();
        int total=0;
        for(Cartes c : p1.getDeck().getListeCarte()){
            if(c.getGrade()==3){
                main.add(c);
                total++;
            }

            if(total==6){
                break;
            }
        }

        p1.setMain(main);

        for (Cartes c: p1.getMain()) {
            System.out.println(c);
        }

        Phases.ridePhase(p1);
    }
}
