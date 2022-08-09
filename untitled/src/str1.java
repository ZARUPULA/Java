public class str1 {
    public static void main(String[] args) {
       String st = "karthik";
       String at = "nice";
       String a = st+" "+at;
        System.out.println(st.length());
        System.out.println(a);
        char ch;
        String rs = "";
        for (int i=0;i<a.length();i++){
            ch =a.charAt(i);
            rs = ch+rs;
        }
        System.out.println(rs);
        if (st.equals(at) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
