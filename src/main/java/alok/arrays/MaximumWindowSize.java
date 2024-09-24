package alok.arrays;

public class MaximumWindowSize {
    public static void main(String[] args) {
        int arr[] = {2,14,-1,9,5};
        int windowSize = 4;
        System.out.println("Max window: " +  maximumSize(arr,windowSize));
        System.out.println("maximumSizeOptimised " + maximumSizeOptimised(arr,windowSize));
    }

    private static int maximumSize(int[] arr,int windowSize) {
        int maxSumGlobal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - windowSize + 1; i++) {
            int maxLocal = 0;
            for (int j = 0; j < windowSize; j++) {
                maxLocal += arr[j + i];
            }
            System.out.println("Local max window: "+ maxLocal);
            if(maxLocal > maxSumGlobal){
                maxSumGlobal = maxLocal;
            }
        }

        return maxSumGlobal;
    }

    private static int maximumSizeOptimised(int[] arr,int windowSize) {
        int maxSum = 0;
        for (int i = 0; i < windowSize; i++) {
            maxSum += arr[i];
        }

        int localMax  = maxSum;

        for (int i = windowSize; i < arr.length; i++) {
            localMax = localMax + arr[windowSize] - arr[i - windowSize];
            if(localMax > maxSum){
                maxSum = localMax;
            }
        }

        return maxSum;
    }
}
