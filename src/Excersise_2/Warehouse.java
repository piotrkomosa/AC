package Excersise_2;

public class Warehouse {
    public static void main(String[] args) {

        Device device1 = new Device("QE65Q7FAM", "Samsung", "TV", (int) 9499.99); //code, producer, type, price
        Device device2 = new Device("P9 Lite", "Huawei", "Smatyphone"); //code, producer, type
        Device device3 = new Device("Playstation 4", "Sony", "Smatyphone", (int) 1899.99); //code, producer, type, price

//        device1.getInfo();
//        device2.getInfo();
//        device3.getInfo();
//        device1.allDevices();
//        device2.allDevices();
//        device3.allDevices();


        System.out.println("Kod: " + device1.allDevices());

    }
}
