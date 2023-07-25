//75- Find the smallest element and print its index too.
//        {2, 96, 69, 77, 145, 20} = Min element = 2 found at 0 index
public class Demo8 {
    public static void main(String[] args) {
        int[] arr = {21, 96, 69, 77, 145, 20};
        int min = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("min element is : " + min + "\nindex is :" + index);
    }
}
