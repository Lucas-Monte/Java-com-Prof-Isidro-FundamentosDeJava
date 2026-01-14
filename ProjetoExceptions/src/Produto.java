public class Produto {
    private int id;
    private String descricao;


    public int getId() {
        return id;
    }
    //o throws no cabeçalho é obrigatorio caso a exception seja verificada. Se não for, não precisa colocar no cabeçalho
    public void setId(int id) throws IsiException {
        if (id <= 0) {
            throw new IsiException("ID não pode ser zero ou negativo");
        }
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    //o throws no cabeçalho é obrigatorio caso a exception seja verificada. Se não for, não precisa colocar no cabeçalho
    public void setDescricao(String descricao) throws IsiException {
        if (descricao == null || descricao.length() == 0) {
            throw new IsiException("Descrição precisa ser obrigatoria");
        }
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
