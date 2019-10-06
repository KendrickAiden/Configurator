public class Car {

    private String color;
    private Engine engine;
    private int topSpeed;

    // here is the array of all available colours, feel free to add or remove how you want
    private String[] colors = new String[] {"black", "white", "red", "green"};
    
    //array vsetkych available engine sizes. maybe better way to program this, standin for now
    int[] avaiEngineSizes = new int[3];


    public Car() {
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
            engineSizes[i] = "Engine" + Integer.toString(avaiEngineSizes[i]);
        }
        return engineSizes;
    }

    public String[] getColor() {
        /* da nam vsetky available colors pre gui*/
        return colors;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
