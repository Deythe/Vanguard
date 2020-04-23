import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Players p1 = new Players();
        Menu.choixDeckPlayer(p1);
        p1.getTerrain().initTerrain();
        Phases.drawPhase(p1);
        System.out.println(p1.getTerrain().getTableJoueur()[0][1]);
        Phases.ridePhase(p1);
        System.out.println(p1.getTerrain().getTableJoueur()[0][1]);
    }
}
