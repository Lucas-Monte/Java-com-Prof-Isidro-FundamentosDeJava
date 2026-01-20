import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BombaCombustivel b1 = new BombaCombustivel(6.50, 4.50);
        BombaCombustivel b2 = new BombaCombustivel(6.50, 4.50);
        BombaCombustivel b3 = new BombaCombustivel(6.50, 4.50);
        BombaCombustivel b4 = new BombaCombustivel(6.50, 4.50);
        BombaCombustivel bomba = null;
        int escolha, escolhaCombustivel, escolhaAbastecimento, escolhaBomba;
        String combustivel = "";

        double litros;
        double valor;
        do {
            menu();
            escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    do {
                        escolhaBomba();
                        escolhaBomba = teclado.nextInt();

                        switch (escolhaBomba) {
                            case 1:
                                bomba = b1;
                                break;
                            case 2:
                                bomba = b2;
                                break;
                            case 3:
                                bomba = b3;
                                break;
                            case 4:
                                bomba = b4;
                                break;
                            case -1:
                                System.out.println("Você saiu!");
                                return;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (escolhaBomba > 4 || escolhaBomba == 0 || escolhaBomba < -1);

                    do {
                        menuCombustivel();
                        escolhaCombustivel = teclado.nextInt();

                        switch (escolhaCombustivel) {
                            case 1:
                                combustivel = "gasolina";
                                break;
                            case 2:
                                combustivel = "etanol";
                                break;
                            case -1:
                                System.out.println("Você saiu!");
                                return;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (escolhaCombustivel > 2 || escolhaCombustivel == 0 || escolhaCombustivel < -1);

                    do {
                        menuAbastecimento();
                        escolhaAbastecimento = teclado.nextInt();
                        switch (escolhaAbastecimento) {
                            case 1:
                                System.out.print("Litros - ");
                                litros = teclado.nextDouble();
                                bomba.abastecerPorLitros(combustivel, litros);
                                System.out.println(bomba.emiteRecibo(combustivel.toUpperCase(), litros));
                                break;
                            case 2:
                                System.out.print("Valor - R$ ");
                                valor = teclado.nextDouble();
                                bomba.abastecerPorValor(combustivel, valor);
                                if (combustivel.toLowerCase().equals("gasolina")) {
                                    System.out.println(bomba.emiteRecibo(combustivel, valor / bomba.getValorLitroGasolina()));
                                } else {
                                    System.out.println(bomba.emiteRecibo(combustivel, valor / bomba.getValorLitroEtanol()));
                                }

                                break;
                            case -1:
                                System.out.println("Você Saiu!");
                                return;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (escolhaAbastecimento > 2 || escolhaAbastecimento == 0 || escolhaAbastecimento < -1);

                    break;
                case 2:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 2);






//            switch (escolha) {
//                case 1:
//                    System.out.print("Litros - ");
//                    litros = teclado.nextDouble();
//                    b1.abastecerPorLitros("gasolina", litros);
//                    System.out.println(b1.emiteRecibo("Gasolina", litros));
//                    break;
//                case 2:
//                    System.out.print("Valor - R$ ");
//                    valor = teclado.nextDouble();
//                    b1.abastecerPorValor("gasolina", valor);
//                    System.out.println(b1.emiteRecibo("Gasolina", valor / b1.getValorLitroGasolina()));
//                    break;
//                case 3:
//                    System.out.print("Litros - ");
//                    litros = teclado.nextDouble();
//                    b1.abastecerPorLitros("etanol", litros);
//                    System.out.println(b1.emiteRecibo("Etanol", litros));
//                    break;
//                case 4:
//                    System.out.print("Valor - R$ ");
//                    valor = teclado.nextDouble();
//                    b1.abastecerPorValor("etanol", valor);
//                    System.out.println(b1.emiteRecibo("Etanol", valor / b1.getValorLitroEtanol()));
//                    break;
//                case -1:
//                    System.out.println("Você saiu!");
//                    break;
//                default:
//                    System.out.println("Opção Inválida!");
//                    break;
//            }


        System.out.println("\nBomba 1 - \n" + b1.exibeDados());
        System.out.println("\nBomba 2 - \n" + b2.exibeDados());
        System.out.println("\nBomba 3 - \n" + b3.exibeDados());
        System.out.println("\nBomba 4 - \n" + b4.exibeDados());

        teclado.close();

    }

    public static void menu() {
        System.out.println("QUER ABASTECER VEICULO?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("-----------------------");
    }

    public static void menuCombustivel() {
        System.out.println("-----------------------");
        System.out.println("1 - Gasolina");
        System.out.println("2 - Etanol");
        System.out.println("-1 - Sair");
        System.out.println("-----------------------");
    }

    public static void menuAbastecimento() {
        System.out.println("-----------------------");
        System.out.println("1 - Litros");
        System.out.println("2 - Valor");
        System.out.println("-1 - Sair");
        System.out.println("-----------------------");
    }

    public static void escolhaBomba(){
        System.out.println("-----------------------");
        System.out.println("1 - Bomba 1");
        System.out.println("2 - Bomba 2");
        System.out.println("3 - Bomba 3");
        System.out.println("4 - Bomba 4");
        System.out.println("-1 - Sair");
        System.out.println("-----------------------");
    }
}
