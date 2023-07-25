//abdul bari sir
//multiplying  two matrices (2D array)
public class Demo14j {
    public static void main(String[] args) {
       int [][]A = {{2,3,4},{6,4,1},{3,9,3}};
       int [][]B = {{1,0,0},{0,1,0},{0,0,1}};
       int [][]C = new int[3][3];

       for(int i=0;i< A.length;i++) {
           for(int j=0;j<A.length;j++) {
               C[i][j]=0;
               for(int k=0;k<A.length;k++) {
                   C[i][j]= C[i][j] + A[i][k] * B[k][j];
               }

           }
       }

        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
