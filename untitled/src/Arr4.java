public class Arr4 {
    public static void main(String[] args) {

         int mode ( int a[]){
            int maxValue, maxCount;

            for (int i = 0; i < a.length; ++i) {
                int count = 0;
                for (int j = 0; j < a.length; ++j) {
                    if (a[j] == a[i]) ++count;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = a[i];
                }
            }

            return maxValue;
        }
    }
}
