public class MainClass {
    public static void main(String[] args) {
        NumeroGrande n1 = new NumeroGrande();
        n1.setCasas(20);
        n1.setValorString("89654232648");
        NumeroGrande n2 = new NumeroGrande();
        n2.setValorString("552366999445451254846");
        NumeroGrande n3 = n1.soma(n2);

        n1.exibeValor();
        n2.exibeValor();
        n3.exibeValor();
    }
}
