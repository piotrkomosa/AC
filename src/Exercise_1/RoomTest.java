package Exercise_1;

public class RoomTest {
    public static void main(String[] args) {

        Room room1= new Room(25,30,true);
        room1.setBorderTemp(22);
        System.out.println("W pokoju z klimatyzatorem temperatura wynosi: " + room1.currentTemp + " , po wlączeniu klimy spada do " + (room1.currentTemp-1) );

    }

}
