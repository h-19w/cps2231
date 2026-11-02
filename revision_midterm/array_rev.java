package revision_midterm;
import java.util.Arrays;
public class array_rev {
    public static void main(String[]args){
        int [] a = {1, 2, 5, 7, 9, 2, 4, 6, 8, 1, 0};
        System.out.println("the odd numbers in the array are "+ Arrays.toString(odd_num(a)));
        System.out.println("the even numbers in the array are "+ Arrays.toString(even_num(a)));
        System.out.println("maximum is: "+ max(a));
        System.out.println("minimum is: "+ min(a));
        System.out.println("average is: "+ avg(a));
    }
    public static int[] odd_num(int[]a){
       int index = 0;
        for (int i = 0;i<a.length;i++){
            if(a[i] % 2 != 0){
                index++;
            }
        }
        int[] oddnum = new int[index];
        int pos = 0;
        for (int i = 0;i<a.length;i++){
            if(a[i] % 2 != 0){
                oddnum[pos++] = a[i];
            }
        }
        return oddnum;
    }
    public static int[] even_num(int[]a){
        int index = 0;
        for (int i = 0;i<a.length;i++){
            if(a[i] % 2 == 0){
                index++;
            }
        }
        int[] evennum = new int[index];
        int pos = 0;
        for (int i = 0; i<a.length;i++){
            if(a[i] % 2 == 0){
                evennum[pos++] = a[i];
            }
        }
        return evennum;
    }
    public static int max(int[]a){
        int max = 0;
        for (int i = 0;i<a.length;i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int[]a){
        int min = 10;
        for (int i = 0;i<a.length;i++){
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public static double avg(int[]a){
        int tot = 0;
        for (int i = 0;i<a.length;i++){
            tot += a[i];
        }
        double avg = ( (double) tot / a.length);
        return avg;
    }
}
