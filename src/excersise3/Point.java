package excersise3;

public class Point {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public Point(int x1, int y1) {
    }

    public int getX() {
        return x1;
    }

    public void setX(int x) {
        this.x1 = x1;
    }

    public int getY() {
        return y1;
    }

    public void setY(int y) {
        this.y1 = y1;
    }

    public boolean quater1() {
        return (x1 > 0 && y1 > 0);
    }
    public boolean quater2() {
        return (x1 < 0 && y1 > 0);
    }
    public boolean quater3() {
        return (x1 < 0 && y1 < 0);
    }
    public boolean quater4() {
        return (x1 > 0 && y1 < 0);
    }
    public boolean lineX() {
        return (x1 == 0);
    }
    public boolean lineY() {
        return (y1 == 0);
    }
    public boolean middle() {
        return (x1 == 0 && y1 == 0);
    }
}


