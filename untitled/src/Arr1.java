import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i;


        int max = arr[0];



        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println(max);


        }
    }




