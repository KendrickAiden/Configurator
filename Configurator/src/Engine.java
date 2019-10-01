public class Engine {
    // unique variables for the class
    private int size;
    private int horsePower;


    public Engine(int size, int horsePower) {
        this.size = size;
        this.horsePower = horsePower;
    }

    // setters and getters in case we need them for something

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
