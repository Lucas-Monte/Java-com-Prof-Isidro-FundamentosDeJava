public class MainClass {
    public static void main(String[] args) {
        NumeroFracionario n1 = new NumeroFracionario(5, 6);
        NumeroFracionario n2 = new NumeroFracionario(10, 2);
        NumeroFracionario n3 = n1.soma(n2);
        NumeroFracionario n4 = n3.subtracao(n1);
        NumeroFracionario n5 = n2.multiplicacao(n2);
        NumeroFracionario n6 = n5.divisao(n4);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
}
