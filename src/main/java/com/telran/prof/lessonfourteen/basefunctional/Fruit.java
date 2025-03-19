package com.telran.prof.lessonfourteen.basefunctional;

public class Fruit {

    private String title;

    private double weight;

    private int price;

    private boolean inStock;

    public Fruit(String title, double weight, int price, boolean inStock) {
        this.title = title;
        this.weight = weight;
        this.price = price;
        this.inStock = inStock;
    }

    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}
