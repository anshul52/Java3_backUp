//93- Strong number using methods
import java.util.Scanner;
public class Demo27 {
    static int  strongNum (int n){
        int sum =0;

        int j=n;
         while(n!=0)
         {
             int rem = n%10;
             int fact =1;
             int i=1;
             while(i<=rem)
             {
                  fact = fact * i;
                  i++;
             }
             sum += fact;
             n /=10;
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int temp = strongNum(n);
        String ans = (temp==n) ? "is StrongNumber" : "not StrongNumber";
        System.out.println(ans);

    }
}
