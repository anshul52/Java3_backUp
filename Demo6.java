//73- Mean of array elements.
public class Demo6 {
    public static void main(String[] args) {
        int arr[]={2,5,2,7,3};
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        int mean = sum / arr.length;
        System.out.println(mean);
    }
}
