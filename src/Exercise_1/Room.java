package Exercise_1;

public class Room {

    private int area;
    private int currentTemp;
    private boolean unitAC;
    private int borderTemp;

    public Room(int area, int currentTemp, boolean unitAC, int borderTemp) {
        this.area = area;
        this.currentTemp = currentTemp;
        this.unitAC = unitAC;
        this.borderTemp = borderTemp;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getCurrentTemp() {
        return currentTemp;
    }
    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }
    public boolean isUnitAC() {
        return unitAC;
    }
    public void setUnitAC(boolean unitAC) {
        this.unitAC = unitAC;
    }
    public int getBorderTemp() {
        return borderTemp;
    }
    public void setBorderTemp(int borderTemp) {
        this.borderTemp = borderTemp;
    }
    String tempCheck() {
        if (unitAC && currentTemp > borderTemp) {
            return currentTemp - 1 + "true";
        } else {
            return "false";
        }
    }
    String desc() {
        return " W pokoju z klimatyzacją jest temperatura " + +currentTemp + " i zmienia się na ";
    }
}