import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto(1, "Computado", 2000, 5));
        lista.add(new Produto(2, "Teclado", 100, 10));
        lista.add(new Produto(3, "Mouse", 35, 20));
        lista.add(new Produto(4, "Impressora", 400, 8));

        lista.stream().filter(p -> p.getPreco() <= 100)
                .forEach(p -> System.out.println(p));

        double estoque;
        estoque = lista.stream().map(p -> p.getQtde()).reduce(0,(q1, q2) -> q1 + q2);
        System.out.println("estoque = " + estoque);

        double patrimonio;
        patrimonio = lista.stream().map(p -> p.getQtde() * p.getPreco())
                .reduce(0.0, (p1, p2) -> p1 + p2);
        System.out.println("Patrimonio = " + patrimonio);
    }
}
