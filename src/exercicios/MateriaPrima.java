package exercicios;

import java.util.Scanner;

public class MateriaPrima {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private int quantidadeEmEstoque;
    private String fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void adicionarAoEstoque() {
        String sair = "N";
        int adicionarAoEstoque;


        while (!(sair.equalsIgnoreCase("S"))) {
            System.out.println("Digite o nome do item:");
            nome = scanner.next();
            System.out.println("Digite o nome do fornecedor do item:");
            fornecedor = scanner.next();
            System.out.println("Quantos itens deseja adicionar ao estoque?");
            adicionarAoEstoque = scanner.nextInt();
            quantidadeEmEstoque = quantidadeEmEstoque + adicionarAoEstoque;
            System.out.println("Digite 'S' para sair.");
            sair = scanner.next();
        }
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public void retirarDoEstoque() {
        String sair = "N";
        int retirarDoEstoque;

        while (!(sair.equalsIgnoreCase("S"))) {
            System.out.println("Qual item você deseja retirar do estoque?");
            nome = scanner.next();
            System.out.println("Digite o nome do fornecedor do item:");
            fornecedor = scanner.next();
            System.out.println("Quantos itens deseja retirar do estoque?");
            retirarDoEstoque = scanner.nextInt();
            quantidadeEmEstoque = quantidadeEmEstoque - retirarDoEstoque;
            System.out.println("Digite 'S' para sair:");
            sair = scanner.next();
        }
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public void verificarSePrecisaRepor() {
        if (quantidadeEmEstoque < 100) {
            System.out.println("Você precisa repor a mercadoria.");
        } else {
            System.out.println("Seu estoque está cheio!");
        }
    }

    @Override
    public String toString() {
        return "MateriaPrima{" +
                "nome='" + nome + '\'' +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", fornecedor='" + fornecedor + '\'' +
                '}';
    }
}
