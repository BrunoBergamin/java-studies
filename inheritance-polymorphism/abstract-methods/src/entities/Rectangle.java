package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

    private double widht;
    private double height;

    public Rectangle (){
        super();
    }
    public Rectangle(Color color, double height, double widht) {
        super(color);
        this.height = height;
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return widht;
    }

    public void setWeight(double weight) {
        this.widht = weight;
    }

    @Override
    public double area() {
        return widht * height;
    }
}
