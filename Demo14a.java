//abdul bari sir
//inserting an element in an array
import java.util.Arrays;

public class Demo14a {
    public static void main(String[] args) {
        int [ ] arr = new int [10];
        arr[0]=3;
        arr[1]=4;
        arr[2]=7;
        arr[3]=9;
        arr[4]=2;
        arr[5]=8;
        int n=6;
        int x=22;
        int index = 2;
        for(int i= n;i>index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));
    }
}
