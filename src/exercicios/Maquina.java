package exercicios;

import java.util.Scanner;

public class Maquina {
    Scanner scanner = new Scanner(System.in);

    private int numeroMaquina;
    private String marcaMaquina;
    private String dataFabricacao;
    private double capacidadeMaximaProducaoPorHora;
    private String statusMaquina;
    private double horasTrabalhadas;
    private double producaoDiaria;

    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    public void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    public String getMarcaMaquina() {
        return marcaMaquina;
    }

    public void setMarcaMaquina(String marcaMaquina) {
        this.marcaMaquina = marcaMaquina;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getStatusMaquina() {
        return statusMaquina;
    }

    public void setStatusMaquina(String statusMaquina) {
        this.statusMaquina = statusMaquina;
    }

    public double getCapacidadeMaximaHora() {
        return capacidadeMaximaProducaoPorHora;
    }

    public void setCapacidadeMaximaHora(double capacidadeMaximaHora) {
        this.capacidadeMaximaProducaoPorHora = capacidadeMaximaHora;
    }

    public Maquina() {
    }
    public Maquina(int numeroMaquina, String marcaMaquina, String dataFabricacao, double capacidadeMaximaProducaoPorHora, String statusMaquina) {
        this.numeroMaquina = numeroMaquina;
        this.marcaMaquina = marcaMaquina;
        this.dataFabricacao = dataFabricacao;
        this.capacidadeMaximaProducaoPorHora = capacidadeMaximaProducaoPorHora;
        this.statusMaquina = statusMaquina;
    }

    public void pedirDados () {
        System.out.println("Digite o número da máquina:");
        this.numeroMaquina = scanner.nextInt();
        System.out.println("Digite a marca da máquina:");
        this.marcaMaquina = scanner.next();
        System.out.println("Digite a data de fabricação da máquina:");
        this.dataFabricacao = scanner.next();
        System.out.println("Digite a capacidade máxima de produção por hora da máquina:");
        this.capacidadeMaximaProducaoPorHora = scanner.nextDouble();
        System.out.println("Digite a quantia de horas trabalhadas da máquina:");
        horasTrabalhadas = scanner.nextDouble();
        System.out.println("ligar ou desligar a máquina?");
        this.statusMaquina = scanner.next();
    }

    public void ligarDesligar () {
        if (this.statusMaquina.equalsIgnoreCase("ligar")) {
            System.out.println("A máquina está ligada.");
        } else if (this.statusMaquina.equals("desligar")) {
            System.out.println("Você desligou a máquina.");
        }else {
            System.out.println("Este comando não é válido.");
        }
    }


    public void producaoDiaria () {
        this.producaoDiaria = this.capacidadeMaximaProducaoPorHora * this.horasTrabalhadas;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "numeroMaquina=" + numeroMaquina +
                ", marcaMaquina='" + marcaMaquina + '\'' +
                ", dataFabricacao='" + dataFabricacao + '\'' +
                ", producaoDiaria=" + producaoDiaria +
                ", statusMaquina='" + statusMaquina + '\'' +
                '}';
    }
}
