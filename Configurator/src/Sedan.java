import java.util.List;

public class Sedan extends Car {
    String trailerAttachment;
    private List<String> trailerAttachments = List.of("a trailer attachment", "no trailer attachment");
    String backStyle;
    private List<String> avaiBackStyles = List.of("classic", "coach wagon", "hatchback");


    public Sedan() {
        super(List.of("Engine VerySmall", "Engine Small", "Engine Med"), List.of("Tire 1", "Tire 2", "Tire 3"));
        options.add(trailerAttachments);
        options.add(avaiBackStyles);
    }

    public void setOption1(String trailerAttachment) {
        this.trailerAttachment = trailerAttachment;
    }


    public void setOption2(String backStyle){
        this.backStyle = backStyle;
    }

    public String displayResult(){
        return displayResultMain() + " This SUV has a " + backStyle + " back and has " + trailerAttachment + ".</html>";
    }
}
