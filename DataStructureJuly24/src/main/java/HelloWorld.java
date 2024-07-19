import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello World");
        System.out.print(findMinArray(new int[]{2,1,5,6,7,1,9,8,9,1}));
        //System.out.print(solve("AzZGBauYuTknYjjWEEbLvqMQwnoSgXKBdHKEVpeoxYNNtBfrxQrPauttMzjKFayKwMeuChjzCocgAHfAmPCatOqarzLuabyTnxoheeocVshfERNssVPfRyPmwvOVGbzNAuvryYNWwIeyZLMlLbkcFFJRHjEIgIwOThRJJFpLbunVrbhAYsMtdsKslLAGElwrZjvZweIytMpPEYVmktQeNleNROcTjrNxXeHvOMMTMfqZHTUjetojHFzZwOekfAILYISANxeJFRNgeZDKoOTddXqxduPIjGXsRSSkgIqKMeSqlQwAKtdrkvHLgmKleNAPEztGMPmZzUuCImLAhzUnXmsVzFvJUTeIKleuRnMPNAPWJYAZLXgzTBPmkXVShbBSlIAJSeFgvRFvcoqfVFgHUefxUxuYFCfUxbxlOslUhYRFXKmMmqDIQhhfXyGqUwGMSYeLLpEsKAhvFUzavDCOUgtmmNMnsvfmCdPWuWIjuUfZCBTrWnaDopbqXcjzSqRMpQWIBNnMcOQZjDkjPkxsuwENYQyjgSHFJrgSLnwbEInBfdeIfBbVuZZbBrblJgKHOmLZACLQkSRxxQJeUMPIQutraxFtrRcSeqAejOTSqaFGglQOoWPkcNOnLIgfclWNtjGQRVMlqCPUnUlOLbHfkzUyNAmTsswWtZjIGUBrLmRmstHgVcRUgWdQTCEPRzjPVTMJRJocYHftwoRzOSyQexjmceRHdqFdgNuGmGTUdXQaNwKmvOUzZPzGCBVcbVLgMoQrESbpVGteVVntOwEWxXsZnSAoIfBSsWVhDFBuDTkcrnsPdmmSHymouxHlcgtjgKUAPznxsIRUjDFsrjadJjEtPaWTVBHpatqYeSgrpWJDOGfgIGQPcTIXVsCVyCfKMpcXWGkvwuRuTmvCbNMLeUkZrEpYZdlKAgFELfwCCbZCYBcXhfUrsIHfdwhYyxHKAMYMERwlyRtxObDoxBhjXmynYkmkYZrkzlCuvrhW"));
    }

    public static int solve(String A) {
        int size = A.length();
        int result = 0;
        char[] vowel = new char[]{'a','e','i','o','u'};
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        char[] input = A.toCharArray();
        for(int i =0; i<input.length; i++){
            if(vowels.contains(Character.toLowerCase(input[i]))){
                result += (size-i);
                result = result % 1003;
            }
        }
        return result;
    }

    /**
     * You are given an integer array A.
     *
     * Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
     *
     * Return "YES" if it is possible; otherwise, return "NO" (without quotes).
     * @param A
     * @return
     */
    public static String solve(int[] A){
        int size = A.length;
        if(A[0]%2 ==0 && A[size-1]%2 == 0 && size%2 == 0){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    /**
     * given an array of length N, find the lenght of the smallest subarray
     * which contains both min amd max element
     */

    public static int findMinArray(int[] input){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = -1;
        int max_index = -1;
        int size = input.length;
        int i = 0;
        int result = size;
        while(i<size){
            min = input[i]<min ? input[i] : min;
            max = input[i]>max ? input[i] : max;
            //System.out.println("MIN :" +min+" max : "+max);
            i++;
        }
        i=0;
        while(i<size){

            if(input[i] == min) min_index = i;
            if(input[i] == max) max_index = i;
            if(min_index != -1 && max_index != -1 && result > Math.abs(max_index - min_index + 1)){
                result = Math.abs(max_index - min_index )+1;
            }
           System.out.println("MIN_INDEX"+min_index+" max_index "+max_index+" result "+result);
            i++;
        }
        return result;


    }
}
