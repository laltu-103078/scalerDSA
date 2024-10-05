package Array;

public class AddOneNumber {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int index = n-1;
        while(index >= 0 && digits[index] == 9){
            digits[index] = 0;
            index--;
        }
        if(index < 0){
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        digits[index] = digits[index] + 1;
        // remove leading 0'S
        int i = 0;
        while(digits[i]==0 && i<digits.length){
            i++;
        }

        int[] res = new int[digits.length-i];
        int j =0;
        while(i < digits.length){
            res[j++] = digits[i++];
        }
        return res;
    }
}
