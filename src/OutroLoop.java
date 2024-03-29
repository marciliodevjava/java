import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner entra = new Scanner(System.in);
        List<String> nome = new ArrayList<>();
        List<Double> nota = new ArrayList<>();
        String resultado = "S";

        while (resultado.toUpperCase().equals("S")){
            System.out.println("Digite o seu nome: ");
            nome.add(entra.next());
            System.out.println("Digite a nota: ");
            nota.add(Double.valueOf(entra.next()));
            System.out.println("Deseja continua S - Sim N - Não");
            resultado = entra.next();
        }
        System.out.println(nome);
        System.out.println(nota);
    }
}
