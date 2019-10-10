package excersise3;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public boolean quater1() {
        if (x > 0 && y > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean quater2() {
        if (x < 0 && y > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean quater3() {
        if (x < 0 && y < 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean quater4() {
        if (x > 0 && y < 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean lineX() {
        if (x == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean lineY() {
        if (y == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean middle() {
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}


