import java.util.List;

public class Convertible extends Car{

    // unique variables for the class
    private String doorNum;
    private List<String> avaiDoorNum = List.of("1 door", "2 doors", "4 doors");
    private String roofMat;
    private List<String> avaiRoofMat = List.of("Aluminium", "Canvas", "Plastic", "Gold");

    public Convertible() {
        //first is engine types, second is tire types
        super(List.of("Engine Small", "Engine Med", "Engine Big"), List.of("Tire 2", "Tire 3", "Tire 4"));
        options.add(avaiDoorNum);
        options.add(avaiRoofMat);
    }

    // unique variables for the class

    public void setOption1(String doorNum) {
        this.doorNum = doorNum;
    }

    public void setOption2(String roofMat) {
        this.roofMat = roofMat;
    }

    public String displayResult(){
        return displayResultMain() + " This SUV has " + doorNum + " and a roof made from " + roofMat + " .</html>";
    }
}
