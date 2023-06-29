package ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "Mercedea", "Redb");
        Car c2 = new Car(190, 8000, "Mercedesb", "Reda");
        Car c3 = new Car(220, 10000, "Mercedes", "White");
        Car c4 = new Car(230, 10000, "Mercedes", "Green");
        Car c5 = new Car(190, 8000, "Mercedesb", "Redb");

        Car[] list = new Car[5];
        list[0] = c1;
        list[1] = c2;
        list[2] = c3;
        list[3] = c4;
        list[4] = c5;

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
