import java.util.Scanner;

public class Qus3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        String a = sc.next();
        int l = sc.nextInt();
        for (int i=0;i<l;i++){
            for (int j=0;j<=i;j++) {
                System.out.print(b+" ");
            }
            for (int k=l-i-1; k>0;k--) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}



