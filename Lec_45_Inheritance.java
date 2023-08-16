package hello.com;

import java.util.Base64;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm setting x now");
        this.x = x;
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I'm setting y now");
        this.y = y;
    }
}
public class Lec_45_Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(43);
        System.out.println(b.getX());
        derived d = new derived();
        d.setY(4);
        System.out.println(d.getY());
    }
}
