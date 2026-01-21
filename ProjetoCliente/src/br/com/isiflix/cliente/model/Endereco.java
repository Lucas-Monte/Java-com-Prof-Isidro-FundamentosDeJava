package br.com.isiflix.cliente.model;

public class Endereco {
    private int id;
    private TipoLogradouro tipoLogradouro;
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;

    public Endereco(int id, TipoLogradouro tipoLogradouro, String logradouro, int numero, String complemento, String cep) {
        this.id = id;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Endereco(int id, TipoLogradouro tipoLogradouro, String logradouro, int numero, String cep) {
        this.id = id;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }


    @Override
    public String toString() {
        return "br.com.isiflix.cliente.model.Endereco{" +
                "id=" + id +
                ", tipoLogradouro=" + tipoLogradouro +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
