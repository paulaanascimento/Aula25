package ex01;

public class Azul{
    static int cor;
    public static String NOME = "Azul";
    private int tonalidade;

    public Azul(int tonalidade) {
        this.tonalidade = tonalidade;
    }
    public int getTonalidade() {
        return tonalidade;
    }
    public void setTonalidade(int tonalidade) {
        if(tonalidade > 5){
            System.out.println("\nO valor informado é maior do que o permitido! ");
        } else if(tonalidade < 1){
            System.out.println("\nO valor informado é maior do que o permitido! ");
        } else this.tonalidade = tonalidade;
    }
    public void tornarMaisEscuro() {
            cor++;
            TornarTonalidadeMaisEscura(1);
    }
    void calcularTonalidade() {
        switch (tonalidade){
            case 1:
                System.out.println("\nTonalidade Clara");
                break;
            case 2:
                System.out.println("\nTonalidade Moderadamente Clara");
                break;
            case 3:
                System.out.println("\nTonalidade Média");
                break;
            case 4:
                System.out.println("\nTonalidade Moderadamente Escura");
                break;
            case 5:
                System.out.println("\nTonalidade Escura");
                break;
        }
    }
    private void TornarTonalidadeMaisEscura(int valor) {
        if(tonalidade < 5){
            tonalidade += valor;
        } else System.out.println("\nA tonalidade já está no valor máximo");
    }
}