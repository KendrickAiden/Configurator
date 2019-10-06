import java.lang.Math;
public class Engine {
    // unique variables for the class
    private int size;
    private int horsePower;


    public Engine(int size) {
        this.size = size;
        //example horsepower function, subject to change
        this.horsePower = (int)Math.pow(100 * size, 1.5);
    }



}
