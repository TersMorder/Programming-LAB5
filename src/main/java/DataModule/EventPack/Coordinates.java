package DataModule.EventPack;

public class Coordinates {
    private int x; //Максимальное значение поля: 718
    private double y;
    public Coordinates(int x, double y){
        this.x = x;
        this.y = y;
    }
    public Coordinates(){}


    public void setX(int x) {
        if(x<718) {
            this.x = x;
        }
        else {
            throw new IllegalArgumentException("Значение координаты x должно быть меньше 718");
        }
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

