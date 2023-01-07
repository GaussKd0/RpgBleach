import java.util.Scanner;

public class Batalha {

    public static  void batalha(){

        while (Atributos.getSTA() > 0 || Inimigos.getHp() > 0){

            if (Atributos.getVel() >= Inimigos.getVelocidade()){
                Escolha1();

            }
            else if(Atributos.getVel() < Inimigos.getVelocidade()){
                Escolha2();
            }
        }
        System.out.println("Fim Da Batalha");
    }
    private static void Escolha1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Atk[1] Sp[2]");
        int i = 0;
        while (i == 0){
            int resposta =  scan.nextInt();
            switch (resposta){
                case 1:
                    i = 1;
                    System.out.println("Voce Atacou Seu Dano: " + Atributos.getAtk());
                    Inimigos.setHp(-Atributos.getAtk());
                    System.out.println("Vida Hollow: " + Inimigos.getHp());
                    if(Inimigos.getHp() > 0){
                        Atributos.setSTA(-Inimigos.getAtk());
                        System.out.println("Hollow Atacou Dano: " + Inimigos.getAtk() + " Seu Hp: " + Atributos.getSTA());
                    }
                    else {

                        System.out.println("Hollow Derrotado");
                        Atributos.setXP(100);

                    }
                case 2:
                    i =1;
                    System.out.println("Voce Atacou Seu Dano Com Sp: " + Atributos.getSp());
                    Inimigos.setHp(-Atributos.getSp());
                    System.out.println("Vida Hollow: " + Inimigos.getHp());
                    if(Inimigos.getHp() > 0){
                        Atributos.setSTA(-Inimigos.getAtk());
                        System.out.println("Hollow Atacou Dano: " + Inimigos.getAtk() + " Seu Hp: " + Atributos.getSTA());
                    }
                    else {
                        System.out.println("Hollow Derrotado");
                        Atributos.setXP(100);

                    }

                default:
                    System.out.println("Voce Não Escolheu Corretamente");

            }
            if(Atributos.getSTA() <= 0){
                System.out.println("Voce Foi Derrotado!");
            }

        }


    }
    private static void Escolha2(){
        Scanner scan = new Scanner(System.in);
        Atributos.setSTA(-Inimigos.getAtk());
        System.out.println("Hollow Atacou, Dano: " + Inimigos.getAtk() + "\nSua Vida: " + Atributos.getSTA());
        if (Atributos.getSTA() > 0){
            int i = 0;
            while (i == 0){
                System.out.println("Atk[1] Sp[2]");
                int resposta = scan.nextInt();
                switch (resposta){
                    case 1:
                        i = 1;
                        Inimigos.setHp(-Atributos.getAtk());
                        System.out.println("Voce Atacou Seu Dano: " + Atributos.getAtk());
                        System.out.println("Vida Hollow: " + Inimigos.getHp());
                        if(Inimigos.getHp() <= 0){
                            System.out.println("Hollow Derrotado");
                            Atributos.setXP(100);

                        }
                        else if(Atributos.getSTA() <= 0){
                            System.out.println("Voce Foi Derrotado");

                        }

                    case 2:
                        i = 1;
                        System.out.println("Voce Atacou Seu Dano Com Sp: " + Atributos.getSp());
                        Inimigos.setHp(-Atributos.getSp());
                        System.out.println("Vida Hollow: " + Inimigos.getHp());
                        if(Inimigos.getHp() <= 0){
                            System.out.println("Hollow Derrotado");
                            Atributos.setXP(100);

                        }
                        else if(Atributos.getSTA() <= 0){
                            System.out.println("Voce Foi Derrotado");

                        }
                    default:
                        System.out.println("Voce Não Escolheu Corretamente");
                }
            }

        }
        else{
            System.out.println("Voce Foi Derrotado!");
        }

    }
}
