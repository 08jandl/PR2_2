package Generics1;

public class Fruit {
    private Color color;
    private String name;
    private double weight;

    public Fruit(Color color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
