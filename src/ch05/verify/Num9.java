package ch05.verify;

import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = 0;
        int score[] = new int[]{};
        int max = 0;
        int sum = 0;
        boolean run = true;

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int selNo = sc.nextInt();

            switch (selNo) {
                case 1 -> {
                    System.out.print("학생수> ");
                    student = sc.nextInt();
                    score = new int[student];
                }
                case 2 -> {
                    for(int i=0; i<score.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                        score[i] = sc.nextInt();
                    }
                }
                case 3 -> {
                    for(int i=0; i<score.length; i++) {
                        System.out.println("scores[" + i + "]: " + score[i]);
                    }
                }
                case 4 -> {
                    for(int i=0; i<score.length-1; i++) {
                        if(score[i] > score[i+1]) {
                            max = score[i];
                        }
                    }
                    System.out.println("최고 점수: " + max);
                    for(int i=0; i<score.length; i++) {
                        sum += score[i];
                    }
                    double avg = (double) sum / student;
                    System.out.println("평균 점수: " + avg);
                }
                case 5 -> {
                    System.out.println("프로그램 종료");
                    run = false;
                }
            }

        }
    }
}
