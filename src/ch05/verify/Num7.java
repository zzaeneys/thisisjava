package ch05.verify;

public class Num7 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };
        int max = 0;

        for (int i=0; i<array.length-1; i++) {
            if(array[i] > array[i+1]) {
                max = array[i];
            }
        }
        System.out.println("최댓값: " + max);
    }
}
