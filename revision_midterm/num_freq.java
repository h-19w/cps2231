package revision_midterm;
public class num_freq {
    public static void main(String[] args) {
    int[] a = {2, 3, 3, 2 ,7, 2, 2};
    int mostFrequentNumber = mostFrequent(a);
    System.out.println("The most frequent number is: " + mostFrequentNumber);
}

    public static int mostFrequent(int[] a) {
        int maxElement = 1;

        for (int num : a) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        if (maxElement < 0) {
            maxElement = 0;
        }
        int[] count = new int[maxElement + 1];

        for (int num : a) { //frequency of each element
            count[num]++;
        }

        int mostFrequentNumber = -1;
        int maxFrequency = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxFrequency) {
                maxFrequency = count[i];
                mostFrequentNumber = i;
            }
        }

        return mostFrequentNumber;
    }

}
