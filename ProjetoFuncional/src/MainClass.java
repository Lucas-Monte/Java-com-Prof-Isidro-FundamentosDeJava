import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        InterfaceX obj = new InterfaceX() {
            public int metodo(int valor) {
                return valor*2;
            }
        };

        InterfaceX obj2 = new InterfaceX() {
            public int metodo(int valor) {
                return valor*valor;
            }
        };

        //Lambda -> Poder de abstração muito maior para poder fazer qualquer coisa
        InterfaceX obj3 = (n) -> { return n * 5; };
        InterfaceX obj4 = (n) -> { return n * n * n; };

        System.out.println("Retorno Instancia 1: " + obj.metodo(4));
        System.out.println("Retorno Instancia 2: " + obj2.metodo(4));
        System.out.println("Retorno lambda 3: " + obj3.metodo(4));
        System.out.println("Retorno lambda 4: " + obj4.metodo(4));

        List<Produto> lista;
        lista = new ArrayList<Produto>();

        ArrayList<Integer> listaInteiros;
        ArrayList<Double> listaDouble;
        ArrayList<Float> listaFloat;

        lista.add(new Produto(1, "Computador", 1000));
        lista.add(new Produto(2, "Teclado", 50));
        lista.add(new Produto(3, "Mouse", 30));
        lista.add(new Produto(4, "Impressora", 500));

        lista.forEach((p) -> {
            p.setPreco(p.getPreco() * 1.10);
            System.out.println(p);
        });
    }
}
