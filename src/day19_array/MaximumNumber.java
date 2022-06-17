package day19_array;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] num = {23, 345, 24, 435, 3, 321, 2};

        int max = num[0]; // assume that first element is the maximum number

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) { // compares the element of the array with current maximum number
                max = num[i]; // replace the current maximum number
            }
        }
        System.out.println(max);

    }
}
