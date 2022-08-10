
    import java.util.Arrays;
import java.util.Scanner;

    public class student3 {
        public static void main(String args[])
        {
            int rows, column, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            rows = sc.nextInt();
            System.out.print("Enter total subjects : ");
            column = sc.nextInt();
            int array[][] = new int[rows][column];
            int sumarray[]  = new int[rows];
            for(int i =0; i < rows; i++)
            {
                System.out.println("Enter student marks" + (i+1) + " : ");
                for(int j=0; j < column ; j++)
                {
                    array[i][j] = sc.nextInt();
                }
            }


            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    sum += array[i][j];
                }
                System.out.println("Student " + (i+1) + "= "  + sum);
                sumarray[i] = sum;
                sum = 0;
            }

            for(int i = 0; i<sumarray.length; i++)
            {
                sum += sumarray[i];
                if(sumarray[i] <= 50)
                    System.out.println("low performers : student " + (i+1) + " - "+ sumarray[i]);
            }
            System.out.println("overall class average " + sum/rows);
            Arrays.sort(sumarray);
            for(int j =0; j< sumarray.length ; j++)
            {
                System.out.println("rank - " + sumarray[j] + " " + (j+1));
            }
        }
    }

