package Implementation;

public class Checkout {

    int total = 0;

    public void add(int count, int price) {
        this.total += (count * price);
    }

    public int total() {
        return this.total;
    }
}
