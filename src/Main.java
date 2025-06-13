import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 54, 3, 7, 90, 1, 77};
        int target = 91;

        int[] newArr = TwoSum.twoSum (arr, target);
        System.out.println (Arrays.toString (newArr));
    }
}