//abdul bari sir
//deleting an element in an array
import java.util.Arrays;

public class Demo14b {
    public static void main(String[] args) {
        int [ ] arr ={2,4,6,8,3,7,12};

        int temp =0;
        int index = 1;

        for(int i=index;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
