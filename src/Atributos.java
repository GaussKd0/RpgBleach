public class Atributos{

    private static int XP;
    private static int Lvl;
    private static int STA;
    private static int ATK;
    private static int DEF;
    private static int SP;
    private static int Vel;


    public static int getVel(){
        return Vel;
    }
    public static int getXP(){
        return XP;
    }
    public static int getLvl() {
        return Lvl;
    }

    public static int getSTA(){

        return STA;
    }

    public static int getAtk(){
        return ATK;
    }

    public static int getDef(){

        return DEF;
    }

    public static int getSp(){

        return SP;
    }

    public static void setSP(int sp){

        SP += sp;
    }
    public static void setDef(int def){

        DEF += def;
    }

    public static void setAtk(int atk){

        ATK += atk;
    }
    public static void setSTA(int sta){

        STA += sta;
    }

    public static void setLvl(int lvl) {
        Lvl = lvl;
    }

    public static void setXP(int xp) {
        XP += xp;
    }

    public static  void setVel(int Velocidade){

        Vel += Velocidade;
    }

    public static void atributos(){

        if(Raca.getRaca() == "Fullbring"){
            setXP(0);
            setSTA(250);
            setDef(10);
            setAtk(100);
            setSP(50);
            setVel(10);
        }

        if(Raca.getRaca() == "Quincy"){
            setXP(0);
            setSTA(260);
            setDef(20);
            setAtk(50);
            setSP(250);
            setVel(60);
        }

        if(Raca.getRaca() == "Shinigami"){
            setXP(0);
            setSTA(350);
            setDef(25);
            setAtk(125);
            setSP(200);
            setVel(30);
        }

        if(Raca.getRaca() == "Hollow"){
            setXP(0);
            setSTA(400);
            setDef(40);
            setAtk(200);
            setSP(350);
            setVel(25);
        }

        if(Raca.getRaca() == "Vaizard"){
            setXP(0);
            setSTA(370);
            setDef(30);
            setAtk(150);
            setSP(500);
            setVel(40);
        }
    }
    public static void LvlUp(){

        if(XP >= 100){
            if(Raca.getRaca() == "Fullbring"){
                setSTA(2);
                setDef(1);
                setAtk(4);
                setSP(2);
                setVel(1);
            }

            if(Raca.getRaca() == "Quincy"){
                setSTA(4);
                setDef(2);
                setAtk(1);
                setSP(6);
                setVel(5);
            }

            if(Raca.getRaca() == "Shinigami"){
                setSTA(7);
                setDef(3);
                setAtk(4);
                setSP(5);
                setVel(2);
            }

            if(Raca.getRaca() == "Hollow"){
                setSTA(10);
                setDef(4);
                setAtk(6);
                setSP(9);
                setVel(1);
            }

            if(Raca.getRaca() == "Vaizard"){
                setSTA(7);
                setDef(3);
                setAtk(5);
                setSP(15);
                setVel(4);
            }
        }
    }

}
