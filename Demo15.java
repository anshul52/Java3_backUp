//81- Array left rotation by K elements

import java.util.Arrays;
import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] ={2,5,26,523,74,12,1};
        if(k>= arr.length)
        {
            k=k% arr.length;
        }
        for(int i=1;i<=k;i++ )
        {
            int temp = arr[0];
            for(int j=0;j< arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}


