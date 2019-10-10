package Exercise_1;

public class Room {

    private int currentTemp;
    private boolean unitAC;
    private int borderTemp;

    public Room(int temp, int currentTemp, boolean unitAC, int borderTemp) {
        this.currentTemp = currentTemp;
        this.unitAC = unitAC;
        this.borderTemp = borderTemp; }
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

    boolean tempCheck() {
        if ((unitAC)&&(currentTemp>borderTemp)) {
            setCurrentTemp(getCurrentTemp()-1);return true;
        } else {
            return false;
        }
    }
    String desc() {
        return " W pokoju z klimatyzacją jest temperatura " + +currentTemp + " i zmienia się na ";
    }
}