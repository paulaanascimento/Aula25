package ex02;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private static int identificador = 0;
    private int idFuncionario;

    public Funcionario(){
        nome = "DADOS NÃO PREENCHIDOS";
        identificador++;
        setIdentificador(identificador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        if(dataAdmissao.isAfter(LocalDate.now())){
            System.out.println("Informe uma data que não esteja no futuro");
        } else this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario <= 700){
            System.out.println("Informe um valor maior que R$700,00");
        } else this.salario = salario;
    }

    public int getIdentificador() {
        return idFuncionario;
    }

    private void setIdentificador(int identificador) {
        idFuncionario = identificador;
    }
}
