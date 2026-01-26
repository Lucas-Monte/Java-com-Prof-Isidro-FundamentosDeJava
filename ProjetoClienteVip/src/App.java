public class App {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro", "pedro@email.com", 100);
        Cliente c2 = new Cliente("João", "joao@email.com", 50);
        Cliente c3 = new ClienteVIP("Lucas", "lucas@email.com", 100, 50);
        Cliente c4 = new ClienteVIP("Matheus", "math@email.com", 200, 100);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        if (c1.fazerCompra(200)) {
            System.out.println("Compra realizada com sucesso!");
        }
        else {
            System.out.println("Compra não realizada! Créditos insuficientes");
        }

        if (c2.fazerCompra(20)) {
            System.out.println("Compra realizada com sucesso!");
        }
        else {
            System.out.println("Compra não realizada! Créditos insuficientes");
        }

        if (c3.fazerCompra(120)) {
            System.out.println("Compra realizada com sucesso!");
        }
        else {
            System.out.println("Compra não realizada! Créditos insuficientes");
        }

        if (c4.fazerCompra(200)) {
            System.out.println("Compra realizada com sucesso!");
        }
        else {
            System.out.println("Compra não realizada! Créditos insuficientes");
        }

        System.out.println(c3.getCredito());
        if (c3.quitarDivida(29)) {
            System.out.println("Divida quitada");
        }
        else {
            System.out.println("Dinheiro insuficiente para quitar dívida!");
        }
        System.out.println(c3.getCredito());

    }
}
