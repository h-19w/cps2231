package ch9;

public class anonymousArrayToMethod {
    static void min(int arr[]){
        for(int i = 1; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        min(new int []{33, 3, 4, 5}); //unknown array passed to method
    }
}
