package ch3;

public class practice1_2 {
    public static void main(String[]args){
        int[] A1 = {1, 2, 5, 7, 9, 2, 4, 6, 8, 1, 0};

        System.out.println("odd numbers");
        for (int i = 0; i < A1.length; i++) {
            if (A1[i] % 2 != 0){
                System.out.println(A1[i]);
            }
        }
        System.out.println("even numbers");
        for (int i = 0; i < A1.length; i++) {
            if (A1[i] % 2 == 0){
                System.out.println(A1[i]);
            }
        }
    }

    public static class quiz2_qn2 {

        public static void main(String[]args){
            int[] a = {1, 4, 7, 5, 8, 0, 4, 6, 2};
            int min  = a[0];
            for (int i = 0;i <a.length;i++){
                if (min > a[i]){
                    min = a[i];
                }
            }
            System.out.println(min);
            int max  = a[0];
            for (int i = 0;i<a.length;i++){
                if (max < a[i]){
                max = a[i];
                }
            }
            System.out.println(max);

        }

    }
}
