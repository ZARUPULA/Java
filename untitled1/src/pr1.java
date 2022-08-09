public class pr1 {
    public static void main(String[] args) {

    }
        private String name;
        private int day;
        private String month;
    public pr1(String n, int d, String m){
            name = n;
            day = d;
            month = m;
        }
        public boolean inSameMonth (pr1 hol){
            return this.month.equals(hol.month);
        }
        public static double avgDate (pr1[]hol) {
            int sum = 0;
            for (int i = 0; i < hol.length; i++) {
                sum = sum + hol[i].day;
            }
            return ((double) sum) / hol.length;

        }
    pr1 in = new pr1("Independence Day", 4, "July");



    }

