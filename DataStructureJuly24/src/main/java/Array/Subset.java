package Array;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        getSubSet(arr);
    }

    public static void getSubSet(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int k = 0;
        for(int i=0;i<n;i++){
            List<Integer> t1 = new ArrayList<>();
            t1.add(arr[i]);
            result.add(t1);
            k=0;
            while(k<n-1){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                for(int j=i+k+1;j<n;j++){
                    temp.add(arr[j]);
                    result.add(new ArrayList<>(temp));
                }
                k++;
            }
        }
        printList(result);
    }

    public static void printList(List<List<Integer>> arr){
        for(List<Integer> input : arr){
            for(Integer e : input){
                System.out.print(e+",");
            }
            System.out.println();
            System.out.println("===========");
        }
    }
}
