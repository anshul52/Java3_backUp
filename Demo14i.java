//abdul bari sir
//adding two matrices (2D array)
public class Demo14i {
    public static void main(String[] args) {
        int A[][]={{2,3,5,4},{8,5,6,7},{1,2,9,8}};
        int B[][]={{2,3,4,5},{2,5,4,7},{9,7,9,4}};
        int C [][] =new int [3][4];
        for(int i=0;i< A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int i=0;i< C.length;i++)
        {
            for(int j=0;j<C[0].length;j++)
            {
                System.out.print(" " + C[i][j]);
            }
            System.out.println();
        }

    }
}
