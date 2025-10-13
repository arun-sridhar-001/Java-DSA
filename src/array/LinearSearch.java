package array;

import java.util.Scanner;

public class LinearSearch {


    public static int linearSearch(int target) {
        int[] input = {1,3,5,7,9,11,15,17};   // O(n)

        System.out.println(input[7]);     // O(1)

        for(int i=0; i< input.length; i++) {
            if(target ==  input[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.print("Enter the Target: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        int i = linearSearch(target);
        long endTime = System.currentTimeMillis();
        System.out.println(startTime - endTime);
        if(i == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(i);
        }
    }
}
