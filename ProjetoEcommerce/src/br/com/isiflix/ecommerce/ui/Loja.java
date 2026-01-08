package br.com.isiflix.ecommerce.ui;

import br.com.isiflix.ecommerce.core.Pedido;
import br.com.isiflix.ecommerce.core.Status;

public class Loja {
    public static void main(String[] args) {
        Pedido p = new Pedido(1234, "18/01/2023", 1500, "Isidro", Status.NOVO);
        System.out.println(p.exibir());

        p.setStatus(Status.FINALIZADO);
        System.out.println(p.exibir());
    }
}
