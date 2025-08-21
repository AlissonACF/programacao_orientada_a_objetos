package exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        funcionario.pedirDados();
        funcionario.calcularSalario();
        System.out.println(funcionario.toString());

        Maquina maquina = new Maquina();
        maquina.pedirDados();
        maquina.ligarDesligar();
        maquina.producaoDiaria();
        System.out.println(maquina.toString());
    }
}
