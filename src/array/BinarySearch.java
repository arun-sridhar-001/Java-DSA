package array;

import java.util.Scanner;

public class BinarySearch {


    /**
     * Big O(log n)
     * It will work only if the Array is Sorted.
     * @param target
     * @return
     */
    public static boolean binarySearch(int target) {
        int[] input = {1,3,5,7,9,11,15,17};

        int low = 0;
        int high = input.length-1;

        while(low <= high) {
            int mid = (low+high)/2;   // 3  : Divide & conquer

            if(target == input[mid]) {
                return true;
            }

            else if(target < input[mid]) {
                high = mid-1;
            }

            else {
                low = mid+1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.print("Enter the Target: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        boolean isFound = binarySearch(target);
        long endTime = System.currentTimeMillis();
        System.out.println(startTime - endTime);
        if(isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
