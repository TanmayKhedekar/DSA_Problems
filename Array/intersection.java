package array;

public class intersection {
    public static void inter(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        System.out.print("Intersection of arrays: ");

        for (int i = 0; i < n; i++) {
            boolean found = false;

            // Check if arr1[i] is present in arr2
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            // Check if arr1[i] already appeared earlier in arr1
            boolean already = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    already = true;
                    break;
                }
            }

            // Print if found in arr2 and not already printed
            if (found && !already) {
                System.out.print(arr1[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {3, 4, 5, 6, 7};
        inter(a, b);
    }
}
