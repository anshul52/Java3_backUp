import java.util.Arrays;
import java.util.Scanner;

//86- Array Reverse Without Using Extra space
public class Demo20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int high = 0;
        int low = arr.length - 1;
        while (high <= low) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            high++;
            low--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
