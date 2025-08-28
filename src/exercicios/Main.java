package exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        funcionario.pedirDados();
        funcionario.calcularSalario();

        Maquina maquina = new Maquina();
        maquina.pedirDados();
        maquina.ligarDesligar();
        maquina.producaoDiaria();

        Produto produto = new Produto();
        produto.pedirDados();
        produto.calcularPrecoVenda();

        MateriaPrima materiaPrima = new MateriaPrima();
        materiaPrima.adicionarAoEstoque();
        materiaPrima.retirarDoEstoque();
        materiaPrima.verificarSePrecisaRepor();
        System.out.println(materiaPrima.toString());
    }
}
