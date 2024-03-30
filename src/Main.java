import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {17,85,93,-45,-21};
        int k = 150;
        int maxSum = solution.shortestSubarray(nums, k);
        System.out.println("Maximum subarray sum with at most distinct elements: " + maxSum);
    }
}

class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int start=0;
        int sum=0;
        int result = Integer.MAX_VALUE;
       // {17,85,93,-45,-21};
        for(int end=0; end<nums.length; end++){

            sum+=nums[end];


            while(sum>=k && start<=end) {
                if(sum>=k) {
                    System.out.println("start -->" + start);
                    System.out.println("end -->" + end);
                    result = Math.min(result , end-start+1);
                }
                System.out.println("enters while -->" + sum);
                sum-=nums[start++];
                System.out.println("after while -->" + sum);
            }


        }

        return result == Integer.MAX_VALUE ? -1 : result;

    }
}
//
//class Solution {
//    public long maximumSubarraySum(int[] nums, int k) {
//        HashSet<Integer> set = new HashSet<>();
//        int sum = 0;
//        int result = -1;
//
//        for (int i = 0, j = 0; i < nums.length; i++) {
//            sum += nums[i];
//            set.add(nums[i]);
//            if (i - j + 1 == k) {
//                if (set.size() == k) {
//                    result = Math.max(result, sum);
//                }
//                sum -= nums[j];
//                set.remove(nums[j]);
//                j++;
//            }
//        }
//
//        return result;
//    }
//}

//class Solution {
//    public long maximumSubarraySum(int[] nums, int k) {
//        HashSet<Integer> set = new HashSet<>();
//        int j = 0;
//        int sum = 0;
//        int result = -1;
//
//        for (int i = 0; i < nums.length; i++) {
//            // 1, 5, 4, 2, 9, 9, 9
//            set.add(nums[i]);
//            sum += nums[i];
//            System.out.println("s----->"+i+ " " +sum);
//            while ( set.size() > k) {
//                System.out.println(i+ "--->" +set);
//                sum = sum-nums[i];
//                set.remove(nums[j]);
//                j++;
//                System.out.println(i + "---> sum " + sum);
//
//            }
//            System.out.println("after"+ "--->" +set);
//                System.out.println(i+1 + "---> sum " + sum);
//                result = Math.max(result, sum);
////                System.out.println(i+1 + "---> result " + result);
//
//        }
//
//        return result; // return the result instead of sum
//    }
//}
//

