import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //Exemplo de Multicatch
//        try {
//            Produto p = new Produto();
//            p.setId(5);
//            p.setDescricao("Computador");
//            System.out.println(p);
//
//        } catch (IsiException | ArithmeticException | InputMismatchException e) {
//            System.out.println("Erro - " + e.getMessage());
//        }

        //Try-with-resources serve para que, com classes Autoclosed sejam passadas como parametro no Try e não precisam ser fechadas depois, diminuindo a verbosidade
        try (Scanner teclado = new Scanner(System.in);){

            System.out.println("Digite o primeiro valor: ");
            int v1 = teclado.nextInt();
            System.out.println("Digite o segundo valor: ");
            int v2 = teclado.nextInt();
            int r = v1 / v2;
            System.out.println("Resultado = " + r);

        } catch (Exception e) {
            System.out.println("Epa! " + e.getMessage());
        }
    }
}
