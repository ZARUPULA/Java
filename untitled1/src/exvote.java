import java.util.Scanner;
public class exvote {
    public static void check (int age) {

        if(age<25) {
            //throw exception if not eligible to stand in election
            throw new ArithmeticException("nominee is not eligible to stand in election");
        }
        else {
            System.out.println("nominee is eligible to vote!!");
        }
    }
    //main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter nominee age");
        int age = sc.nextInt();
        check(age);
    }
}

