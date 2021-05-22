package game;

import game.Shape;

public class Segitiga implements Shape {

    public void draw() {
        System.out.print("Bentuk segitiga ");
    }

    public void color(String warna) {
        System.out.println("dan berwarna " + warna);

    }
}