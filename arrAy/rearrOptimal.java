import java.util.ArrayList;
import java.util.Arrays;

public class rearrOptimal {
    public static int[] reArrange(int nums[]){
        int n=nums.length;
        int result[]=new int[n];

        int posIndex=0;
        int negIndex=1;

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                result[negIndex]=nums[i];
                negIndex+=2;
            }else{
                result[posIndex]=nums[i];
                posIndex+=2;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int[] input = {3, 1, -2, -5, 2, -4};
        int[] output = reArrange(input);

        System.out.println("Rearranged Array: " + Arrays.toString(output));
    }
}
