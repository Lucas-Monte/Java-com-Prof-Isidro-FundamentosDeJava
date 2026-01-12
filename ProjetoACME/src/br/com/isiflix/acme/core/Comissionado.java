package br.com.isiflix.acme.core;

public class Comissionado extends Funcionario {
    private float salarioBase;
    private float comissao;

    public Comissionado(int numeroRegistro, String nomeFuncionario, float salarioBase, float comissao) {
        super(numeroRegistro, nomeFuncionario);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase + this.salarioBase*this.comissao/100;
    }
}
