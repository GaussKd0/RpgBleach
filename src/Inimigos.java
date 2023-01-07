import java.util.Random;

public class Inimigos {
    private static String TipoDoInimigo;
    private static int Atk;
    private static int Hp;
    private static int Velocidade;
    private  static int Lvl;
    private static int ForcaLvl;


    public static int getForcaLvl(){
        return ForcaLvl;
    }
    public static int getLvl(){

        return Lvl;
    }
    public static String getTipoDoInimigo()
    {
        return TipoDoInimigo;

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

    public static void setLvl(int LVL){
        Lvl = LVL;
    }

    public static void setForcaLvl(int FORCALVL){
        ForcaLvl = FORCALVL;
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
    public static void setInimigoRnd(){
        Random Inimigos = new Random();
        Inimigos.nextInt(1,4);
        switch (Inimigos.nextInt(1,4)){
            case 1:
                TipoDoInimigo = "Hollow";
                calcularForcaLvl();
                setLvl(1);
                setHp(100 + getForcaLvl());
                setAtk(30 + getForcaLvl());
                setVelocidade(15 + getForcaLvl());
                break;
            case 2:
        }
    }

    public static void calcularForcaLvl(){
        if(getTipoDoInimigo() == "Hollow"){
            setForcaLvl(getLvl() + 2 * 2);
        }
    }
}
