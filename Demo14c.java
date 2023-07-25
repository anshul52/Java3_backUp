//abdul bari sir
//copying an array

import java.util.Arrays;
public class Demo14c {
    public static void main(String[] args)
    {
        int []A ={2,4,6,8,9,7,5,3};
        int []B = new int [8];

        for(int i=0;i<A.length;i++)
        {
            B[i]= A[i];
        }
        System.out.println(Arrays.toString(B));
    }
}


//`package scarray3;

//public class Demo14c {
//    public static void main(String[] args) {
//        int A[] = {8, 6, 10, 9, 2};
//
//        System.out.println("Length of A=" + A.length);
//
//        int B[] = new int[10];
//
//        for (int i = 0; i < A.length; i++) {
//            B[i] = A[i];
//        }
//        A = B;
//
//        System.out.println("Length of A=" + A.length);
//
//    }
//}


