public class Main {
    public static void main(String[] args) {
        Cenario cenario = new Cenario(100, 100);
        Scene cena = new Scene(80, 90, true);
        Enemy inimigo1 = new Enemy(60, 50, 100);
        Enemy inimigo2 = new Enemy(5, 2, 100);
        Hero heroi = new Hero(0, 0,200,150,100);

        cenario.draw();
        cena.draw();
        heroi.draw();

        if (heroi.move(1, 5)) {
            System.out.println("Andou 5 m para a direita");
            System.out.println(heroi.getPosX() + " " + heroi.getPosY());
        } else {
            System.out.println("Direção inválida");
        }

        if (heroi.move(2, 2)) {
            System.out.println("Andou 2 m para a cima");
            System.out.println(heroi.getPosX() + " " + heroi.getPosY());
        } else {
            System.out.println("Direção inválida");
        }
        inimigo2.draw();

        for (int i = 0; i < 6; i++) {
            inimigo2.update();
        }

        for (int i = 0; i < 3; i++) {
            heroi.update();
        }

        for (int i = 0; i < 5; i++) {
            inimigo2.update();
        }

        if (heroi.move(1, 55)) {
            System.out.println("Andou 55 m para a direita");
            System.out.println(heroi.getPosX() + " " + heroi.getPosY());
        } else {
            System.out.println("Direção inválida");
        }

        if (heroi.move(2, 48)) {
            System.out.println("Andou 48 m para a cima");
            System.out.println(heroi.getPosX() + " " + heroi.getPosY());
        } else {
            System.out.println("Direção inválida");
        }

        inimigo1.draw();

        for (int i = 0; i < 10; i++) {
            heroi.update();
        }
        for (int i = 0; i < 5; i++) {
            inimigo1.update();
        }
        for (int i = 0; i < 5; i++) {
            heroi.update();
        }
        for (int i = 0; i < 6; i++) {
            inimigo1.update();
        }


    }
}
