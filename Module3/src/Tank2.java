public class Tank2 {

    int x, y;
    int dir;
    int fuel;

    public Tank2() {
        dir = 0;
        x = 0;
        y = 0;
        fuel = 100;
    }
    public Tank2(int x, int y) {
        dir = 0;
        x = 0;
        y = 0;
        fuel = 100;
    }
    public void goForward(int i) {
        if (dir == 0) x += checkFuel(i);
        else if (dir == 1) y += checkFuel(i);
        else if (dir == 2) x -= checkFuel(i);
        else y -= checkFuel(i);
    }

    private int checkFuel(int i){
        if (fuel >= i){
            fuel -= i;
            return i;
        }
        else return fuel;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}


