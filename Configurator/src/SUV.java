public class SUV extends Car {
    // unique variables for the class

    private int numberOfSeats;
    private int sizeOfTrunk;
    private boolean hasTrailer;


    public SUV(String color, String wheels,int numberOfSeats, int sizeOfTrunk, boolean hasTrailer) {
        super();
        avaiEngineSizes = new int[]{1, 2, 3};
        this.numberOfSeats = numberOfSeats;
        this.sizeOfTrunk = sizeOfTrunk;
        this.hasTrailer = hasTrailer;
    }

    // unique methods for the class

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getSizeOfTrunk() {
        return sizeOfTrunk;
    }

    public void setSizeOfTrunk(int sizeOfTrunk) {
        this.sizeOfTrunk = sizeOfTrunk;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        hasTrailer = hasTrailer;
    }
}
