package BitManupulation;

public class SingleNumber2 {

    public static void main(String[] args) {
        int res = singleNumber(new int[]{2,2,2,3,4,4,4});
        System.out.println("res = "+res);
    }

    public static int singleNumber(final int[] A) {
        int res=0;
        int n = A.length;
        int setBitCount = 0;
        for(int i=0;i<32;i++){
            setBitCount = 0;
            for(int j=0;j<n;j++){
                if((1<<i & A[j]) > 0){
                    setBitCount++;
                }
            }
            if(setBitCount % 3 != 0){
                res = res | 1<<i;
            }
        }
        return res;
    }
}
