import java.util.Random;
import java.util.Scanner;

public class Batalha {

    public static  void batalha(){
        while (Atributos.getSTA() >= 0 || Inimigos.getHp() >= 0){

            if (Atributos.getVel() >= Inimigos.getVelocidade()){
                Escolha();

            }
            else if(Atributos.getVel() < Inimigos.getVelocidade()){
                Escolha2();
            }

            if (Atributos.getSTA() <=0){
                break;

            } else if (Inimigos.getHp() <= 0) {
                break;
            }
        }
        System.out.println("Fim Da Batalha");
    }

    public static void Escolha(){
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        for (int i =0; i == 0;){
            System.out.println("[1] ATK [2]SP");
            int resposta = scan.nextInt();
            switch (rnd.nextInt(1,10)){
                case 1,2,3,4,5,6,7,8,9:
                    if (resposta == 1){
                        i++;
                        System.out.println("Voce atacou com atk!");
                        Inimigos.setHp(-Atributos.getAtk());
                        System.out.println("Vida Hollow: " + Inimigos.getHp() );
                    }
                    else if(resposta == 2){
                        i++;
                        System.out.println("Voce atacou com Sp, Dano" + Atributos.getSp() );
                        Inimigos.setHp(-Atributos.getSp());
                        System.out.println("Vida Hollow: " + Inimigos.getHp() );
                    }
                    break;
                case 10:
                    System.out.println("Errou Ataque");
                    break;
            }

            switch (rnd.nextInt(1,10)){
                case 1,2,3,4,5,6,7,8,9:
                    if(Inimigos.getHp() > 0 ){
                        i++;
                        System.out.println("Hollow Atacou, Dano: " + Inimigos.getAtk());
                        Atributos.setSTA(-Inimigos.getAtk());
                        System.out.println("\nSua Vida: " + Atributos.getSTA());
                    } else{
                        i++;
                        System.out.println("\nHollow Derrotado");
                        Atributos.setXP(100);
                    }
                    break;
                case 10:
                    System.out.println("Errou Ataque");
                    break;
            }

        }

    }
    public static  void Escolha2(){
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        switch (rnd.nextInt(1,10)){
            case 1,2,3,4,5,6,7,8,9:
                System.out.println("Hollow Atacou, Dano: " + Inimigos.getAtk());
                Atributos.setSTA(-Inimigos.getAtk());
                System.out.println("\nSua Vida: " + Atributos.getSTA());
                break;
            case 10:
                System.out.println("Errou Ataque");
                break;
        }

        if (Atributos.getSTA() > 0){
            for (int i =0; i == 0;) {
                System.out.println("[1] ATK [2]SP");
                int resposta = scan.nextInt();
                switch (rnd.nextInt(1,10)){
                    case 1,2,3,4,5,6,7,8,9:
                        if (resposta == 1) {
                            i++;
                            System.out.println("Voce atacou com atk!");
                            Inimigos.setHp(-Atributos.getAtk());
                            System.out.println("Vida Hollow: " + Inimigos.getHp());
                        } else if (resposta == 2) {
                            i++;
                            System.out.println("Voce atacou com sp");
                            Inimigos.setHp(-Atributos.getSp());
                            System.out.println("Vida Hollow: " + Inimigos.getHp());
                        }
                        break;
                    case 10:
                        System.out.println("Errou Ataque");
                        break;
                }

            }
            if (Inimigos.getHp() <= 0){
                System.out.println("Hollow Derrotado");
                Atributos.setXP(100);
            }
        }
        else {
            System.out.println("Voce foi derrotado");
        }

    }
}
