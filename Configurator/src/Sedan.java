public class Sedan extends Car {
    private boolean hasTrailer;

    public Sedan(String color, String wheels, boolean hasTrailer) {
        super();
        avaiEngineSizes = new int[]{2, 3, 4};

        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        hasTrailer = hasTrailer;
    }
}
