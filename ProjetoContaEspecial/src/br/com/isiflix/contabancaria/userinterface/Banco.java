package br.com.isiflix.contabancaria.userinterface;

import br.com.isiflix.contaespecial.core.Conta;
import br.com.isiflix.contaespecial.core.ContaEspecial;

public class Banco {
    public static void main(String[] args) {
        Conta c = new Conta(5432, "49468275182", "Lucas", 100);
        System.out.println(c);

        ContaEspecial e = new ContaEspecial(9876, "16843126540", "Jose", 100, 1000);
        System.out.println(e);

        if (c.debitar((300))) {
            System.out.println("Debito efetuado");
        }
        else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(c);

        if (e.debitar((300))) {
            System.out.println("Debito efetuado");
        }
        else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(e);


    }
}
