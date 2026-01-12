package br.com.isiflix.acme.core;

public class Empreiteiro extends Funcionario{
    private float valorEmpreita;

    public Empreiteiro(int numeroRegistro, String nomeFuncionario, float valorEmpreita) {
        super(numeroRegistro, nomeFuncionario);
        this.valorEmpreita = valorEmpreita;
    }

    public float getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(float valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public float calcularSalario() {
        return this.valorEmpreita;
    }
}
