package ch9;

public class multidemensional_array {
    public static void main(String[]args){
        int[] a[] ={{1,4},{9,0},{5,3}};
        int[] b[] ={{5, 7},{1, 6},{2,0}};

        int[] c[] = new int[3][2];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                c[i][j] = a[i][j] * 6 ;
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


    }

}
