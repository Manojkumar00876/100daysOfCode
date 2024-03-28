import java.util.Arrays;

public class MergeTwoArrays {
    public static void main (String[] args){
        int[] arr1 = {1,2,3,0,0,0};
         int[] arr2 = {2,5,6};

         int j=0;

         for(int i=0; i<arr1.length; i++){
             if(arr1[i] == 0){
                 j=i;
                 break;
             }
         }
         int m = 0;
         for(int i=j; i<arr1.length; i++) {
             arr1[i] = arr2[m++];
         }
        Arrays.sort(arr1);
         for(int x : arr1) {
             System.out.print(x+" ");
         }

    }
}
