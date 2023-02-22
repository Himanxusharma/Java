package Misc;

// Bonus Question:
// You have an array with N elements. Initially, each element value is 0 in array. You can perform the following operations:
// 1. Increment operation - choose an element of an array & increment the value by one.
// 2. Doubling operation - choose an element of an array and double it's value.
// You are given an int[] desired array containing N elements. Compute & return the smallest possible number of operations needed to change the array from all zeros to desired array.
// Sample Test case:
// Input: {2,1}
// Output: 3
// Explaination: Apply increment operation to elements in array & then increment operation to first element once. Total number of operations is 2+1 =3 
public class BonusQuestion {
    static void solve(int[] arr, int[] countArr) {  

        for (int i = 0; i < arr.length; i++) {

            int n = arr[i];
            int count = 0;

            while (n > 0) {

                if (n != 1 && n != 2 && n != 3 && n != 0 ) { //n>4

                    if (n % 2 == 0) {
                        count++;
                        n /= 2;
                    }
                    
                    else {
                        n = n - 1;
                        count++;
                    }

                } 
                
                else if (n == 1) {
                    n = n - 1;
                    count += 1;
                } 
                
                else if (n == 2) {
                    n = n - 2;
                    count += 2;
                } 
                
                else if (n == 3) {
                    n = n - 3;
                    count += 3;
                }

                // if(n<4)
                // {
                //     count = count+n;
                //     n=0;
                // }

            }

            if (n < 0) {
                count += Math.abs(n);
                n=0;
            }

            if (n == 0) {
                System.out.println("count for index  "+i+" : " + count);
                //countArr[i] = count;
            }

        }

        // for (int i = 0; i < countArr.length; i++) {
        //     System.out.println("The Steps : " + arr[i]);
        // }

    }

    public static void main(String[] args) {
        int desiredArray[] = { 4, 23, 0, 28, 1, 3, 16, -8 ,-89};
        int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0 ,0};
        solve(desiredArray, arr);
    }

}
