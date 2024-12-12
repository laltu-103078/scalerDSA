package Stack;

/**
 * Builiding height is given calculate the max area of a histogram
 *
 * Find the largest rectangular area possible in a given histogram where
 * the largest rectangle can be made of a number of contiguous bars whose
 * heights are given in an array. For simplicity, assume that all bars have
 * the same width and the width is 1 unit.
 *
 */
public class MaxAreaInHistogram {
    public static void main(String[] args) {

    }

    public static void getMaxArea(int[] input){
        int n = input.length;
        int[] nsl = NextSmallestToRight.getNextSmallestToRight(input);
        int[] nsr = NextSmallestToRight.getNextSmallestToLeft(input);
        for(int i=0; i<n; i++){

        }

    }
}
