package Excersise_2;

class Device {
    public static void main(String[] args) {
    }
        String code;
        String producer;
        String type;
        double price;
    public Device(String code, String producer, String type) {
            this.code = code;
            this.producer = producer;
            this.type = type;
        }
    public Device(String code, String producer, String type, double price){
            this(code, producer, type);
            this.price = price;
        }
        String getInfo () {
            return code +" producent: "+ producer +" typ: "+ type +" cena: "+ price;
        }
        String allDevices () {
            return getInfo() + "\n" + getInfo() + "\n" + getInfo();
        }
    }


