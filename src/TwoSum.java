import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length-1; i++ ) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return  new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}
