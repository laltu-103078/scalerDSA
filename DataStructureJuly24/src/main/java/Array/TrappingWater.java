package Array;

/**
 * Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.
 *
 * Your task is to calculate the total amount of water that can be trapped in these valleys.
 */
public class TrappingWater {

    public static void main(String[] args) {
        
    }
    public int trap(final int[] bars) {
        if(bars.length == 2){
            return 0;
        }
        int n = bars.length;
        int water = 0;
        int[] leftmaxArr = new int[bars.length];
        leftmaxArr[0] = bars[0];
        for(int i=1; i<bars.length; i++){
            leftmaxArr[i] = bars[i]>leftmaxArr[i-1] ? bars[i] : leftmaxArr[i-1];
        }
        int rightMax = bars[bars.length - 1];
        for(int i=n-2;i>=1;i--){
            rightMax = bars[i] > rightMax ? bars[i] : rightMax;
            if(bars[i] < rightMax && bars[i] < leftmaxArr[i]){
                int minHeight = rightMax < leftmaxArr[i] ? rightMax : leftmaxArr[i];
                water += minHeight - bars[i];
            }
        }
        return water;
    }
}
