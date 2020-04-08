package tobi.udemy.javaclasses;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Car {
    public static int X = 5;

    private String color;
    private String model;
    private int year;

    private Object object;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public @NotNull String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Object getObject() {
        return object;
    }

    public void setColor(@NotNull String color) {
        this.color = color;
    }

    public void setModel(@Nullable String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void variableMethod(int num, String... strings){
        for(String string : strings){
            System.out.println(string);
        }
    }

    public void wantsIntArray(int[] theArray){
        for(int i : theArray){
            System.out.print("This is the int: "+ i + "; ");
        }
    }

    public void runMethod(){
        new Thread(() -> System.out.println("Ich bin in einem Java Runnable")).start();
    }

    public void runMethod(Runnable runner){
        new Thread(runner).start();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
