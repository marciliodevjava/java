import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String asterisco = "***********************************************************";
        String dadosCliente = "Dados iniciais do cliente:";
        String nome = "Nome:";
        String tipoConta = "Tipo conta:";
        String saldo = "Saldo inicial:";
        String nomeCliente = "Marcilio Zanatta Bezerra da Silva";
        String conta = "Corrente";
        Double dinheiro = 2500.0;
        int sair = 4;
        String consultaSaldo = "1 - Consultar saldo";
        String receberValor = "2 - Receber valor";
        String transferirValor = "3 - Transferir valor";
        String sairString = "4 - Sair";

        System.out.println(asterisco);
        System.out.println(dadosCliente);
        System.out.println();
        System.out.println(nome + "            " + nomeCliente);
        System.out.println(tipoConta + "      " + conta);
        System.out.println(saldo + "   R$: " + dinheiro);
        System.out.println(asterisco);

        while (sair == 4) {
            System.out.println();
            System.out.println("Operações:");
            System.out.println();
            System.out.println(consultaSaldo);
            System.out.println(receberValor);
            System.out.println(transferirValor);
            System.out.println(sairString);
            System.out.println();
            System.out.printf("Digite a operação desejada: ");
            Integer valor = Integer.valueOf(entrada.next());
            System.out.println();
            switch (valor) {
                case 1:
                    System.out.println("Saldo R$: " + dinheiro);
                    break;
                case 2:
                    System.out.println("Qual valor deseja receber R$:");
                    Double valorReceber = Double.valueOf(entrada.next());
                    dinheiro += valorReceber;
                    System.out.println("Saldo R$: " + dinheiro);
                    break;
                case 3:
                    System.out.println("Qual valor deseja Transferir R$:");
                    Double valorTransferir = Double.valueOf(entrada.next());
                    if (dinheiro >= valorTransferir) {
                        dinheiro -= valorTransferir;
                        System.out.println("Dinheiro transferido com sucesso.");
                        System.out.println("Saldo R$: " + dinheiro);
                        break;
                    }
                    System.out.println("Você não possiu Saldo suficiente,");
                    System.out.println("Saldo R$: " + dinheiro);
                    break;
                case 4:
                    sair = 0;
                    System.out.println("Saindo do Banco, muito obrigado, volte sempre!");
                    break;
                default:
                    System.out.println("Selecione uma operação.");
            }
        }
    }
}
