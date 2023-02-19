package LabTask3;

public class Car
{
    private String name;
    private String model;
    private String color;
    private double speed;

    public void setValue (String name, String model, String color)
    {
        this.name = name;
        this.model = model;
        this.color = color;
    }
    public void speed (double speed)
    {
        this.speed = speed;
    }

    public void diplay ()
    {
        System.out.println("Name of the car is " + name);
        System.out.println("Name of the model is " + model);
        System.out.println("Color of the car is " + color);
        System.out.println("Speed of the car is " + speed);
    }
}
