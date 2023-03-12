
public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int[] arr2 = { 1, 20, 3, 40, 50, 6, 7, 80 };

        int i = 0, j = 0;
        int m = arr1.length;
        int n = arr2.length;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }

        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");

    }
}
