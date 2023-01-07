import  java.util.Scanner;
public class Nome {
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome() {
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
