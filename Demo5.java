//72- Accept size n from user and create a n size array then take n inputs into the and finally
//      Print the sum of all elements in the array in the following manner
//      10 + 20 + 30 = 60
import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        int sum = 0;
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        //print array
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " + ");
        }
        System.out.println(arr[size - 1] + " = " + sum);

    }
}