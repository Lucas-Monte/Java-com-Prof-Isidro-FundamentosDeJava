import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        boolean resp;
        MaquinaRefrigerante maquina1 = new MaquinaRefrigerante();
        Refrigerante coca = new Refrigerante(1, "Coca-Cola", 4.5, 10);
        Refrigerante fanta = new Refrigerante(2, "Fanta Laranja", 4.5, 10);
        Refrigerante Sprite = new Refrigerante(3, "Sprite", 4.5, 10);
        Refrigerante pepsi = new Refrigerante(4, "Pepsi Cola", 4.5, 10);

        Refrigerante[] listaRefri = new Refrigerante[4];
        listaRefri[0] = coca;
        listaRefri[1] = fanta;
        listaRefri[2] = Sprite;
        listaRefri[3] = pepsi;

        maquina1.adicionarLista(listaRefri);

        do {
            menu();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    double creditos;
                    System.out.println("Digite quanto quer adicionar");
                    creditos = teclado.nextDouble();
                    maquina1.inserirCredito(creditos);
                    System.out.println("R$ " + creditos + " adicionado com sucesso;");
                    break;
                case 2:
                    int idRefri;
                    do {
                        menuRefri();
                        idRefri = teclado.nextInt();
                    } while (idRefri < 1 || idRefri > 4);
                    Refrigerante escolhido = maquina1.procurarRefri(idRefri);
                     resp = maquina1.compra(escolhido);
                     if (resp) {
                         System.out.println("Compra efetuada com sucesso!");
                         System.out.println("Saldo restante R$ " + maquina1.creditoRestante());
                     }
                     else {
                         System.out.println("Compra não realizada. Credito insuficiente ou sem estoque do refrigerante escolhido.");
                     }
                     break;
                case 3:
                    maquina1.sacarCredito(maquina1.creditoRestante());
                    System.out.println("Saque realizado!");
                    System.out.println("Saldo restante R$ " + maquina1.creditoRestante());
                    break;
                case 4:
                    if (maquina1.creditoRestante() > 0) {
                        System.out.println("Ainda possui o valor de R$ " + maquina1.creditoRestante());
                        System.out.println("Saque o dinheiro ou compre um produto antes de sair.");
                        break;
                    }
                    else {
                        System.out.println("Você saiu!");
                        return;
                    }
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != 4);




        teclado.close();
    }

    public static void menuRefri() {
        System.out.println("-------------------");
        System.out.println("1 - Coca");
        System.out.println("2 - Fanta");
        System.out.println("3 - Sprite");
        System.out.println("4 - Pepsi");
        System.out.println("-------------------");

    }

    public static void menu() {
        System.out.println("Digite uma opção: ");
        System.out.println("1 - Adicionar Crédito");
        System.out.println("2 - Comprar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
    }
}
