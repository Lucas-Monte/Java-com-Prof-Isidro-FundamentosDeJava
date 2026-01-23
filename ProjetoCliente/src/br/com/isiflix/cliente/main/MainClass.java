package br.com.isiflix.cliente.main;

import br.com.isiflix.cliente.model.CartaoPagamento;
import br.com.isiflix.cliente.model.Cliente;
import br.com.isiflix.cliente.model.Endereco;
import br.com.isiflix.cliente.model.TipoLogradouro;
import br.com.isiflix.cliente.repo.Campo;
import br.com.isiflix.cliente.repo.ClienteRepo;

import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
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

        Cliente c2 = new Cliente(2, "Joao", "joao@email.com", "16959994528", "23/11/2000");
        Endereco endC2 = new Endereco(2, TipoLogradouro.RUA, "Dom Pedro", 86, "14856000");

        List<Endereco> listaEnderecoC2 = new ArrayList<Endereco>();
        listaEnderecoC2.add(endC2);

        System.out.println(c1);
        System.out.println(c2);

        ClienteRepo banco = new ClienteRepo();
        banco.adicionaCliente(c1);
        banco.adicionaCliente(c2);
        System.out.println(banco.recuperarTodos());
        System.out.println(banco.recuperarPeloCodigo(1));

        Campo campoAlteracao = null;
        do {
            menuAlteracao();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    campoAlteracao = Campo.NOME;
                    break;
                case 2:
                    campoAlteracao = Campo.EMAIL;
                    break;
                case 3:
                    campoAlteracao = Campo.TELEFONE;
                    break;
                case 4:
                    campoAlteracao = Campo.DATANASCIMENTO;
                    break;
                case 5:
                    System.out.println("Você saiu!");
                    return;
                default:
                    System.out.println("Opção incorreta!");
            }
        } while (opcao < 1 || opcao > 5);

        String alteracao = teclado.nextLine();

        System.out.println("Digite a alteração: ");
        alteracao = teclado.nextLine();
        banco.alterarDados(c1, campoAlteracao, alteracao);
        System.out.println(banco.recuperarTodos());
        banco.excluir(c2);
        System.out.println(banco.recuperarTodos());

        teclado.close();

    }

    public static void menuAlteracao() {
        System.out.println("Escolha o campo que deseja alterar: ");
        System.out.println("1- Nome");
        System.out.println("2- Email");
        System.out.println("3- Telefone");
        System.out.println("4- Data de Nascimento");
        System.out.println("5- Sair");
    }
}
