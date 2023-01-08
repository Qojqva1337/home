public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int age;
    public String country;

    public Car(String brand, String model, double engineVolume, String color, int age, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
        this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (Double.compare(engineVolume,0)== 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        };

        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (age <= 0) {
            this.age = 2000;
        } else
            this.age = age;
    }
}
