//abdul bari sir
//reverse copying an array
import java.util.Arrays;
public class Demo14d
{
    public static void main(String[] args)
    {
        int []A ={2,3,4,5,6,3,8};
        int []B = new int [7];

        for(int i=A.length-1,j=0;i>=0 ;i--,j++)
        {
                B[j]=A[i];
        }
        System.out.println(Arrays.toString(B));
    }
}