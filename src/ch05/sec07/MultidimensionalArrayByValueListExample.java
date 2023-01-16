package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                { 80, 90, 96 },
                { 76, 88 }
        };

        System.out.println("1차원 배열 길이(반의 수): " + scores.length);
        System.out.println("2차원 배열 길이(1반 학생 수): " + scores[0].length);
        System.out.println("2차원 배열 길이(2반 학생 수): " + scores[1].length);

        //평균 구하기
        int class1Sum = 0;
        for(int i=0; i<scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("1반 평균 점수: " + class1Avg);

        //전체 학생의 평균
        int totalStudent = 0;
        int totalSum = 0;
        for(int i=0; i<scores.length; i++) {
            totalStudent += scores[i].length;
            for(int j=0; j<scores[i].length; j++) {
                totalSum += scores[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);
    }
}
