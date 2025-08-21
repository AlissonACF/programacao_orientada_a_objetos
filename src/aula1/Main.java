package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Conta conta;
        //construir um objeto conta
        conta = new Conta();
        conta.setNumero(01);
        conta.setTitular("Alisson");
        conta.setSaldo(15000);
        conta.imprimirDados();

        //Conta 2
        Conta conta2;
        conta2 = new Conta();
        System.out.println("Digite o número da conta:");
        conta2.setNumero(scanner.nextInt());
        System.out.println("Digite o nome do titular da conta:");
        conta2.setTitular(scanner.next());
        conta2.setSaldo(0);
        conta2.depositar();
        conta2.sacar();
        conta2.imprimirDados();


        Cliente cliente = new Cliente();
        cliente.imprimirDados();
        System.out.println(cliente.toString());
    }
}
