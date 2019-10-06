import java.util.List;
import java.util.ArrayList;
public class Car {

    private String color;
    private Engine engine;
    private Tires tire;
    private int topSpeed;

    // here is the array of all available colours, feel free to add or remove how you want
    private List<String> colors = List.of("black", "white", "red", "green");

    //array vsetkych available engine sizes. maybe better way to program this, standin for now
    private List<Integer> avaiEngineSizes;
    private List<Integer> avaiTireTypes;
    public ArrayList<List> options = new ArrayList<>();


    public Car(List<Integer> engineSizes, List<Integer> tireTypes) {
        this.avaiEngineSizes = engineSizes;
        this.avaiTireTypes = tireTypes;
        options.add(colors);
        options.add(avaiEngineSizes);
        options.add(avaiTireTypes);
    }

    public void setEngine(int size){
        /* creates the engine object*/
        this.engine = new Engine(size);
        this.topSpeed = 32 * (int)Math.pow(engine.getHorsePower(), 0.33);
    }

    public String[] getEngineSizes() {
            /* This creates a string array of every availabel engine type for the gui*/
            String[] engineSizes = new String[3];
            for (int i = 0; i < 3; i++) {
                engineSizes[i] = "Engine" + Integer.toString(avaiEngineSizes.get(i));
            }
        return engineSizes;
    }

    public List<String> getColors() {
        /* da nam vsetky available colors pre gui*/
        return colors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] colorToRGB(String color){
        /* this gives us the RGB value of the color based on the string */
        switch (color){
            case "black":
                return new int[]{235, 235, 235};

            case "red":
                return new int[]{240, 128, 128};

            case "green":
                return new int[]{34, 134, 34};

            case "white":
                return new int[]{10, 10, 10};
        }
        //default je boring white
        return new int[]{0, 0, 0};
    }
}
