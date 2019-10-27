package HomeWork3;

public class Wood {
    private Apple[] apple = new Apple[10];

    public void addApple(Apple newApple) {
        for (int i = 0; i < this.apple.length; i++) {
            if (this.apple[i] == null) {
                this.apple[i] = newApple;
                return;
            }
        }
    }

    public void addApple(Apple ...newApple) {
        for (int i = 0; i < this.apple.length; i++) {
            if (this.apple[i] == null) {
                for (int j = i; j < this.apple.length; j++) {
                    this.apple[j] = newApple[j];
                    return;
                }
            }
        }
    }

    public void getApple() {
        int count = 0;
        for (int i = 0; i < apple.length; i++) {
            if (apple[i] != null) {
                count++;
            }
        }
        System.out.println("Количество яблок: " + count);
    }
}

