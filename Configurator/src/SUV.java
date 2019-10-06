import java.util.List;

public class SUV extends Car {
    // unique variables for the class

    private String seatNumber;
    private List<String> suvSeats = List.of("4 seats", "5 seats", "7 seats", "8 seats");
    private String wheelDrive;
    private List<String> avaiWheelDrives = List.of("2x4", "4x4");

    public SUV() {
        super(List.of(3, 4, 5), List.of(3, 4, 5));
        options.add(suvSeats);
        options.add(avaiWheelDrives);
    }

    // unique methods for the class


    public void setSeatNumber(String seatNum){
        this.seatNumber = seatNum;
    }

    public void setDrive(String drive) {
        this.wheelDrive = drive;
    }

}
