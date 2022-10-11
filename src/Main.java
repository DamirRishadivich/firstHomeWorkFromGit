import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] array = {5, 5, 10, 10, 15, 20, 20};
        SalesManager salesManager = new SalesManager(array);
        System.out.println(salesManager.averageValue());
    }
}
