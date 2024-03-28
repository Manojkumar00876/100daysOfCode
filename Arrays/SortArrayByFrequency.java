import java.util.*;
public class SortArrayByFrequency {

//    347. Top K Frequent Elements
//    Given an integer array nums and an integer k, return the k most frequent elements.
//    You may return the answer in any order.
//    Example 1:
//
//    Input: nums = [1,1,1,2,2,3], k = 2
//    Output: [1,2]
//
//    Example 2:
//
//    Input: nums = [1], k = 1
//    Output: [1]

    public static void main(String[] args) {
       int[] nums = {1,1,1,2,2,3};
       int k = 2;

       topKFrequent(nums,k);
       for(int x : nums) System.out.print(x+" ");
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();


        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(frequencyMap.keySet());

        // Sort the list based on the frequency of numbers in descending order
        Collections.sort(list, (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Create an array and populate it with the top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
