public class Sistema {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Lucas");
        p.setEmail("lucas@lucas.com");
        p.setTelefone("16 996785015");

        Estudante e = new Estudante();
        e.setNome("Jose");
        e.setEmail("jose@jose.com");
        e.setTelefone("16 954786408");
        e.setNumeroMatricula(12345);
        e.setCurso("Java");
        System.out.println(p.exibir());
        System.out.println(e.exibir());
    }
}
