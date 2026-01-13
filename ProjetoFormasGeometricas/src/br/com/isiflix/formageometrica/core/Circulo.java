package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;

public class Circulo extends FormaGeometrica implements InterfaceForma2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo de raio " + this.raio + " A: " + this.calcularArea() + " - P: " + this.calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.raio, 2)*Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.raio;
    }
}
