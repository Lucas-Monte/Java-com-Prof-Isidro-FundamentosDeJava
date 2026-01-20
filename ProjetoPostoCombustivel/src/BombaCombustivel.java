public class BombaCombustivel {
    private double valorLitroGasolina;
    private double valorLitroEtanol;
    private double saldoTotal;
    private double litrosAbastecidosGasolina;
    private double litrosAbastecidosEtanol;

    public BombaCombustivel(double valorLitroGasolina, double valorLitroEtanol, double saldoTotal) {
        this.valorLitroGasolina = valorLitroGasolina;
        this.valorLitroEtanol = valorLitroEtanol;
        this.saldoTotal = saldoTotal;
    }

    public BombaCombustivel(double valorLitroGasolina, double valorLitroEtanol) {
        this.valorLitroGasolina = valorLitroGasolina;
        this.valorLitroEtanol = valorLitroEtanol;
    }

    public String exibeDados() {
        double total = (this.litrosAbastecidosGasolina*this.valorLitroGasolina) + (this.litrosAbastecidosEtanol*this.valorLitroEtanol);
        double valorGasolina = this.litrosAbastecidosGasolina*this.valorLitroGasolina;
        double valorEtanol = this.litrosAbastecidosEtanol*this.valorLitroEtanol;
        double litrosTotal = this.litrosAbastecidosEtanol + this.litrosAbastecidosGasolina;
        return String.format("Gasolina: \n" +
                "Valor do Litro = R$ %.2f - Total abastecido = %.2f litros - total R$ %.2f\n" +
                "Etanol: \n" +
                "Valor do Litro = R$ %.2f - Total abastecido = %.2f litros - total R$ %.2f\n" +
                "Total abastecido = %.2f litros - R$ %.2f", this.valorLitroGasolina, this.litrosAbastecidosGasolina, valorGasolina, this.valorLitroEtanol, this.litrosAbastecidosEtanol, valorEtanol, litrosTotal, total);
    }

    public void abastecerPorLitros(String tipoCombustivel, double quantidade) {
        if (tipoCombustivel.toLowerCase().equals("gasolina")) {
            this.litrosAbastecidosGasolina += quantidade;
            this.saldoTotal += quantidade*this.valorLitroGasolina;
        } else if (tipoCombustivel.toLowerCase().equals("etanol")) {
            this.litrosAbastecidosEtanol += quantidade;
            this.saldoTotal += quantidade*this.valorLitroEtanol;
        }
    }

    public void abastecerPorValor(String tipoCombustivel, double valor) {
        if (tipoCombustivel.toLowerCase().equals("gasolina")) {
            this.litrosAbastecidosGasolina += valor/this.valorLitroGasolina;
            this.saldoTotal += valor;
        } else if (tipoCombustivel.toLowerCase().equals("etanol")) {
            this.litrosAbastecidosEtanol += valor/this.valorLitroEtanol;
            this.saldoTotal += valor;
        }

    }

    public String emiteRecibo(String tipoCombutivel, double litrosAbastecidos) {
        double total = tipoCombutivel.toLowerCase().equals("gasolina") ? this.valorLitroGasolina*litrosAbastecidos : this.valorLitroEtanol*litrosAbastecidos;
        return String.format("IsidroCorp Gas & Energy\n" +
                "Litros Abastecidos - %.2f\n" +
                "Total              - R$ %.2f", litrosAbastecidos, total);
    }

    public double getLitrosAbastecidosEtanol() {
        return litrosAbastecidosEtanol;
    }

    public void setLitrosAbastecidosEtanol(double litrosAbastecidosEtanol) {
        this.litrosAbastecidosEtanol = litrosAbastecidosEtanol;
    }

    public double getValorLitroGasolina() {
        return valorLitroGasolina;
    }

    public void setValorLitroGasolina(double valorLitroGasolina) {
        this.valorLitroGasolina = valorLitroGasolina;
    }

    public double getValorLitroEtanol() {
        return valorLitroEtanol;
    }

    public void setValorLitroEtanol(double valorLitroEtanol) {
        this.valorLitroEtanol = valorLitroEtanol;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getLitrosAbastecidosGasolina() {
        return litrosAbastecidosGasolina;
    }

    public void setLitrosAbastecidosGasolina(double litrosAbastecidosGasolina) {
        this.litrosAbastecidosGasolina = litrosAbastecidosGasolina;
    }
}
