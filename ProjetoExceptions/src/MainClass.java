public class MainClass {
    public static void main(String[] args) {
        try {
            Produto p = new Produto();
            p.setId(5);
            p.setDescricao("Computador");
            System.out.println(p);

        } catch (IsiException e) {
            System.out.println("Erro - " + e.getMessage());
        }
    }
}
