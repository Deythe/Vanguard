import java.io.*;


public class Cartes {

    private int grade;
    private String name;
    private int shield;
    private int attackPoint;
    private boolean normalUnit;
    //private Triggers trigger;
    private boolean imaginaryGift;
    //private EffectPrimaire effectprimaire;
    private String clan; // Chaine de caractète
    private int critique;
    private String race;

    public Cartes(String mot, int i) throws IOException {
        File file = new File("/home/deythe/Documents/Vanguard/src/Clans/"+mot+"/filename"+i+".txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        this.grade=Integer.valueOf(br.readLine());
        this.name=br.readLine();
        this.shield=Integer.valueOf(br.readLine());
        this.attackPoint=Integer.valueOf(br.readLine());
        //this.trigger=
        br.readLine();
        this.imaginaryGift = Boolean.valueOf(br.readLine()).booleanValue();
        br.readLine();
        this.clan = br.readLine();
        this.critique=Integer.valueOf(br.readLine());
        this.race=br.readLine();
        this.normalUnit = Boolean.valueOf(br.readLine()).booleanValue();
    }

    public boolean isNormalUnit() {
        return normalUnit;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name+" = grade :"+this.grade+" Défense :"+this.shield+" Attaque :"+this.attackPoint+" Critique :"+this.critique+" Clan :"+this.clan+" Race :"+this.race;
    }
}


