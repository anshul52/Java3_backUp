//76- Find the second greatest element
public class Demo9 {
    public static void main(String[] args) {
        int [] arr ={2,96,69,77,147,20};
        int firstMax = Math.max(arr[0] , arr[1]);
        int secMax =Math.min(arr[0] , arr[1]);
        for(int i=2 ; i< arr.length;i++)
        {
            if(arr[i]>firstMax)
            {
                secMax = firstMax;
                firstMax = arr[i];

            } else if (arr[i]>secMax) {
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }
}
