package br.com.isiflix.cliente.model;

public class CartaoPagamento {
    private long numeroCartao;
    private int codVerif;
    private int anoValidade;
    private int mesValidade;

    public CartaoPagamento(long numeroCartao, int codVerif, int anoValidade, int mesValidade) {
        this.numeroCartao = numeroCartao;
        this.codVerif = codVerif;
        this.anoValidade = anoValidade;
        this.mesValidade = mesValidade;
    }

    @Override
    public String toString() {
        return "br.com.isiflix.cliente.model.CartaoPagamento{" +
                "numeroCartao=" + numeroCartao +
                ", codVerif=" + codVerif +
                ", anoValidade=" + anoValidade +
                ", mesValidade=" + mesValidade +
                '}';
    }

    public long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getCodVerif() {
        return codVerif;
    }

    public void setCodVerif(int codVerif) {
        this.codVerif = codVerif;
    }

    public int getAnoValidade() {
        return anoValidade;
    }

    public void setAnoValidade(int anoValidade) {
        this.anoValidade = anoValidade;
    }

    public int getMesValidade() {
        return mesValidade;
    }

    public void setMesValidade(int mesValidade) {
        this.mesValidade = mesValidade;
    }
}
