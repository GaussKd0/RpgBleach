import java.util.Random;

public class Resurrection {
    private static String Resurrection;
    public static void SetResurrection(){
        Random rnd = new Random();
        String[] Resurrections = {"", "", "", "", ""};
        int x = rnd.nextInt(1, 10);
        switch (x){
            case 1,2,3,4:
                Atributos.setAtk(20);
                Resurrection = Resurrections [0];
                break;

            case 6:
                Atributos.setAtk(50);
                Resurrection = Resurrections [4];
                break;

            case 7,8:
                Atributos.setAtk(25);
                Resurrection = Resurrections [1];
                break;

            case 9,10:
                Atributos.setAtk(30);
                Resurrection = Resurrections [2];
                break;

            case 5:{
                Atributos.setAtk(100);
                Resurrection = Resurrections [3];
            }
        }
    }
}
