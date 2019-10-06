import java.lang.Math;
public class Engine {
    // unique variables for the class
    private int engineSize;
    private int horsePower;


    public Engine(int size) {
        this.engineSize = size;
        //example horsepower function, subject to change
        this.horsePower = (int)Math.pow(100 * engineSize, 1.5);
    }

    public int getHorsePower(){
        return horsePower;
    }

}
