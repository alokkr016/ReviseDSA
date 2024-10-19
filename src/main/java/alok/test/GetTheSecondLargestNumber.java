package alok.test;

public class GetTheSecondLargestNumber {
    public static int secondLargestUnoptimized(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > firstLargest){
                firstLargest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int item : arr){
            if (item > secondLargest && item != firstLargest){

                secondLargest = item;


            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {124,45,140,12,8,144,123};
        System.out.println("Second largest number " + secondLargestUnoptimized(arr));
        System.out.println("Second largest number " + secondLargestOptimized(arr));

    }

    private static int secondLargestOptimized(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : arr){
            if (element > firstLargest){
                secondLargest = firstLargest;
                firstLargest = element;
            } else if (element < firstLargest && element > secondLargest) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }
}
