import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudoException {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            int valor1, valor2, resultado;

            System.out.println("Digite um valor: ");
            valor1 = teclado.nextInt();
            System.out.println("Digite outro valor: ");
            valor2 = teclado.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Resultado da divisão = " + resultado);
            teclado.close();
        } catch (ArithmeticException e) {
            System.out.println("Eita! Não da para dividir por 0");
        } catch (InputMismatchException e) {
            System.out.println("Eita! Você precisa informar valores inteiros.");
        } catch (Exception e) {
            System.out.println("Eita! Deu alguma coisa ruim que não sei o que é");
        } finally {
            //Sempre executa, dando alguma exception ou não
            //Garante que determinado código sera executado, dando falha ou não
            System.out.println("Fim do programa!");
        }

        //As exceptions serve para poder prever tratativas de comportamentos anormais do usuario
        //Exception verificadas é obrigado a usar o bloco try/catch e as não verificadas (filhas do RuntimeException) não é obrigado a ter bloco try/catch
    }
}
