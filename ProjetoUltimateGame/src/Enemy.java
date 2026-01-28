public class Enemy extends Game implements Moveable{
    private int life;

    public Enemy(int posX, int posY, int life) {
        super(posX, posY);
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    void update() {
        if (life <= 0) {
            System.out.println("Inimigo morto!");
        }
        else {
            this.life -= 10;
            System.out.println("Inimigo: Dano sofrido!");
        }
    }

    @Override
    void draw() {
        System.out.println("Homem alto, vestido todo de preto, com uma espada de aço.");
    }

    @Override
    public boolean move(int direcao, int velocidade) {
        if (direcao == 1) {
            super.setPosX(getPosX() + velocidade);
            return true;
        } else if (direcao == -1) {
            super.setPosX(getPosX()-velocidade);
            return true;
        } else if (direcao == 2) {
            super.setPosY(getPosY() + velocidade);
            return true;
        } else if (direcao == -2) {
            super.setPosY(getPosY()-velocidade);
            return true;
        }

        return false;
    }
}
