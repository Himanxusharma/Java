
public class ThirdMax {

    public static void main(String[] args) {
        int[] arr = new int[] { 44, 66, 99, 77, 33, 22, 55 };

        int max = arr[0];
        //Maximum Number in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }

        int SecMax = arr[0];
        //To find Second Maximum in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (arr[i] > SecMax) {
                    SecMax = arr[i];
                }

            }
        }

        int ThirdMax = arr[0];
        //To find the Third Maximum in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] != SecMax) {
                if (arr[i] > ThirdMax) {
                    ThirdMax = arr[i];
                }

            }
        }

        System.out.println("The third Max Element is : " + ThirdMax);

    }

}
