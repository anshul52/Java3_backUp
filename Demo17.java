import java.util.Arrays;
import java.util.Scanner;

//83- Array right rotation by K elements
public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size-");
        int size = sc.nextInt();
        int i;
        int[] arr = new int[size];
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 3;
        if (k >= arr.length) {
            k = k % arr.length;
        }
        for (int j = 1; j <= k; j++) {
            int temp = arr[arr.length - 1];
            for (i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
