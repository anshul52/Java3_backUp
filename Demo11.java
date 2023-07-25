//78- Pallindromic array - Write a program to check if elements of
// an array are same or not it read from front or back
//      Example : arr= [2,3,15,15,3,2]

import java.util .Scanner;
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 15, 3, 2};
        int j = arr.length -1;
        boolean pallind = true;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] != arr[j]) {
                pallind = false;
                break;
            }
            j--;
        }
        if (pallind == true) {
            System.out.println("pallindromic array");
        } else {
            System.out.println("not pallindromic array");
        }
    }
}