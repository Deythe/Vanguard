import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Players p1 = new Players();
        Menu.choixDeckPlayer(p1);
        p1.getTerrain().initTerrain();
        for(int i=0; i<6; i++){
            Phases.drawPhase(p1);
            Phases.ridePhase(p1);
        }
    }
}
