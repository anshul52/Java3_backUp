//79- Array left Rotation by 1
import java.util.Arrays;
public class Demo13 {
    public static void main(String[] args) {
        int [ ] arr ={4,5,6,7,8};
        int temp = arr[0];
        for(int i=0 ;i< arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
