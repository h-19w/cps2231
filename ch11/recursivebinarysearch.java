package ch11;

public class recursivebinarysearch {
    public static int rbs(int[] list, int key){
        int low = 0;
        int high = list.length-1;
        return rbs(list, key, low, high);
    }
    private static int rbs(int[]list, int key, int low, int high){
        if(low>high){
            return -low-1;
        }
        int mid = (low+high)/2;
        if (key<list[mid]){
            return rbs(list, key, low, mid -1);
        }
        else if (key ==list[mid]){
            return mid;
        }
        else{
            return rbs(list, key, mid +1, high);
        }
    }
    public static void main(String[]args){
        int[] a = {1, 2, 3, 4, 5};
        System.out.print("index is: "+rbs(a, 9));
    }
}
