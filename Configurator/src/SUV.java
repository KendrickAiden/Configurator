public class SUV extends Car {
    // unique variables for the class

    private String seatNumber;
    private String[] avaiSeatNumbers = new String[]{"4", "4+1", "4+2"};
    private boolean isOffroad;


    public SUV() {
        super();
        avaiEngineSizes = new int[]{1, 2, 3};
    }

    // unique methods for the class


    public String[] getAvaiSeatNumbers() {
        return avaiSeatNumbers;
    }

    public void setSeatNumber(String seatNum){
        this.seatNumber = seatNum;
    }

    public boolean isOffroad() {
        return isOffroad;
    }

    public void setOffroad(boolean bool) {
        this.isOffroad = bool;
    }
}
