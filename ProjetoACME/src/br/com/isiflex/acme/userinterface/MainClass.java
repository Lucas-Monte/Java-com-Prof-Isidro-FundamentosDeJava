package br.com.isiflex.acme.userinterface;

import br.com.isiflix.acme.core.*;


public class MainClass {
    public static void main(String[] args) {
        Funcionario folha[] = new Funcionario[8];

        folha[0] = new Chefe(1234, "Joe Boss", 10000, 15, 2500);
        folha[1] = new Comissionado(1235, "Keith Seller", 3500, 22);
        folha[2] = new Comissionado(1236, "Jeff Seller", 3250, 20);
        folha[3] = new Horista(1237, "Josh Designer", 30, 70);
        folha[4] = new Horista(1238, "Penny Architect", 45, 82.30f);
        folha[5] = new Empreiteiro(1239, "Peter Constructor", 4500.0f);
        folha[6] = new Empreiteiro(1230, "Bob the Builder", 3920.0f);
        folha[7] = new Empreiteiro(1231, "Mary Decorator", 4230);

        for (Funcionario f: folha) {
            System.out.println(String.format("| o | REG: %5d - Nome: %-35s | o |", f.getNumeroRegistro(), f.getNomeFuncionario()));
            System.out.println(String.format("| o | Salario liquido: R$ %10.2f                         | o |", f.calcularSalario()));
            System.out.println("| o |........................................................| o |");
        }

    }
}
