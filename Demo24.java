import java.util.Arrays;

//90- Move all the negative elements on left side and positive elements on right side without extra space in O(n).
public class Demo24 {
    public static void main(String[] args) {
        int arr[] ={2,4,-7,-9,-76,43,-21};
        int i=0;
        int j = arr.length-1;
        while(i<=j)
        {
            if(arr[j]<0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
