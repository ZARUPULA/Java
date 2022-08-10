import java.util.Scanner;

public class vignesh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String output="";
        int i=0;
        for(i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                output+=Character.toUpperCase(input.charAt(i));
            }
            else{
                output+=Character.toLowerCase(input.charAt(i));
            }
        }
        System.out.println(output);

    }
}
