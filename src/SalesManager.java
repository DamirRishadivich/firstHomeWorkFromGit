public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int averageValue() {
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != min() && sales[i] != max()) {
                average += sales[i];
            } else {
                continue;
            }
        }
        average = average / (sales.length - 2);
        return average;
    }
}
