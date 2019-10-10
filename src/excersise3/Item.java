package excersise3;

public class Item {
    private   int x1;
    private   int y1;
    private   int x2;
    private   int y2;
    private   int x3;
    private   int y3;

    public Item(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
   public double segment() {
        return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }
   public boolean traingle() {
        if (x1 != x2 && x1 != x3 && x2 != x3 && y1 != y2 && y1 != y3 && y2 != y3) {
            return true;
        } else {
            return false;
        }
    }
}



