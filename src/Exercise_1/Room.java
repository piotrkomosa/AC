package Exercise_1;

public class Room {

    int area;
    int currentTemp;
    boolean unitAC;
    int borderTemp;

    public Room(int area, int currentTemp, boolean unitAC) {
        this.area = area;
        this.currentTemp = currentTemp;
        this.unitAC = unitAC;
    }



    public int getBorderTemp() {
        return borderTemp;
    }

    public void setBorderTemp(int borderTemp) {
        this.borderTemp = borderTemp;
    }

    boolean tempChange() {
        if (unitAC == true && currentTemp> borderTemp) {
            return true;
        } else {
            return false;
        }

        if ( tempChange())

    }
}