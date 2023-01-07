import java.util.Random;

public class Raca {
    private static String Raca;
    public static String getRaca(){
        return Raca;
    }
    public static void setRaca(){
        Random rnd = new Random();
        String[] Racas = {"Fullbring", "Quincy", "Shinigami", "Hollow", "Vaizard"};
        int x = rnd.nextInt(1, 10);
        switch (x){
            case 1,2,3,4:
                Raca = Racas[0];
                break;

            case 6:
                Raca = Racas[4];
                break;

            case 7,8:
                Raca = Racas[1];
                break;

            case 9,10:
                Raca = Racas[2];
                break;

            case 5:{
                Raca = Racas[3];
            }
        }
    }
}

