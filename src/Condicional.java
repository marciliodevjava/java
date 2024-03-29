public class Condicional {
    public static void main(String[] args){
        int anoDoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String plano = "plus";

        if (anoDoLancamento>= 2002){
            System.out.printf("Lançamento do Filme: %d%n", anoDoLancamento);
        } else {
            System.out.println("Filme Retro.");
        }

        if (incluidoNoPlano == true && plano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar para assistir.");
        }
    }
}
