package br.com.isiflix.acme.core;

public class Horista extends Funcionario{
    private int numeroHoras;
    private float valorHora;

    public Horista(int numeroRegistro, String nomeFuncionario, int numeroHoras, float valorHora) {
        super(numeroRegistro, nomeFuncionario);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularSalario() {
        return this.numeroHoras * this.valorHora;
    }
}
