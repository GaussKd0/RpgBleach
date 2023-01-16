public class Settar {

    public static void SettarInformacoes(){
        Nome.setNome();
        Raca.setRaca();
        Tipo.SetarTipo();
        Atributos.atributos();
        Killers.setKiller();

        System.out.println("Sua Raca: " + Raca.getRaca());

        if (Raca.getRaca() == "Shinigami" || Raca.getRaca() == "Vaizard"){

            Espadas.SetEspada();
            System.out.println("Sua Espada: " + Espadas.getEspada());
        }

        System.out.println("Seu Killer É: " + Killers.getKiller1());

        System.out.println("Seu Tipo: " + Tipo.getTipo());

        System.out.println("Seus Atributos\n" + "ATK: " + Atributos.getAtk() + "\nSP: " + Atributos.getSp() + "\nDEF: " + Atributos.getDef()
                + "\nSTA: " + Atributos.getSTA() +"\nSpeed: " + Atributos.getVel()
        );

    }
    public static void PuxarInformacoes(){
        System.out.println("Sua Raca: " + Raca.getRaca());

        if (Raca.getRaca() == "Shinigami" || Raca.getRaca() == "Vaizard"){

            Espadas.SetEspada();
            System.out.println("Sua Espada: " + Espadas.getEspada());
        }

        System.out.println("Seu Killer É: " + Killers.getKiller1());

        System.out.println("Seu Tipo: " + Tipo.getTipo());

        System.out.println("Seus Atributos\n" + "ATK: " + Atributos.getAtk() + "\nSP: " + Atributos.getSp() + "\nDEF: " + Atributos.getDef()
                + "\nSTA: " + Atributos.getSTA() +"\nSpeed: " + Atributos.getVel()
        );
    }

}
