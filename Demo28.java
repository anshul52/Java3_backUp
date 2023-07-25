//94- Check if a number is X or not. X is the number whole repeated sum of digits is equal to 1
//        Ex- 109 = 1 + 0 + 9 = 10 = 1 + 0 = 1 - Keep adding digits untill it becomes a single digit number
public class Demo28 {
    public static void main(String[] args) {
        int a = 109;
        int b = a;
        while(b!=1)
        {
            int sum = 0;
            while (b != 0) {
                int rem = b % 10;
                sum = sum + rem;
                b = b / 10;
            }
            b = sum;
        }
        int X =1;
        String ans = (b==X) ? "Number is X " : " Number is not X";
        System.out.println(ans);
    }
}
