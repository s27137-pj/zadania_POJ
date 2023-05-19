package zad5_2;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint punkt = new MovablePoint(0, 0);

        System.out.println(punkt);

        punkt.moveDown();
        punkt.moveDown();
        punkt.moveLeft();

        System.out.println(punkt);

    }
    }

