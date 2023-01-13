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
                        System.out.println(Nome.getNome() + " Atacou com atk!");
                        if (Killers.getKiller1() == Inimigos.getTipoDoInimigo()){

                            System.out.println(Nome.getNome() + " Atacou Com Atk, Dano: " + Atributos.getAtk() * 2);
                            Inimigos.setHp(-Atributos.getAtk() * 2);
                        }
                        else {
                            System.out.println(Nome.getNome() + " Atacou Com Atk, Dano: " + Atributos.getAtk());
                            Inimigos.setHp(-Atributos.getAtk());
                        }
                        System.out.println(Inimigos.getTipoDoInimigo() + " Vida: " + Inimigos.getHp());
                    }
                    else if(resposta == 2){
                        i++;
                        if (Killers.getKiller1() == Inimigos.getTipoDoInimigo()){
                            System.out.println(Nome.getNome() + " Atacou Com Sp, Dano: " + Atributos.getSp() * 2);
                            Inimigos.setHp(-Atributos.getSp() * 2);
                        }
                        else {
                            System.out.println(Nome.getNome() + " Atacou Com Sp, Dano: " + Atributos.getSp());
                            Inimigos.setHp(-Atributos.getSp());
                        }
                        System.out.println(Inimigos.getTipoDoInimigo() + " Vida: " + Inimigos.getHp() );
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
                        System.out.println(Inimigos.getTipoDoInimigo() +" Atacou, Dano: " + Inimigos.getAtk());
                        Atributos.setSTA(-Inimigos.getAtk());
                        System.out.println("\nSua Vida: " + Atributos.getSTA());
                    } else{
                        i++;
                        System.out.println("\n" + Inimigos.getTipoDoInimigo() + "Derrotado");

                        Atributos.setXP((100 + Inimigos.getForcaLvl() ) * 2);
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
                System.out.println(Inimigos.getTipoDoInimigo() +" Atacou, Dano: " + Inimigos.getAtk());
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
                            System.out.println(Nome.getNome() + " Atacou Com Atk!");
                            if (Killers.getKiller1() == Inimigos.getTipoDoInimigo()){

                                System.out.println(Nome.getNome() + " Atacou Com Atk, Dano: " + Atributos.getAtk() * 2);
                                Inimigos.setHp(-Atributos.getAtk() * 2);
                            }
                            else {
                                System.out.println(Nome.getNome() + " Atacou Com Atk, Dano: " + Atributos.getAtk());
                                Inimigos.setHp(-Atributos.getAtk());
                            }

                            System.out.println("Vida Hollow: " + Inimigos.getHp());

                        } else if (resposta == 2) {
                            i++;
                            if (Killers.getKiller1() == Inimigos.getTipoDoInimigo()){
                                System.out.println(Nome.getNome() + " Atacou Com Sp, Dano: " + Atributos.getSp() * 2);
                                Inimigos.setHp(-Atributos.getSp() * 2);
                            }
                            else {
                                System.out.println(Nome.getNome() + " Atacou Com Sp, Dano: " + Atributos.getSp());
                                Inimigos.setHp(-Atributos.getSp());
                            }
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
                Atributos.setXP((100 + Inimigos.getForcaLvl() ) * 2);
            }
        }
        else {
            System.out.println("Voce foi derrotado");
        }

    }
}
