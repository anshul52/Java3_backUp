import java.util.Arrays;

//85- Array Reverse Using Extra space
public class Demo19 {
    public static void main(String[] args) {
        int arr[]  = {2,5,8,1,21,32,98,65};
        int arr1[] = new int[arr.length];
        int j=0;
        for(int i= arr.length;i>0;i--)
        {
            arr1[j++] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
