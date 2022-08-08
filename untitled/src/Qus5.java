
    import java.util.Scanner;
    public class Qus5 {

            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int inputNo = sc.nextInt();

                while(inputNo != 1){
                    System.out.print(inputNo + " ->");
                    if(inputNo % 2 == 0){
                        inputNo /= 2;
                    }else{
                        inputNo = (3*inputNo) + 1;
                    }
                }
                System.out.println(1);
            }
        }




