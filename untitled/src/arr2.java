import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        float mean;
        int sum, i;
        int n = 5;
        int a[] = {1,2,3,4,5};
        sum = 0;

        for(i = 0; i < n; i++) {
            sum+=a[i];
        }
        System.out.println("Mean is "+ sum/(float)n);
    }
}





