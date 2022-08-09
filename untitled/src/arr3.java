import java.lang.reflect.Array;
import java.util.Arrays;

public class arr3 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
        int n = a.length;
        Arrays.sort(a);


        if (n % 2 != 0)
            System.out.println("Median is" + (double)a[n / 2]);
        else
            System.out.println("Median is"+(double)(a[(n - 1) / 2] + a[n / 2]) / 2.0);


    }
}
