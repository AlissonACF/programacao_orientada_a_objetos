package exercicios;

import java.util.Scanner;

public class Maquina {
    Scanner scanner = new Scanner(System.in);

    private int numeroMaquina;
    private String marcaMaquina;
    private String dataFabricacao;
    private double capacidadeMaximaHora;
    private String statusMaquina;

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
        return capacidadeMaximaHora;
    }

    public void setCapacidadeMaximaHora(double capacidadeMaximaHora) {
        this.capacidadeMaximaHora = capacidadeMaximaHora;
    }

    public void pedirDados () {
        System.out.println("Digite o número da máquina:");
        this.numeroMaquina = scanner.nextInt();
        System.out.println("Digite a marca da máquina:");
        this.marcaMaquina = scanner.next();
        System.out.println("Digite a data de fabricação da máquina:");
        this.dataFabricacao = scanner.next();
        System.out.println("Digite a capacidade máxima de produção por hora da máquina:");
        this.capacidadeMaximaHora = scanner.nextDouble();
        System.out.println("ligar ou desligar a máquina?");
        this.statusMaquina = scanner.next();
    }

    public void ligarDesligar () {
        if (this.statusMaquina.equals("ligar")) {
            System.out.println("A máquina está ligada.");
        } else if (this.statusMaquina.equals("desligar")) {
            System.out.println("A você desligou a máquina.");
        }else {
            System.out.println("Este comando não é válido.");
        }
    }


    public void producaoDiaria () {
        double calculoProducao = this.capacidadeMaximaHora * 24;

        System.out.println("Número da máquina: " + this.numeroMaquina);
        System.out.println("Marca da máquina: " + this.marcaMaquina);
        System.out.println("Data de fabricação: " + this.dataFabricacao);
        System.out.println("Capacidade máxima por hora: " + this.capacidadeMaximaHora);
        System.out.println("Capacidade de produção diária: " + calculoProducao);
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "numeroMaquina=" + numeroMaquina +
                ", marcaMaquina='" + marcaMaquina + '\'' +
                ", dataFabricacao='" + dataFabricacao + '\'' +
                ", capacidadeMaximaHora=" + capacidadeMaximaHora +
                ", statusMaquina='" + statusMaquina + '\'' +
                '}';
    }
}
