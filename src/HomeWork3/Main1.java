package HomeWork3;

public class Main1 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Wood wood1 = new Wood();


        // не считает яблоки
        Garden garden = new Garden();
        garden.addWood(wood1);

        Wood wood = new Wood();
        wood.addApple(apple1);
        wood.addApple(apple2, apple3);

        garden.getInfo();


    }
}
