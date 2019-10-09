package Exercise_1;

public class RoomTest {
    public static void main(String[] args) {

        Room room1 = new Room(25, 23, true, 22);
        room1.tempCheck();
        room1.desc();
        System.out.println(room1.desc() + room1.tempCheck());
        Room room2 = new Room(25, 20, true, 22);
        System.out.println(room2.desc() + room2.tempCheck());
    }
}