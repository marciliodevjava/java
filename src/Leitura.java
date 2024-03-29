import java.util.Scanner;

public class Leitura {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = entrada.next().trim();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.printf("Prazer %s, tudo bem com você?", nome);
    }
}
