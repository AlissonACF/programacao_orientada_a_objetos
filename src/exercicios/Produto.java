package exercicios;

import java.util.Scanner;

public class Produto {
    Scanner scanner = new Scanner(System.in);

    private int codigo;
    private String nome;
    private double peso;
    private double precoCusto;
    private double precoVenda;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void pedirDados () {
        System.out.println("Digite o código do produto:");
        codigo = scanner.nextInt();
        System.out.println("Digite o nome do produto:");
        nome = scanner.next();
        System.out.println("Digite o peso do produto:");
        peso = scanner.nextDouble();
        System.out.println("Digite o preço de custo do produto:");
        precoCusto = scanner.nextDouble();
    }

    public void calcularPrecoVenda () {
        precoVenda = precoCusto * 1.3;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                '}';
    }
}
