public class Sedan extends Car {
    private boolean hasTrailer;
    public String backStyle;
    public String[] avaiBackStyles = new String[]{"Sedan", "Station wagon", "Hatchback"};

    public Sedan(String color, String wheels, boolean hasTrailer) {
        super();
        avaiEngineSizes = new int[]{2, 3, 4};

    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        hasTrailer = hasTrailer;
    }

    public String[] getBaclStyles() {
        return avaiBackStyles;
    }

    public void setBackStyle(String backStyle){
        this.backStyle = backStyle;
    }
}
