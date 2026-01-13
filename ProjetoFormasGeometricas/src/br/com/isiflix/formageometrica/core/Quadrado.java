package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;

public class Quadrado extends FormaGeometrica implements InterfaceForma2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public String toString() {
        return "Quadrado de lado " + this.lado + " A: " +this.calcularArea() + " - P: " + this.calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado*4;
    }
}
