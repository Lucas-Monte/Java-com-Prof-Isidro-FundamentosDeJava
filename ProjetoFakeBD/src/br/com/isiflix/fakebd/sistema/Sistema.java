package br.com.isiflix.fakebd.sistema;

import br.com.isiflix.fakebd.fabricantes.MySQLBD;
import br.com.isiflix.fakebd.fabricantes.OracleBD;
import br.com.isiflix.fakebd.integracao.InterfaceBD;

public class Sistema {
    public static void main(String[] args) {
        InterfaceBD ibd;

        //ibd = new MySQLBD();
        ibd = new OracleBD();

        ibd.conectar("admin", "1234");
        ibd.executar("SELECT * FROM tbl_clientes");
        ibd.desconectar();
    }
}
