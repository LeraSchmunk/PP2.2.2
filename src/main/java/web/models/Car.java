package web.models;

public class Cars {
    private String carModel;
    private String carColor;
    private int year;

    public Cars() {
    }

    public Cars(String carModel, String carColor, int year) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.year = year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Cars{" +
                "carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", year=" + year +
                '}';
    }
}
