//abdul bari sir
//to access an 2D array using for (each loop)
public class Demo14g {
    public static void main(String[] args) {
        int A[][]={{2,3,4,5},{2,5,4,7},{9,7,9,4}};
        for(int x[]: A)
        {
            for(int y : x)
            {
                System.out.println( " "+ y);
            }
            System.out.println();
        }
    }
}
