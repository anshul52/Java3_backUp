//77- Check if array is sorted or not.
public class Demo10 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,50, 6};
        boolean isSorted = true;
        for(int i=0;i< arr.length-1;i++)
        {
            if (arr[i]> arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
