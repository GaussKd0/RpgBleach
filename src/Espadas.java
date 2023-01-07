import java.util.Random;
import java.util.Scanner;

public class Espadas{

    private static String Espada;
    public static String getEspada(){
        return Espada;
    }
    public static void SetEspada(){
        Random rnd = new Random();
        String[] Espadas = {"Zangetsu", "Sode No Shirayuki", "Shinsō", "Nozarashi", "Kyoka Suigetsu "};
        int x = rnd.nextInt(1, 10);
        switch (x){
            case 1,2,3,4:
                Atributos.setAtk(20);
                Espada = Espadas[0];
                break;

            case 6:
                Atributos.setAtk(50);
                Espada = Espadas[4];
                break;

            case 7,8:
                Atributos.setAtk(25);
                Espada = Espadas[1];
                break;

            case 9,10:
                Atributos.setAtk(30);
                Espada = Espadas[2];
                break;

            case 5:{
                Atributos.setAtk(100);
                Espada = Espadas[3];
            }
       }
    }
    public static void TrocarEspada(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja Trocar Sua Espada [s] para sim e [n] para nao");
        String resposta = scan.nextLine();
        if(resposta == "s") {
            SetEspada();
            System.out.println("Sua Espada: " + getEspada());
        }
    }


}
