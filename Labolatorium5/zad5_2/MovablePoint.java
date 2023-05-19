package zad5_2;

public class MovablePoint implements Movable {
    int x;
    int y;

    MovablePoint(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "X: %d, Y: %d".formatted(x,y);
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }
}
