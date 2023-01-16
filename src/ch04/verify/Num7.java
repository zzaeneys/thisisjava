package ch04.verify;

import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        int balance = 0;

        while(true) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.print("선택> ");

            Scanner scanner = new Scanner(System.in);

            int selectNum = scanner.nextInt();

            switch (selectNum) {
                case 1 :
                    System.out.print("예금액>");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    break;

                case 2 :
                    System.out.print("출금액>");
                    int withdraw = scanner.nextInt();
                    balance -= withdraw;
                    break;

                case 3 :
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;

                case 4 :
                    System.out.println();
                    System.out.println("프로그램 종료");
                    System.exit(0);
                }
            }
        }
    }

