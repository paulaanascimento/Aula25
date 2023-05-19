package ex01;

public class Main {
    public static void main(String[] args) {

        Azul corAzul = new Azul(3);

        System.out.println("\nNome da cor: " + Azul.NOME);
        Azul.cor = 2;
        corAzul.tornarMaisEscuro();

        System.out.println("\nCor atual: " + Azul.cor);
        System.out.println("\nA tonalidade atual da cor é " + corAzul.getTonalidade());
        corAzul.setTonalidade(6);
        System.out.println("\nA tonalidade atual da cor é " + corAzul.getTonalidade());
        corAzul.calcularTonalidade();
    }
}
