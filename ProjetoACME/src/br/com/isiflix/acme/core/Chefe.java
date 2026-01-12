package br.com.isiflix.acme.core;

public class Chefe extends Funcionario {
    private float salarioBase;
    private float adicionalFuncao;
    private float beneficioTerno;

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getAdicionalFuncao() {
        return adicionalFuncao;
    }

    public void setAdicionalFuncao(float adicionalFuncao) {
        this.adicionalFuncao = adicionalFuncao;
    }

    public float getBeneficioTerno() {
        return beneficioTerno;
    }

    public void setBeneficioTerno(float beneficioTerno) {
        this.beneficioTerno = beneficioTerno;
    }

    public Chefe(int numeroRegistro, String nomeFuncionario, float salarioBase, float adicionalFuncao, float beneficioTerno) {
        super(numeroRegistro, nomeFuncionario);
        this.salarioBase = salarioBase;
        this.adicionalFuncao = adicionalFuncao;
        this.beneficioTerno = beneficioTerno;
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase + this.salarioBase*this.adicionalFuncao/100 + this.beneficioTerno;
    }
}
