public class Inimigos {
    private static String TipoDoInimigo;
    private static int Atk;
    private static int Hp;
    private static int Velocidade;

    public static String TipoDoInimigo(){
        return TipoDoInimigo();
    }

    public static int getAtk(){

        return Atk;
    }
    public static int getVelocidade(){
        return Velocidade;
    }
    public static int getHp(){
        return Hp;
    }

    public  static void setHp(int HP){
        Hp += HP;

    }
    public static void setVelocidade(int VELOCIDADE){
        Velocidade = VELOCIDADE;
    }

    public static void setAtk(int ATK){
        Atk = ATK;
    }
    public static void setTipoInimigo(String TIPODOINIMIGO){
        TipoDoInimigo = TIPODOINIMIGO;
    }

}
