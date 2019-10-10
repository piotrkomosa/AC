package excersise3;

public class Test {
    public static void main(String[] args) {
        Item item = new Item(30, 0, 0, 40, 18, 22);
        item.segment();
        System.out.println("Dlugość odcinka wynosi: " + item.segment());
        Point point = new Point(12, 15);
        point.lineX();
        point.quater2();
        System.out.println("Punkt leży na linii X: " + point.lineX());
        System.out.println("Punkt leży w ćwiartce 2 : " +point.quater1());
        item.traingle();
        System.out.println("Troktą można zbudować: " +item.traingle());
    }
}
