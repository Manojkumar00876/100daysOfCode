import java.util.*;

public class SequentialDigits {

//    1291. Sequential Digits
//
//    An integer has sequential digits if and only if each digit in the
//    number is one more than the previous digit.
//    Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

//    Input: low = 100, high = 300
//    Output: [123,234]
//
//    Example 2:
//
//    Input: low = 1000, high = 13000
//    Output: [1234,2345,3456,4567,5678,6789,12345]

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=9; i++) {
            int curr = i;
            int next = i+1;

            while(curr <= high && next <=9) {
                curr = curr*10 + next;
                if(curr >= low && curr <= high) {
                    list.add(curr);
                }
                next++;
            }
        }
        Collections.sort(list);

        return list;
    }

}
