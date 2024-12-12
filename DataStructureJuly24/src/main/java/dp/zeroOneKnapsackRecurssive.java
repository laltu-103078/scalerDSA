package dp;

public class zeroOneKnapsackRecurssive {

    public static void main(String[] args) {
        int[] wt = {10,20,30,15,25};
        int[] val = {25,50,30,40,50};
        int maxWeight = 90;
        int maxValue = getKanpsackValue(wt,val,wt.length,maxWeight);
        System.out.println("Max Value = "+maxValue);
    }

    public static int getKanpsackValue(int[] wt, int[] val, int totalItem, int maxWeight){
        int result;
        // base condition
        if(totalItem == 0 || maxWeight == 0){
            return 0;
        }
        // exclude
        result = getKanpsackValue(wt, val, totalItem-1, maxWeight);
        //include
        if(wt[totalItem-1] <= maxWeight){
            int r1 = val[totalItem-1] + getKanpsackValue(wt, val, totalItem-1, maxWeight-wt[totalItem-1]);
            if(r1 > result){
                System.out.println("Item Included "+totalItem);
            }
            else{
                System.out.println("Item Excluded "+totalItem);
            }
            result = r1 > result ? r1 : result;

        }
        return result;
    }
}
