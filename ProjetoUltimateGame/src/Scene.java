public class Scene extends Game{
    private boolean visible;

    public Scene(int posX, int posY, boolean visible) {
        super(posX, posY);
        this.visible = visible;
    }


    @Override
    void update() {
        if (this.visible) {
            this.visible = false;
            System.out.println("Objeto invisivel");
        }
        else {
            this.visible = true;
            System.out.println("Objeto visível");
        }
    }

    @Override
    void draw() {
        System.out.println("Barril");
    }
}
