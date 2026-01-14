import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Produto> lista;
        lista = new ArrayList<Produto>();

        ArrayList<Integer> listaInteiros;
        ArrayList<Double> listaDouble;
        ArrayList<Float> listaFloat;

        lista.add(new Produto(1, "Computador", 1000));
        lista.add(new Produto(2, "Teclado", 50));
        lista.add(new Produto(3, "Mouse", 30));
        lista.add(new Produto(4, "Impressora", 500));

        for (Produto p: lista) {
            System.out.println(p);
        }

        System.out.println("------------------------------");
        lista.remove(2);

        for (Produto p: lista) {
            System.out.println(p);
        }
    }
}
