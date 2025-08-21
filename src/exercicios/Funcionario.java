package exercicios;

import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private int matricula;
    private String turno;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void pedirDados () {
        System.out.println("Digite o nome do funcionário:");
        this.nome = scanner.next();
        System.out.println("Digite a matrícula do funcionário:");
        this.matricula = scanner.nextInt();
        System.out.println("Digite o turno em que o funcionário trabalha:");
        this.turno = scanner.next();
        System.out.println("Digite o salário base do funcionário:");
        this.salario = scanner.nextDouble();
    }

    public void calcularSalario () {
        if (this.turno.equals("noite")) {
            double calculo = this.salario * 1.2;

            System.out.println("Funcionário: " + this.nome);
            System.out.println("Mtrícula: " + this.matricula);
            System.out.println("Turno: " + this.turno);
            System.out.println("Salário: " + calculo);
        }else {
            System.out.println("Funcionário: " + this.nome);
            System.out.println("Mtrícula: " + this.matricula);
            System.out.println("Turno: " + this.turno);
            System.out.println("Salário: " + this.salario);
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", turno='" + turno + '\'' +
                ", salario=" + salario +
                '}';
    }
}
