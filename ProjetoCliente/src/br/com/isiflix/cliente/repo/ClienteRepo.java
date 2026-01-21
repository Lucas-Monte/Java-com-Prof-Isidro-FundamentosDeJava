package br.com.isiflix.cliente.repo;

import br.com.isiflix.cliente.model.Cliente;

import java.util.List;
import java.util.Optional;

public class ClienteRepo {
    private List<Cliente> clientes;

    public List<Cliente> recuperarTodos() {
        return this.clientes;
    }

    public Cliente recuperarPeloCodigo(int codigo) {
       Optional<Cliente> procurado = clientes.stream().filter(c -> c.getCodigo() == codigo).findFirst();
       if (procurado.isPresent()) {
           return procurado.get();
       } else {
           return null;
       }
    }

    public void adicionaCliente(Cliente novo) {
        this.clientes.add(novo);
    }

    public void alterarDados(Cliente cliente) {
        //pensar na forma de alterar os dados do cliente - tentar fazer no papel antes de escrever o codigo
    }

    public void excluir(Cliente cliente) {
        Optional<Cliente> procurado = this.clientes.stream().filter(c -> c == cliente).findFirst();
        if (procurado.isPresent()) {
            this.clientes.remove(procurado);
            System.out.println("Removido");
        } else {
            System.out.println("Não encontrado");
        }
    }

}
