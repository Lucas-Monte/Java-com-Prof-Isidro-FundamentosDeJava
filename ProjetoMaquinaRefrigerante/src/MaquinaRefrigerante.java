public class MaquinaRefrigerante {
    private Refrigerante[] listaRefri = new Refrigerante[4];
    private double credito;

    public void adicionarLista(Refrigerante[] lista) {
        for (int i = 0; i < this.listaRefri.length; i++) {
            this.listaRefri[i] = lista[i];
        }
    }

    public void exibirLista() {
        for (Refrigerante r: listaRefri) {
            System.out.println(r);
        }
    }

    public void inserirCredito(double credito) {
        this.credito += credito;
    }

    public double creditoRestante() {
        return this.credito;
    }

    public Refrigerante procurarRefri(int id) {
        for (Refrigerante r: listaRefri) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    public boolean compra(Refrigerante refrigerante) {
        Refrigerante procurado = procurarRefri(refrigerante.getId());
        if (this.credito >= procurado.getPreco() && procurado.getEstoque() > 0) {
            this.credito -= procurado.getPreco();
            procurado.setEstoque(procurado.getEstoque() - 1);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean sacarCredito(double valor) {
        if (valor == this.credito) {
            this.credito -= valor;
            return true;
        }
        else {
            return false;
        }
    }


}
