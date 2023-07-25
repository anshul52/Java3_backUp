//abdul bari sir
//increasing  size of an array
public class Demo14e {
    public static void main(String[] args) {
        int A[]={2,3,5,7,9,8,6};
        int B[]= new int [2* A.length];
        System.out.println("length of A before : " + A.length);
        for(int i=0;i< A.length;i++)
        {
            B[i] = A[i];
        }
        A=B;
        System.out.println("length of A before : " + A.length);
    }
}
