package aula1;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public void imprimirDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        this.setNome(scanner.next());
        System.out.println("CPF:");
        this.setCpf(scanner.next());
        System.out.println("Telefone:");
        this.setTelefone(scanner.next());
        System.out.println("E-mail:");
        this.setEmail(scanner.next());
        System.out.println("Senha:");
        this.setSenha(scanner.next());
        System.out.println("Data de Nascimento:");
        this.setDataNascimento(scanner.next());
    }
}

