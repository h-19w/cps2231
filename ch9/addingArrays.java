package ch9;

public class addingArrays {
    public static void main(String[]args){
        int A1[]; //single array
        String[] A2;
        A1 = new int[5]; //allocating an array w the keyword new
        A2 = new String[2];

        int[] A3[]; //multiarray
        A3 = new int[2][]; //if only one index then only the first.
        A3 = new int[2][3];

        int arr[] = {33, 3, 4, 5}; //printing the elements of an arry using a for loop
        for(int i :arr){
            System.out.println(i);
        }
        int arr1[];


    }
}
