package core;

public class Data {
    private int dia;
    private Mes mes;
    private int ano;
    private DiaDaSemana diaDaSemana;

    public String exibirData() {
        return this.dia + "/" + this.mes + "/" + this.ano + " (" + this.diaDaSemana+")";
    }
    public Data(int dia, Mes mes, int ano, DiaDaSemana diaDaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaDaSemana = diaDaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaDaSemana getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
}
