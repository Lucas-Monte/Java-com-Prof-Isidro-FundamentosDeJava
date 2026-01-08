public class Loja {
    public static void main(String[] args) {

        //Exemplificando referencia de memoria
        //Produto p1, p2;

        //p1 = new Produto(1, "Computador", 1000);
//        System.out.println("p1 = " + p1.exibirInfo());
//
//        //p2 = p1; //não cria cópia, mas apenas uma nova referencia ao mesmo objeto
//
//        p2 = new Produto(p1.getId(), p1.getNome(), p1.getPreco());
//        p2.setPreco(1500);
//
//        System.out.println("p2 = " + p2.exibirInfo());
//        System.out.println("p1 = " + p1.exibirInfo());
//        System.out.println("antes da correção...");
//        System.out.println("p1 = " + p1.exibirInfo());
//        Atualizador a = new Atualizador(7.5);
//        a.atualizarPreco(p1);
//        System.out.println("Após a correção de preços...");
//        System.out.println("p1 = " + p1.exibirInfo());

            //Exemplificando o Garbage Collector
//        for (int i = 0; i < 100; i++) {
//            p1 = new Produto(i, "Produto" + i, i*10);
//        }
//        System.gc();

        String s1, s2;
        s1 = "Oi, quer tc??";
        s2 = "Oi, quer tc??"; //s2 = s1, pois deixa a maquina virtual decidir e com o hash code ele calcula que ja existe um local na memoria com o mesmo valor de s2 e faz com que s2 aponte para o mesmo espaço na memoria de s1
        s2 = s1;

        s2 = "Vamos testar o que o Isidro falou";
        System.out.println(s1);
        System.out.println(s2); // em java String são imutaveis
        //s1 = new String("Oi, quer tc??");
       // s2 = new String("Oi, quer tc??"); // Com o new ele faz com que a maquina virtual aloque espaços na memoria distintos para s1 e s2, independente do conteudo ser igual ou não

//        if(s1 == s2) {
//            System.out.println("Apontam para a mesma área da memoria");
//        }
//        else {
//            System.out.println("Apontam para áreas diferentes da memoria");
//        }
//
//        if(s1.equals(s2)) {
//            System.out.println("Mesmo conteudo");
//        }
//        else {
//            System.out.println("Conteudos diferentes");
//        }
    }
}
