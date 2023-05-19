package ex02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.setNome("Vanessa");
        funcionario2.setNome("Guilherme");
        funcionario3.setNome("Mariana");

        funcionario1.setSalario(1200);
        funcionario2.setSalario(1000);
        funcionario3.setSalario(690);

        funcionario1.setDataAdmissao(LocalDate.of(2018,10,15));
        funcionario2.setDataAdmissao(LocalDate.of(2023,5,19));
        funcionario3.setDataAdmissao(LocalDate.of(2023,6,19));

        System.out.println("\n-----Dados-----");
        System.out.println("ID: " + funcionario1.getIdentificador() + "\nNome: " + funcionario1.getNome() + "\nSalario: " + funcionario1.getSalario() + "\nData de Admissao: " + funcionario1.getDataAdmissao());
        System.out.println("\nID: " + funcionario2.getIdentificador() + "\nNome: " + funcionario2.getNome() + "\nSalario: " + funcionario2.getSalario() + "\nData de Admissao: " + funcionario2.getDataAdmissao());
        System.out.println("\nID: " + funcionario3.getIdentificador() + "\nNome: " + funcionario3.getNome() + "\nSalario: " + funcionario3.getSalario() + "\nData de Admissao: " + funcionario3.getDataAdmissao());
    }
}
