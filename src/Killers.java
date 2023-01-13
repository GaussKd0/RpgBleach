import java.util.Random;
public class Killers{
    private static String Killer1;
    private static String Killer2;

    public static String getKiller1(){
        return Killer1;
    }
    public static void setKiller(){
        Random rnd = new Random();
        String[] Racas = {"Fullbring", "Quincy", "Shinigami", "Hollow", "Vaizard", "Arrancar"};
        int x = rnd.nextInt(1, 6);
        switch (x){
            case 1:
                Killer1 = Racas[0];
                break;

            case 2:
                Killer1 = Racas[1];
                break;

            case 3:
                Killer1 = Racas[2];
                break;

            case 4:
                Killer1 = Racas[3];
                break;

            case 5:
                Killer1 = Racas[4];
                break;
            case 6:
                Killer1 = Racas[5];
                break;
       }
    }
}
