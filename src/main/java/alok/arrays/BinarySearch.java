package alok.arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr,3,0,arr.length - 1));
    }

    private static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

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

    private static int binarySearch(int[] arr, int x, int left, int right) {
        if (left <= right) {
            int mid = (left) + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                right = mid - 1;
                return binarySearch(arr, x, left, right);
            } else {
                left = mid + 1;
                return binarySearch(arr, x, left, right);
            }
        }
        return -1;
    }
}
