package br.com.isiflix.cliente.model;

import java.util.List;

public class Cliente {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    List<Endereco> enderecos;
    List<CartaoPagamento> cartoes;

    public Cliente(int codigo, String nome, String email, String telefone, String dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<CartaoPagamento> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<CartaoPagamento> cartoes) {
        this.cartoes = cartoes;
    }

    @Override
    public String toString() {
        return "br.com.isiflix.cliente.model.Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' + "\n"+
                ", email='" + email + '\'' + "\n" +
                ", telefone='" + telefone + '\'' + "\n" +
                ", dataNascimento='" + dataNascimento + '\'' + "\n" +
                ", enderecos=" + enderecos  + "\n"+
                ", cartoes=" + cartoes  + "\n"+
                '}';
    }
}
