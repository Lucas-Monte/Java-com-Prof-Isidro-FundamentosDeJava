package br.com.isiflix.projetopackage.userinterface;

import br.com.isiflix.projetopackage.core.Produto;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Testando pacotes");
        Produto p = new Produto(1, "Computador", 2500);
        System.out.println(p.exibirInfo());
    }
}
