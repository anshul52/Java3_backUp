//
import java.util.Arrays;
public class Demo12 {
    public static void main(String[] args) {
        int [] arr = {5,5,6,8,2,1};
        int k=3;
        int temp =arr[0];
        int j =0;
        for( j=0;j<k;j++)
        {
            arr[j] = arr[j+1];
        }
        arr[arr.length-1]= temp;

    }

}
