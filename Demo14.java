import java.util.Arrays;
//80- Array right Rotation by 1
public class Demo14 {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7};
        int temp = arr[arr.length-1];
        for(int i = arr.length-1; i >0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

