package br.com.isiflix.cliente.repo;

import br.com.isiflix.cliente.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteRepo {
    private List<Cliente> clientes = new ArrayList<>();

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
        clientes.add(novo);
    }

    public void alterarDados(Cliente cliente, Campo campo, String alterado) {
        Cliente procurado = recuperarPeloCodigo(cliente.getCodigo());
        if (procurado != null) {
            if (campo == Campo.NOME) {
                procurado.setNome(alterado);
            } else if (campo == Campo.EMAIL) {
                procurado.setEmail(alterado);
            } else if (campo == Campo.TELEFONE) {
                procurado.setTelefone(alterado);
            } else {
                procurado.setDataNascimento(alterado);
            }
        }
    }

    public void excluir(Cliente cliente) {
        Cliente procurado = recuperarPeloCodigo(cliente.getCodigo());
        if (procurado != null) {
            this.clientes.remove(procurado);
        }
    }

}
