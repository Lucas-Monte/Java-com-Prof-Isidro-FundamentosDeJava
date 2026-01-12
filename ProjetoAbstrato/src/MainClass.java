public class MainClass {
    public static void main(String[] args) {
        Veiculo v;
        v = new Carro("Bmw x7", "2020", 5);

        v.acelerar();
        v.frear();

        Veiculo v2 = new Moto("R15", "2025", 150);
        v2.acelerar();
        v2.frear();
    }
}
