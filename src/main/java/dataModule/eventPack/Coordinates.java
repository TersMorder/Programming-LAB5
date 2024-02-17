package dataModule.eventPack;

import exceptions.validateExceptions.XCoordinateValidateException;

public class Coordinates {
    private int x; //Максимальное значение поля: 718
    private double y;
    public Coordinates(int x, double y){
        this.x = x;
        this.y = y;
    }
    public Coordinates(){}


    public void validate(int x) {
        if(x<718) {
            this.x = x;
            System.out.println("Установленно!");
        }
        else {
            throw new XCoordinateValidateException("Значение координаты x должно быть меньше 718");
        }
    }

    public void setY(double y) {
        this.y = y;
        System.out.println("Установленно!");
    }

    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

