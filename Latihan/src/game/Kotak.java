package game;
import game.Shape;

public class Kotak implements Shape{
 
    public void draw(){
        System.out.print("Bentuk Kota ");
    }

    @Override
    public void color(String warna) {
        System.out.println("dan berwarna "+warna);
    }
}
