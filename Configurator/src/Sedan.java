import java.util.List;

public class Sedan extends Car {
    String trailerAttachment;
    private List<String> trailerAttachments = List.of("With trailer attachment", "No trailer attachment");
    String backStyle;
    private List<String> avaiBackStyles = List.of("Leather", "Plastic", "Wood", "Gold");


    public Sedan() {
        super(List.of(1, 2, 3), List.of(2, 3, 4));
        options.add(trailerAttachments);
        options.add(avaiBackStyles);
    }

    public void setTrailerAttachment(String trailerAttachment) {
        this.trailerAttachment = trailerAttachment;
    }


    public void setBackStyle(String backStyle){
        this.backStyle = backStyle;
    }
}
