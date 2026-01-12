public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marcaModelo, String ano, int cilindradas) {
        super(marcaModelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto " + super.marcaModelo + " acelera na mão! PROPPROPPROPPROP");
    }

    @Override
    public void frear() {
        System.out.println("Moto " + super.marcaModelo + " freia no pé!! IIIIIIIIIIIRRRRRRR");
    }
}
