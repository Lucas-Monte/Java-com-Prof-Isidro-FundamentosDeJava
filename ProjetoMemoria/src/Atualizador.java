public class Atualizador {
    private double indice;

    public Atualizador(double indice) {
        this.indice = indice;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public void atualizarPreco(Produto p) {
        double novoPreco = p.getPreco() + p.getPreco() * indice / 100;
        p.setPreco(novoPreco);
    }
}
