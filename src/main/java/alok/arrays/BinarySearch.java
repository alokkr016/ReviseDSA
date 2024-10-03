package alok.arrays;

public class BinarySearch {

    public static int binarySearchIterative(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int arr[], int x) {
        return binarySearchRecursive(arr, x, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int x, int left, int right) {
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] < x) {
            left = mid + 1;
            return binarySearchRecursive(arr, x, left, right);
        } else if (arr[mid] == x) {
            return mid;
        } else {
            right = mid - 1;
            return binarySearchRecursive(arr, x, left, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearchRecursive(arr, 9));
    }
}
