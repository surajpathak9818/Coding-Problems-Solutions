public class mountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {0, 1, 2, 4, 2, 1, 0};
        System.out.println("The peak index is: " + peakIndexMountainArray(mountainArr));
    }

    public static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}