
class Static1 {

    public static void main(String[] args) {
        Car.ConvertKilToMiles();
        Car nano = new Car();
        nano.calculateMilage();

        Car bmw = new Car();
        bmw.calculateMilage();
    }
}

class Car {

    static void ConvertKilToMiles() {
        System.out.println("Converting Kilometers to Miles..");
    }

    void calculateMilage() {
        System.out.println("Calculating Milage...");
    }
}
