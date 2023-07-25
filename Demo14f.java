//abdul bari sir
//to access an 2D array
public class Demo14f {
    public static void main(String[] args) {
        int A[][]={{2,3,4,5},{2,5,4,7},{9,7,9,4}};
        for(int i=0;i< A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                System.out.print( " " + A[i][j]);
            }
            System.out.println();
        }
    }
}
