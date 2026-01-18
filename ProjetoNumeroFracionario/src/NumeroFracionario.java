public class NumeroFracionario {
    private int numerador;
    private int denominador;

    public NumeroFracionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public NumeroFracionario soma(NumeroFracionario n2) {
        return new NumeroFracionario((this.numerador*n2.denominador + this.denominador*n2.numerador),(this.denominador*n2.denominador));
    }

    public NumeroFracionario subtracao(NumeroFracionario n2) {
        return new NumeroFracionario((this.numerador*n2.denominador - this.denominador*n2.numerador),(this.denominador*n2.denominador));
    }

    public NumeroFracionario multiplicacao(NumeroFracionario n2) {
        return new NumeroFracionario((this.numerador*n2.denominador), (this.denominador*n2.denominador));
    }

    public NumeroFracionario divisao(NumeroFracionario n2) {
        return new NumeroFracionario((this.numerador*n2.denominador), (this.denominador*n2.numerador));
    }
}
