
//Write a Java program to perform the following using an array:
//a) Check if all elements in the array are numbers or not.
//b) If it is a numeric array, then count the number of odd values in it.
//c) If the array contains all Strings, then display the largest String in the array.
//d) Display the array in reverse form.
//e) Find a specified element in an array.

public class Assignment1_2 {

    public static void main(String[] args) {
        Object[] a = {0, 1, 3, 8};

        boolean allNum = areAllNumbers(a);
        if (allNum){ //if allNum = true
            System.out.println("All elements are numbers.");
            int[] numArray = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                numArray[i] = (int) a[i];
            }
            System.out.println("Number of odd values in the array: " + countOddValues(numArray));

            System.out.print("Reversed array: ");
            displayIntReverseArray(numArray);

            System.out.print("Finding a specified element in the array: ");
            elementRes(findNumElementIndex(numArray, 5), 5);
        }
        else {
            System.out.println("Not all elements are numbers.");
            String[] strArray = new String[a.length];
            for (int i = 0; i < a.length; i++) {
                strArray[i] = (String) a[i];
            }
            System.out.println("Largest string in the array: " + findLargestString(strArray));

            System.out.print("Reversed array: ");
            displayStringReverseArray(strArray);

            System.out.print("Finding a specified element in the array: ");
            elementRes(findStrElementIndex(strArray,"hi"), "hi");
        }
    }
    public static boolean areAllNumbers(Object[] arr) {
        for (Object obj : arr) {
            if (!(obj instanceof Number)) {
                return false;
            }
        }
        return true;
    }
    public static int countOddValues(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static String findLargestString(String[] arr) {
        if (arr.length == 0) {
            return null;
        }
        String largestString = arr[0];
        for (String str : arr) {
            if (str.length() > largestString.length()) {
                largestString = str;
            }
        }
        return largestString;
    }
    public static void displayIntReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void displayStringReverseArray(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static int findNumElementIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==(element)) {
                return i;
            }
        }
        return -1; // Element not found
    }
    public static int findStrElementIndex(String[] arr, String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1; // Element not found
    }
    public static void elementRes(int i, Object element){
        int index = i;
        if (index != -1) {
            System.out.println("Element '" + element + "' found at index: " + index +
                    " in the array.");
        } else {
            System.out.println("Element '" + element + "' not found in the array.");
        }
    }
}







