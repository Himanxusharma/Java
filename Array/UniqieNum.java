package Array;

public class UniqieNum {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = arr[i];
        }

        System.out.print("Array you entered :  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.print("\nUnique or Non repeating element in the array  :  ");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.print(fr[i] + "    ");
        }
    }
}
