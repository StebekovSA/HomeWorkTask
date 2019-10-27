package HomeWork4;

public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Иван", 27, 100, 35 );
        Warrior warrior2 = new Warrior("Петр", 27, 100, 35 );

        warrior1.fight(warrior2);

    }
}
