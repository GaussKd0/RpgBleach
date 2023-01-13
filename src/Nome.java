import  java.util.Scanner;
public class Nome {
    private static String Nome;
    public  static  String getNome() {
        return Nome;
    }

    public static void setNome() {
        System.out.println("Digite O Seu Nome");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        if (nome.length() == 0){
            for (int i = 1; i ==1;){
                System.out.println("Digite O Seu Nome");
                nome = scan.nextLine();
            }
            Nome = nome;
        }
        Nome = nome;
    }
}
