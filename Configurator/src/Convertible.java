import java.util.List;

public class Convertible extends Car{

    // unique variables for the class
    private String doorNum;
    private List<String> avaiDoorNum = List.of("1 door", "2 doors", "4 doors");
    private String roofMat;
    private List<String> avaiRoofMat = List.of("Aluminium", "Canvas", "Plastic", "Gold");

    public Convertible() {
        //first is engine types, second is tire types
        super(List.of(2, 3, 4), List.of(1, 2, 3));
        options.add(avaiDoorNum);
        options.add(avaiRoofMat);
    }

    // unique variables for the class

    public void setDoorNum(String doorNum) {
        this.doorNum = doorNum;
    }

    public void setRoofMat(String roofMat) {
        this.roofMat = roofMat;
    }
}
