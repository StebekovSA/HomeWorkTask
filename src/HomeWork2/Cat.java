package HomeWork2;

public class Cat {
       private String name;
       private int weight;
       private int age;
       private String color;
       private String OwnerAdress;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String ownerAdress) {
        this.weight = weight;
        this.color = color;
        OwnerAdress = ownerAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !"".equals(name)) {
            this.name = name;
        }
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (age > 0) {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null || !"".equals(color)) {
            this.color = color;
        }
    }

    public String getOwnerAdress() {
        return OwnerAdress;
    }

    public void setOwnerAdress(String ownerAdress) {
        if (ownerAdress != null || !"".equals(ownerAdress)) {
            OwnerAdress = ownerAdress;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", OwnerAdress='" + OwnerAdress + '\'' +
                '}';
    }
}
