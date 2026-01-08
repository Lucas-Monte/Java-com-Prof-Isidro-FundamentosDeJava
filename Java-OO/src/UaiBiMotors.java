import java.sql.SQLOutput;

public class UaiBiMotors {
    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro("Porsche", "Cayenne", 2022, "Branca", 0, 2200000);
        c2 = new Carro("Chevrolet", "Corsa", 1998, "Cinza", 250000, 8000);
//        c1.setMarca("Porsche");
//        c1.setModelo("Cayenne");
//        c1.setAno(2022);
//        c1.setKm(0);
//        c1.setCor("Branca");
//        c1.setPreco(2200000);
//
//        c2.setMarca("Chevrolet");
//        c2.setModelo("Corsa");
//        c2.setAno(1998);
//        c2.setKm(250000);
//        c2.setCor("Cinza");
//        c2.setPreco(8000);

        c1.exibirAnuncio();
        c2.exibirAnuncio();
        c1.simularSeguro(3);
        c2.simularSeguro(0);

        System.out.println("------Calculando IPVA dos veiculos--------");
        double ipvaC1 = c1.calcularIPVA();
        double ipvaC2 = c2.calcularIPVA();
        if(ipvaC1 == 0) {
            System.out.println("Veiculo Isento");
        }
        else {
            System.out.println("Valor do IPVA = " + ipvaC1);
        }

        if(ipvaC2 == 0) {
            System.out.println("Veiculo Isento de imposto");
        }
        else {
            System.out.println("Valor do IPVA = " + ipvaC2);
        }

//        System.out.println("Carro: ");
//        System.out.println(c1.marca + "--" + c1.modelo + " (" + c1.ano+ ")");
//        System.out.println(c1.cor + " KM: " + c1.km + " R$ " + c1.preco);
//
//        System.out.println("Carro: ");
//        System.out.println(c2.marca + "--" + c2.modelo + " (" + c2.ano+ ")");
//        System.out.println(c2.cor + " KM: " + c2.km + " R$ " + c2.preco);


    }
}
