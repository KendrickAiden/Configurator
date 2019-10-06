import java.lang.Math;
public class Engine {
    // unique variables for the class
    private int engineSize;
    private int horsePower;
    public String strsize;


    public Engine(String strSize) {
        this.strsize = strSize;
        int size = 1;
        switch (strSize){
            case "Engine VerySmall":
                size = 1;
                break;
            case "Engine Small":
                size = 2;
                break;
            case "Engine Med":
                size = 3;
                break;
            case "Engine Big":
                size = 4;
                break;
            case "Engine VeryBig":
                size = 5;
                break;
        }
        this.engineSize = size;
        //example horsepower function, subject to change
        this.horsePower = (int)Math.pow(100 * engineSize, 1.5);
    }

    public int getHorsePower(){
        return horsePower;
    }

}
