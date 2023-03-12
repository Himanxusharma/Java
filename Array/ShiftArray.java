
public class ShiftArray {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 5, 0, 89, 74, 5, 1, 5, 2, 1, 22 };
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = arr.length-1; i > 0 ; i--) {
                arr[i] = arr[i-1];
        }

        arr[0] = temp;
        System.out.print("After array shifted by one space  :   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
                }

    }

}
