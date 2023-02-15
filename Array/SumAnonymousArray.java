package Array;

//Anonymous array is used when we use array instantly and there is no name.
public class SumAnonymousArray {
    
        public static void main(String[] args) {
            
            sum(new int[][] {{10,20,30},{20,30,40}});

        }

        static void sum(int[][] no)
        {
            int sum = 0;
            for(int ii[]:no)
            {
                for (int i:ii) {
                    sum = sum +i;
                }
                
            }

            System.out.println("Sum of array is : " + sum);
        }



}
