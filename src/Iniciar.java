public class Iniciar {
    public static void main(String[] args){
        Raca.setRaca();
        Atributos.atributos();
        System.out.println("Sua Raca: " + Raca.getRaca());
        if (Raca.getRaca() == "Shinigami" || Raca.getRaca() == "Vaizard"){

            Espadas.SetEspada();
            System.out.println("Sua Espada: " + Espadas.getEspada());
        }

        System.out.println("Seus Atributos\n" + "ATK: " + Atributos.getAtk() + "\nSP: " + Atributos.getSp() + "\nDEF: " + Atributos.getDef()
                + "\nSTA: " + Atributos.getSTA() +"\nSpeed: " + Atributos.getVel()
        );
        Inimigos.setHp(350);
        Inimigos.setVelocidade(10);
        Inimigos.setAtk(30);
        Batalha.batalha();

    }
}
