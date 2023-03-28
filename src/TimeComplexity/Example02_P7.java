package TimeComplexity;

public class Example02_P7 {

    public static void findPairs(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int targetSum = 10;

        long startTime = System.currentTimeMillis();
        findPairs(arr, targetSum);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}
