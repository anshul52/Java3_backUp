//88- Binary Search. If element found print the index else -1
public class Demo22 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 9, 10, 13, 15, 17, 19};
        int l = 0;
        int h = arr.length - 1;
        int key = 17;

        int foundAt = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == key) {
                foundAt = mid;
                break;
            }
            if (arr[mid] > key) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        System.out.println(foundAt);
    }
}
