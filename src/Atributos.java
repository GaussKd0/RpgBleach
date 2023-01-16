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

            if(Raca.getRaca() == "Fullbring"){
                setSTA((getLvl() + 2) * 2);
                setDef((getLvl() + 1) * 2 );
                setAtk((getLvl() + 4) * 2 );
                setSP((getLvl() + 2) * 2);
                setVel((getLvl() + 1) * 2);
            }

            if(Raca.getRaca() == "Quincy"){
                setSTA((getLvl() + 4) * 4);
                setDef((getLvl() + 2) * 2);
                setAtk((getLvl() + 1) * 2);
                setSP((getLvl() + 6) * 6);
                setVel((getLvl() + 5) * 5);
            }

            if(Raca.getRaca() == "Shinigami"){
                setSTA((getLvl() + 7) * 7);
                setDef((getLvl() + 3) * 3);
                setAtk((getLvl() + 4) * 4);
                setSP((getLvl() + 5) * 5);
                setVel((getLvl() + 2) * 2);
            }

            if(Raca.getRaca() == "Hollow"){
                setSTA((getLvl() + 10) * 10);
                setDef((getLvl() + 4) * 4);
                setAtk((getLvl() + 6) * 6);
                setSP((getLvl() + 9) * 9);
                setVel((getLvl() + 1) * 2);
            }

            if(Raca.getRaca() == "Vaizard"){
                setSTA((getLvl() + 7) * 7 );
                setDef((getLvl() + 3) * 3);
                setAtk((getLvl() + 5) * 5);
                setSP((getLvl() + 15) * 15);
                setVel((getLvl() + 4) * 4);
            }
        }
        public static void XPLV(){
            if (XP == 100){
                Atributos.setLvl(1);
                System.out.println("Voce Subio Para O Lvl: " + Atributos.getLvl());
                Atributos.LvlUp();
            }
            if (XP == 500){
                Atributos.setLvl(2);
                System.out.println("Voce Subio Para O Lvl: " + Atributos.getLvl());
                Atributos.LvlUp();
            }
            if (XP == 1000){
                Atributos.setLvl(3);
                System.out.println("Voce Subio Para O Lvl: " + Atributos.getLvl());
                Atributos.LvlUp();
            }

        }
   }

