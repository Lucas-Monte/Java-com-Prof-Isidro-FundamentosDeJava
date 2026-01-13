package br.com.isiflix.fakebd.fabricantes;

import br.com.isiflix.fakebd.integracao.InterfaceBD;

public class OracleBD implements InterfaceBD {

    @Override
    public void conectar(String usuario, String senha) {
        System.out.println("Connection on OracleDB with " + usuario + "/ " + senha);
    }

    @Override
    public void executar(String comando) {
        System.out.println("oracle> " + comando);
    }

    @Override
    public void desconectar() {
        System.out.println("Disconnecting from OracleDB");
    }
}
