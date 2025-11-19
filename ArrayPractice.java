public class ArrayPractice {
    public static void main(String[] args) {

        // One-dimensional array
        int[] arr1 = {10, 20, 30, 40};
        System.out.println("Elements in one-dimensional array:");
        for (int num : arr1) {
            System.out.println(num);
        }

        // Two-dimensional array
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\nElements in two-dimensional array:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}