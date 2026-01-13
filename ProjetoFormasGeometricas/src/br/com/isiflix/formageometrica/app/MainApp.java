package br.com.isiflix.formageometrica.app;

import br.com.isiflix.formageometrica.core.Circulo;
import br.com.isiflix.formageometrica.core.Cubo;
import br.com.isiflix.formageometrica.core.Paralelepipedo;
import br.com.isiflix.formageometrica.core.Quadrado;
import br.com.isiflix.formageometrica.model.FormaGeometrica;

public class MainApp {
    public static void main(String[] args) {
        FormaGeometrica formas[];
        formas = new FormaGeometrica[4];
        formas[0] = new Quadrado(3);
        formas[1] = new Circulo(2);
        formas[2] = new Paralelepipedo(3, 2, 5);
        formas[3] = new Cubo(4);

        for (FormaGeometrica f: formas) {
            System.out.println(f);
        }

    }
}
