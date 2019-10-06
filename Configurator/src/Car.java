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
    private List<String> avaiEngineSizes;
    private List<String> avaiTireTypes;
    public ArrayList<List<String>> options = new ArrayList<>();


    public Car(List<String> engineSizes, List<String> tireTypes) {
        this.avaiEngineSizes = engineSizes;
        this.avaiTireTypes = tireTypes;
        options.add(colors);
        options.add(avaiEngineSizes);
        options.add(avaiTireTypes);
    }

    public void setEngine(String strSize){
        /* creates the engine object*/
        this.engine = new Engine(strSize);
        this.topSpeed = 32 * (int)Math.pow(engine.getHorsePower(), 0.33);
    }

    public void setTires(String tires){
        this.tire = new Tires(tires);
    }

    public List<String> getColors() {
        /* da nam vsetky available colors pre gui*/
        return colors;
    }
    public void setOption1(String option1){

    }

    public void setOption2(String option2){

    }
    public void setColor(String color) {
        this.color = color;
    }

    public String displayResultMain(){
        String result = "<html>Your car is a " + this.color + " " + this.getClass().getSimpleName() + " with a top speed of " +
                Integer.toString(this.topSpeed)+ ". It has a " + engine.strsize + " engine with " +
                engine.getHorsePower() + " horsepower and " + tire.type + " tires.";
        return result;
    }
    public String displayResult(){
        return displayResultMain();
    }

    public int[] colorToRGB(String color){
        /* this gives us the RGB value of the color based on the string */
        switch (color){
            case "black":
                return new int[]{25, 25, 25};

            case "red":
                return new int[]{240, 128, 128};

            case "green":
                return new int[]{34, 134, 34};

            case "white":
                return new int[]{220, 220, 220};
        }
        //default je boring white
        return new int[]{0, 0, 0};
    }


}
