public class LargestSmallestTwo {
    public static void main(String[] args) {
        int[] arr = {10, 5, 90, 25, 60, 3};

        // Sort array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Smallest 1 = " + arr[0]);
        System.out.println("Smallest 2 = " + arr[1]);

        System.out.println("Largest 1 = " + arr[arr.length - 1]);
        System.out.println("Largest 2 = " + arr[arr.length - 2]);
    }
}