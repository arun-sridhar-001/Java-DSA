package array;

public class MaxSubArray {

    // Time Complexity O(N)
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; // n elements n/2 log n  ->
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i : arr){
            sum += i;  // sum = sum+i

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        for(int i : arr) {
            System.out.print(i +" ");
        }

        System.out.println(max);
    }
}
