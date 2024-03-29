import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner entra = new Scanner(System.in);
        List<String> nome = new ArrayList<>();
        List<Double> nota = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            System.out.println("Digite o seu nome: ");
            nome.add(entra.next());
            System.out.println("Digite a nota: ");
            nota.add(Double.valueOf(entra.next()));
        }
        System.out.println(nome);
        System.out.println(nota);
    }
}
