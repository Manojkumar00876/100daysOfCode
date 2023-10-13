public class First_Last_occurance_of_x {
    static void solve (int[] arr , int x){
        int start=-1;
        int end=-1;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == x ) {
                if (start == -1) {
                    start = i;
                } else {
                    end = i;
                }
            }
        }
            System.out.println(start +" "+ end);

    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,8,8,11,13};
        int x = 8;

       solve(arr,x);
    }
}
