public class Convertible extends Car{

    // unique variables for the class
    private String roof;
    private int numberOfDoors;

    public Convertible(String color, String wheels, String roof, int numberOfDoors) {
        super();
        avaiEngineSizes = new int[]{1, 2, 5};
        this.roof = roof;
        this.numberOfDoors = numberOfDoors;
    }

    // unique variables for the class

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
