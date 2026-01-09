package br.com.isiflix.contaespecial.core;

public class Conta {
    protected int numeroConta;
    protected String cpfTitular;
    protected String nomeTitular;
    protected double saldo;

    public Conta(int numeroConta, String cpfTitular, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String toString() {
        return this.numeroConta + " - " + this.nomeTitular + " (" + this.cpfTitular + ") R$ " + this.saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public boolean debitar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
