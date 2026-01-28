public class Cenario extends Game {
    public Cenario(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    void update() {
        System.out.println("Cenario alterado!");
    }

    @Override
    void draw() {
        System.out.println("Castelo, arvores, e mercado");
    }
}
