//96- Leetcode 1929 - Concatenation of array
import java.util.Arrays;

public class Demo30 {
   public static int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int ans[] = new int[2 * n];
            for (int i = 0; i < n * 2; i++) {
                ans[i] = nums[i % n];
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] nums = {2, 3, 4, 5, 6};

            int [] c = getConcatenation(nums);
            //new Demo4().printArr(nums);
            System.out.println(Arrays.toString(c));
        }

    }
