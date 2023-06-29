package ex2;

public class Car implements Comparable<Car> { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Car anotherCar) {
        int tempSpeed = this.speed - anotherCar.speed;
        if (tempSpeed == 0) {
            int tempPrice = this.price - anotherCar.price;
            if (tempPrice == 0){
                int tempModel = this.model.compareTo(anotherCar.model);
                if (tempModel == 0) {
                    return this.color.compareTo(anotherCar.color);
                }else return tempModel;

            }else return tempPrice;

        }else return tempSpeed;
    }
    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}