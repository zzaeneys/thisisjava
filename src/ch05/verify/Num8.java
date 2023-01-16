package ch05.verify;

public class Num8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int student = 0;
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            student += array[i].length;
            for(int k=0; k< array[i].length; k++) {
                sum += array[i][k];
            }
        }
        System.out.println("전체 합 : " + sum);
        double avg = (double) sum / student;
        System.out.println("평균 : " + avg);
    }
}
