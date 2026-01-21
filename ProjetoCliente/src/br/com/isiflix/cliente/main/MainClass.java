package br.com.isiflix.cliente.main;

import br.com.isiflix.cliente.model.CartaoPagamento;
import br.com.isiflix.cliente.model.Cliente;
import br.com.isiflix.cliente.model.Endereco;
import br.com.isiflix.cliente.model.TipoLogradouro;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1,"Lucas","lucas@email.com","16999658985","12/10/2002");
        Endereco casaC1 = new Endereco(1, TipoLogradouro.RUA, "Miguel Angelo", 5964,"Apartamento 1","14689500");
        Endereco empresaC1 = new Endereco(1, TipoLogradouro.PRACA, "Dom Pedro", 69,"Sala 2","14856000");
        Endereco casa2C1 = new Endereco(1, TipoLogradouro.RUA, "Joao Batista", 6, "14659000");

        List<Endereco> listaEnderecoC1 = new ArrayList<Endereco>();
        listaEnderecoC1.add(casaC1);
        listaEnderecoC1.add(empresaC1);
        listaEnderecoC1.add(casa2C1);

        c1.setEnderecos(listaEnderecoC1);

        CartaoPagamento cartaoDebitoC1 = new CartaoPagamento(4928174630598274L, 759, 29, 12);
        CartaoPagamento cartaoCreditoC1 = new CartaoPagamento(5376204911836402L, 644, 35, 5);
        List<CartaoPagamento> listaCartoesC1 = new ArrayList<CartaoPagamento>();
        listaCartoesC1.add(cartaoDebitoC1);
        listaCartoesC1.add(cartaoCreditoC1);

        c1.setCartoes(listaCartoesC1);

        System.out.println(c1);
    }
}
