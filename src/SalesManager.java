public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long averageValue() {
        long average = 0;
        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }
        long sumMinAndMax = min() + max();

        average = (average - sumMinAndMax) / (sales.length - 2);
        return average;
    }
}
