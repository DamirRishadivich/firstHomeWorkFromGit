import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 14, 12};
        SalesManager salesManager = new SalesManager(array);
        System.out.println(salesManager.averageValue());
    }
}
