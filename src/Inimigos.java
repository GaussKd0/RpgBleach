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
    public static void setInimigoRnd(int Lvl){
        Random Inimigos = new Random();
        switch (Inimigos.nextInt(1,6)){
            case 1:
                TipoDoInimigo = "Hollow";
                calcularForcaLvl();
                setLvl(Lvl);
                setHp(110 + getForcaLvl());
                setAtk(30 + getForcaLvl());
                setVelocidade(15 + getForcaLvl());
                break;
            case 2:
                TipoDoInimigo = "Quincy";
                calcularForcaLvl();
                setLvl(Lvl);
                setHp(80 + getForcaLvl());
                setAtk(50 + getForcaLvl());
                setVelocidade(30 + getForcaLvl());
            case 3:
                TipoDoInimigo = "Arrancar";
                calcularForcaLvl();
                setLvl(Lvl);
                setHp(120 + getForcaLvl());
                setAtk(100 + getForcaLvl());
                setVelocidade(25 + getForcaLvl());
            case 4:
                TipoDoInimigo = "Vizard";
                calcularForcaLvl();
                setLvl(Lvl);
                setHp(150 + getForcaLvl());
                setAtk(120 + getForcaLvl());
                setVelocidade(40 + getForcaLvl());
            case 5:
                TipoDoInimigo = "Shinigami";
                calcularForcaLvl();
                setLvl(Lvl);
                setHp(100 + getForcaLvl());
                setAtk(40 + getForcaLvl());
                setVelocidade(20 + getForcaLvl());
            case 6:
                TipoDoInimigo = "Fullbring";
                calcularForcaLvl();
                setLvl(Lvl);
                setHp(80 + getForcaLvl());
                setAtk(50 + getForcaLvl());
                setVelocidade(15 + getForcaLvl());
        }
    }

    public static void calcularForcaLvl(){
        if(getTipoDoInimigo() == "Hollow"){
            setForcaLvl(getLvl() + (3 * 3));
            setHp(getLvl() * 3);
        }
        if(getTipoDoInimigo() == "Quincy"){
            setForcaLvl(getLvl() + (3 * 3));
        }
        if(getTipoDoInimigo() == "Arrancar"){
            setForcaLvl(getLvl() + (5 * 6));
        }
        if(getTipoDoInimigo() == "Fullbring"){
            setForcaLvl(getLvl() + (2 * 2));
        }
        if(getTipoDoInimigo() == "Vizard"){
            setForcaLvl(getLvl() + (5 * 7));
        }
        if(getTipoDoInimigo() == "Shinigami"){
            setForcaLvl(getLvl() + (3 * 4));
        }
    }
}
