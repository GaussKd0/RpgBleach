public class Iniciar {
    public static void main(String[] args){
        Settar.SettarInformacoes();
        Tipo.SetarTipoInimigo();
        System.out.println("Tipo Do Inimigo: " + Tipo.getTipoInimigo());
        Inimigos.setInimigoRnd(1);
        Batalha.batalha();
    }
}
