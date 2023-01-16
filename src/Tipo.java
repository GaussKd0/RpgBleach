import java.util.Random;

public class Tipo {
    private static String Tipo;
    private static String TipoInimigo;

    public static String getTipo(){
        return Tipo;
    }

    public static String getTipoInimigo(){
        return TipoInimigo;
    }
    public static void SetarTipo(){
        Random rnd = new Random();
        //Speed > Power
        //Speed < Tech
        //Power > Tech
        // Mind || Heart
        String Tipos[] = {"Mind", "Heart" , "Tech", "Power", "Speed"};
        var R = rnd.nextInt(0,4);
        Tipo = Tipos[R];
    }
    public static void SetarTipoInimigo(){
        Random rnd = new Random();
        //Speed > Power
        //Speed < Tech
        //Power > Tech
        // Mind || Heart
        String Tipos[] = {"Mind", "Heart" , "Tech", "Power", "Speed"};
        var R = rnd.nextInt(0,4);
        TipoInimigo = Tipos[R];
    }
}
