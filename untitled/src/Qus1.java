import java.util.Scanner;

public class Qus1 {
    public static void main(String[] args) {
        int x, y, z, n;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        n = s.nextInt();
        if(x>=n){
            System.out.println("L1");
        }
        else if (y>=n){
            System.out.println("L2");
        }
        else{
            System.out.println("L3");
        }
    }
}