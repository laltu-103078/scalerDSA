package Array;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        Set<List<Integer>> st = new HashSet<>();
        st.add(Arrays.asList(2,3,4));
        st.add(Arrays.asList(2,3,4));
        st.add(Arrays.asList(2,3,4));
        System.out.println(st.size());

        List<List<Integer>> result = threeSum(new int[]{-1,0,1,2,-1,-4});

    }


    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n-1;i++){
            st = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int ts = 0-nums[i]+nums[j];
                if(st.contains(ts)){
                    int[] arr = {nums[i],nums[j],ts};
                    //Arrays.sort(arr);
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[0]);
                    temp.add(arr[1]);
                    temp.add(arr[2]);
                    result.add(temp);
                }
                st.add(nums[j]);
            }

        }
        return List.copyOf(result);
    }
}
