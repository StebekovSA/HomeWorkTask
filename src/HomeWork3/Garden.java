package HomeWork3;

public class Garden {
    private Wood[] wood = new Wood[10];

    public void addWood(Wood newWood) {
        for (int i = 0; i < this.wood.length; i++) {
            if (this.wood[i] == null) {
                this.wood[i] = newWood;
                return;
            }
        }
    }

    public void getInfo() {

        int count = 0;
        for (int i = 0; i < wood.length; i++) {
            if (wood[i] != null) {
                count++;

                wood[i].getApple();
                System.out.println("Количество деревье: " + count);
            }
        }
    }
}
