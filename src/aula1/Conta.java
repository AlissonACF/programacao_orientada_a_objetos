package aula1;

import java.util.Scanner;

//servir de molde
public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double valorDeposito;

    //Getter = pegar o conteúdo da variável
    public int getNumero() {
        return numero;
    }
    //Setter = setar o conteúdo
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }
    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    //funções da conta
    public void imprimirDados(){
        System.out.println("*** Dados da Conta ***");
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
    public void sacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você deseja sacar:");
        double valorSaque = scanner.nextDouble();

        if (valorSaque > this.saldo){
            System.out.println("!!!VOCÊ NÃO TEM ESSE VALOR DISPONÍVEL PARA SAQUE!!!");
        }else {
            this.saldo -= valorSaque;
            double soma = this.saldo - valorSaque;
            System.out.println("Valor do saque: " + valorSaque);
        }
    }
    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você deseja depositar?");
        valorDeposito = scanner.nextDouble();
        this.saldo += valorDeposito;
        System.out.println("Saldo atual: " + this.saldo);
    }
}