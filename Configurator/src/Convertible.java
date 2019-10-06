public class Convertible extends Car{

    // unique variables for the class
    private String doorStyle;
    private String[] doorStyles = new String[]{"4-door", "2-door"};
    private String wheelDrive;
    private String[] wheelDriveTypes = new String[]{"Rear-wheel Drive", "All-wheel drive"};

    public Convertible() {
        super();
        avaiEngineSizes = new int[]{1, 2, 5};
    }

    // unique variables for the class

    public String[] getDoorStyles(){
        return doorStyles;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String[] getWheelDriveTypes(){
        return wheelDriveTypes;
    }

    public void setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
    }
}
