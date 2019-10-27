package HomeWork4;

public class Warrior {
    private String name;
    private int age;
    private int health;
    private int damage;


    public Warrior(String name, int age, int health, int damage) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.damage = damage;

    }

    public void fight(Warrior enemy) {
        double k = Math.random();
        while (enemy.health <= 0 && this.health <= 0) {
            if (k > 0.5) {
                this.health -= enemy.damage;
            } else {
                enemy.health -= this.damage;
            }
            if (this.health <= 0) {
                System.out.println("Иван погиб в бою");
            } else if (enemy.health <= 0) {
                System.out.println("Петр погиб в бою");
            }
        }
    }
}
