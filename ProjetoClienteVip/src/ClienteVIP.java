public class ClienteVIP extends Cliente{
    private double creditoEspecial;

    public ClienteVIP(String nome, String email, double credito, double creditoEspecial) {
        super(nome, email, credito);
        this.creditoEspecial = creditoEspecial;
    }

    @Override
    public String toString() {
        return "VIP - " + nome + " - E: " + email + " - C: " + credito + " - CE: " + creditoEspecial + "\n";
    }

    @Override
    public boolean fazerCompra(double valor) {
        if ((super.credito + this.creditoEspecial) >= valor) {
            super.credito -= valor;
            return true;
        }
        return false;
    }
}
