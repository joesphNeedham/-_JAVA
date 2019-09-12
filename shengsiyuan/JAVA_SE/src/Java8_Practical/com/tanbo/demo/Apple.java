package Java8_Practical.com.tanbo.demo;

public class Apple {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a);
    }

    private String color;
    private Double weight;
    private String brand;


    public Apple() {
    }

    public Apple(Double weight) {
        this.weight = weight;
    }

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}