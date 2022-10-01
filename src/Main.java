import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 21, 11, 32, 45};
        SalesManager salesManager = new SalesManager(array);
        System.out.println(salesManager.max());
    }
}
