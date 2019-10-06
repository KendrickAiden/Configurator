public class Car {

    private String color;
    private String wheels;
    private Engine engine;
    // here is the array of all available colours, feel free to add or remove how you want
    private String[] colors = new String[] {"black", "white", "red", "green"};

    //array vsetkych available engine sizes. maybe better way to program this, standin for now
    int[] avaiEngineSizes = new int[3];

    public Car() {
        //na zaciatku nic neveieme o aute, tak parametre pasovat asi netreba
    }

    public void setEngine(int size){
        /* creates the engine object*/
        this.engine = new Engine(size);
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
    //ake parametre ma wheels?
    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        wheels = wheels;
    }

}
