package ch6;

import java.util.Arrays;

public class sortingStrings {
    public static void main(String[]args){
        String[] nums = new String[]{"1", "10", "9"};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] letters = new String[]{"A", "AD", "B"};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
    }

}
