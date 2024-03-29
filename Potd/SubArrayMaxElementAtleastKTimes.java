public class SubArrayMaxElementAtleastKTimes {

//    2962. Count Subarrays Where Max Element Appears at Least K Times
//
//    You are given an integer array nums and a positive integer k.
//    Return the number of subarrays where the maximum element of nums appears at least k
//    times in that subarray.
//    A subarray is a contiguous sequence of elements within an array.
//
//
//    Input: nums = [1,3,2,3,3], k = 2
//    Output: 6
//    Explanation: The subarrays that contain the element 3 at least
//    2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
//
//    Example 2:
//
//    Input: nums = [1,4,2,1], k = 3
//    Output: 0
//    Explanation: No subarray contains the element 4 at least 3 times.

    public long countSubarrays(int[] nums, int k) {

        int l=0;
        int count=0;
        int freq=0;
        int max=-1;

        for(int x : nums) max = Math.max(max,x);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == max) freq++;
            while(freq==k ) {
                if(nums[l] == max) freq--;
                l++;
            }
            count+=l;
        }
        return count;
    }

}
