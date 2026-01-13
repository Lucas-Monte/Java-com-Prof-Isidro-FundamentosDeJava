package br.com.isiflix.fakebd.fabricantes;

import br.com.isiflix.fakebd.integracao.InterfaceBD;

public class MySQLBD implements InterfaceBD {

    @Override
    public void conectar(String usuario, String senha) {
        System.out.println("Conectando banco MySQL com usuario: " + usuario + "/senha: " + senha);
    }

    @Override
    public void executar(String comando) {
        System.out.println("mysql> "+comando);

    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco MySQL");
    }
}
