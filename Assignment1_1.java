
public class Assignment1_1 {
    public static void main(String[]args){
         int[] a = {1, 4, 7, 5, 8, 0, 4, 6, 2};
         int[] a2= {1 ,1, 1, 3, 1, 5};
         int[] oddnum = odd(a);
         int[] evnnum = even(a);
         int [] concat = concate(a, a2);


         System.out.println("an array from the original array showing only the odd numbers ");
         printarray(oddnum);
         System.out.println("an array from the original array showing only the even numbers ");
         printarray(evnnum);
         System.out.println("two concatenated arrays ");
         printarray(concat);
         System.out.println("max of a3: " + max(concat));
         System.out.println("min of a3: " + min(concat));


    }
    public static int[] odd(int[]a){ //a) odd numbers
        int oddnumcount = 0;

        for (int i = 0;i<a.length; i++){
            if(a[i] % 2 !=0){
                oddnumcount++;
            }
        }
        int[] oddnum_a = new int [oddnumcount];
        int index = 0;
        for (int i = 0;i<a.length; i++){
            if(a[i] % 2 !=0){
                oddnum_a[index++] = a[i];
            }
        }

        return oddnum_a;
    }

    public static int[] even(int[]a){  //b) even numbers
        int evnnumcount = 0;

        for (int i = 0;i<a.length; i++){
            if(a[i] % 2 ==0){
                evnnumcount++;
            }
        }
        int[] evnnum_a = new int [evnnumcount];
        int index = 0;
        for (int i = 0;i<a.length; i++){
            if(a[i] % 2 ==0){
                evnnum_a[index++] = a[i];
            }
        }
        return evnnum_a;
    }

    public static int[] getconcat(int[]a, int[] a2){  //c) concate 2 arrays
        int length1 = a.length;
        int length2 = a2.length;
        int[] result = new int[length1 + length2];

        System.arraycopy(a, 0, result, 0, length1);
        System.arraycopy(a2, 0, result, length1, length2);

        return result;
    }
    public static int[] concate(int[]a, int[] a2){ //c) concate 2 arrays
        int[] a3 = getconcat(a,a2);
        return a3;
    }

    public static int min(int[] a3){
        int mi = 10;
        for (int i = 0; i< a3.length; i++){
            if (mi >= a3[i]){
                mi = a3[i];
            }
        }
        return mi;
    }
    public static int max(int[] a3){
        int m = 0;
        for (int i = 0; i< a3.length; i++){
            if (m <= a3[i]){
                m = a3[i];
            }
        }
        return m;
    }

    public static void printarray(int[] array){
        for (int num : array) {
        System.out.print(num + " ");
        }
        System.out.println();
    }
}

