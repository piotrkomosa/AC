package exversise2;

class Device {
    private String code;
    private String producer;
    private String type;
    double price;
    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }
    public Device(String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }
    public static void main(String[] args) {
    }
    String getInfo() {
        return "Kod: " + code + " producent: " + producer + " typ: " + type + " cena: " + price;
    }
    String allDevices() {
        return getInfo() + "\n";
    }
}


