public class Car {

    private String color;
    private String wheels;

    Car(String color, String wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    // setters and getters in case we need them for something

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        wheels = wheels;
    }

    public static void main(String args[]) {

        // 3 objects created from class engine, such as required in the assignment

        Engine engineType_1 = new Engine();
        Engine engineType_2 = new Engine();
        Engine engineType_3 = new Engine();


    }
}
