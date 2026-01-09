public class Sistema {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa();
//        p.setNome("Lucas");
//        p.setEmail("lucas@lucas.com");
//        p.setTelefone("16 996785015");
//
//        Estudante e = new Estudante();
//        e.setNome("Jose");
//        e.setEmail("jose@jose.com");
//        e.setTelefone("16 954786408");
//        e.setNumeroMatricula(12345);
//        e.setCurso("Java");
//        System.out.println(p.exibir());
//        System.out.println(e.exibir());

        Pessoa cadastro[] = new Pessoa[5];
        cadastro[0] = new Pessoa("Lucas", "lucas@lucas.com", "16 999988770");
        cadastro[1] = new Pessoa("Isidro", "isidro@isidro.com", "16 884455964");
        cadastro[2] = new Pessoa("Maria", "maria@maria.com", "16 846955588");
        cadastro[3] = new Pessoa("Jose", "jose@jose.com", "16 987774458");
        cadastro[4] = new Pessoa("Pedro", "pedro@pedro.com", "16 988866645");

        for (Pessoa p: cadastro) {
            System.out.println(p.exibir());
        }
    }
}
