package Array;

/**
 * Given an unsorted integer array, A of size N. Find the first missing positive integer.
 *
 * Note: Your algorithm should run in O(n) time and use constant space.
 */
public class FirstMissingInteger {

    public static void main(String[] args) {
        int[] input = new int[]{1,3,4,5};
        System.out.println(getFirstMissingInteger(input));
    }

    public static int getFirstMissingInteger(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println("============");
            System.out.println("i="+i);
            System.out.println("i="+arr[i]);
            System.out.println("============");
            if( arr[i]<n && arr[i] != i+1 && arr[i] != arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                i=i-1;

            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
