//74- Find the greatest element and print its index too.
//      {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index
public class Demo7 {
    public static void main(String[] args) {
        int [] arr ={2,96,69,77,145,20};
        int max=arr[0] , index =0;
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max =arr[i];
                index = i;
            }
        }
        System.out.println( "max element is : "+max +"\nindex is :" + index);
    }
}

