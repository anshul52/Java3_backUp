//89- Move all the negative elements on left side and positive elements on right side with extra space in O(n).
import java.util.Arrays;
public class Demo23 {
        public static void main(String[] args) {
            int arr[] = {-2, 4, -6, -7, 890, -12};
            int temp[] = new int[arr.length];
            int j = 0;
            for (int a : arr) {
                if (a < 0) {
                    temp[j++] = a;
                }
            }
            for (int a : arr) {
                if (a > 0)
                    temp[j++] = a;
            }
            System.out.println(Arrays.toString(temp));
        }
}
