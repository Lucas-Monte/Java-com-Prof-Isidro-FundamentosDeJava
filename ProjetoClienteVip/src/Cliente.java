public class Cliente {
    protected String nome;
    protected String email;
    protected double credito;

    public Cliente(String nome, String email, double credito) {
        this.nome = nome;
        this.email = email;
        this.credito = credito;
    }

    @Override
    public String toString() {
        return nome + " - E: " + email + " - C: " + credito + "\n";
    }

    public boolean fazerCompra(double valor) {
        if (this.credito >= valor ) {
            this.credito -= valor;
            return true;
        }
        return false;
    }

    public boolean quitarDivida(double valor) {
        if ((this.credito + valor) >= 0) {
            this.credito += valor;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getCredito() {
        return credito;
    }
}
