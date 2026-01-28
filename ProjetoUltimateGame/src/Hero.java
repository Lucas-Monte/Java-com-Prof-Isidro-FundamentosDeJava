public class Hero extends Game implements Moveable{
    private int life;
    private int power;
    private int weapon;

    public Hero(int posX, int posY, int life, int power, int weapon) {
        super(posX, posY);
        this.life = life;
        this.power = power;
        this.weapon = weapon;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    @Override
    void update() {
        if (life <= 0) {
            System.out.println("Heroi morto!");
        }
        else {
            this.life -= 5;
            System.out.println("Heroi: Dano sofrido!");
        }
    }

    @Override
    void draw() {
        System.out.println("Homem alto, vestido todo de preto com vermelho, com uma Katana vermelha.");
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
