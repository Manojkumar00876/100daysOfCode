package SlidingWindow;
import java.util.*;
public class LongSubarrayWithKFrequency {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,1,2};
        int k = 4;
       maxSubarrayLength(nums, k);
    }

    public static int maxSubarrayLength(int[] nums, int k) {
    // sliding qindow
        int l=0;
        HashMap <Integer,Integer> map = new HashMap<>();
        int result=-1;
        for(int i=0; i<nums.length; i++) {

            int num = nums[i];

            map.put(num , map.getOrDefault(num,0)+1);

            while(map.get(num) > k && l<=i) {
                map.put(nums[l] , map.get(nums[l])-1);
                l++;
            }
            result=Math.max(result,i-l+1);

        }
        return result;
    }
}
