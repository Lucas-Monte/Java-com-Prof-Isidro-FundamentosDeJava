import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        lista.add(new Cliente(1, "Isidro", "isidro@isidro.com", true));
        lista.add(new Cliente(2, "Lucas", "lucas@lucas.com", false));
        lista.add(new Cliente(3, "Ana", "ana@ana.com", true));
        lista.add(new Cliente(4, "Pedro", "pedro@pedro.com", true));
        lista.add(new Cliente(5, "Maria", "maria@maria.com", false));
        lista.add(new Cliente(6, "João", "joao@joao.com", true));
        lista.add(new Cliente(7, "Carla", "carla@carla.com", true));
        lista.add(new Cliente(8, "Rafael", "rafael@rafael.com", false));
        lista.add(new Cliente(9, "Beatriz", "beatriz@beatriz.com", true));
        lista.add(new Cliente(10, "Daniel", "daniel@daniel.com", true));

        System.out.println("--------TUDAO ---------");
        lista.forEach(c -> {
            System.out.println(c);
        });

        System.out.println("---------------------------");
        //criterio 1: apenas ativos

        exibePorCriterio(lista, c -> c.isAtivo());

        System.out.println("---------------------------");
        //criterio 2: nomes com length maior que 4
        exibePorCriterio(lista, c -> c.getNome().length() > 4);

        System.out.println("---------------------------");
        //criterio 3: nomes que começam com "is"
        exibePorCriterio(lista, c -> c.getNome().startsWith("Is"));

    }

    public static void exibePorCriterio(ArrayList<Cliente> lista, Predicate<Cliente> predicate) {
        lista.forEach(c -> {
            if(predicate.test(c)) {
                System.out.println(c);
            }
        });
    }
}


