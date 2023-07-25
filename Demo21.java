//87- Linear Search an array - If element found print the index else -1
public class Demo21 {
    public static void main(String[] args) {
           int arr[] ={ 2,4,6,7,1,65,23,9};
           int key =9;
           int n =-1;
           for(int i=0;i< arr.length;i++)
           {
               if(arr[i] == key)
               {
                   System.out.println(i);
                   System.exit(0);
               }
           }
        System.out.println(n);
    }
}
