package ch04.verify;

public class Num3 {
    public static void main(String[] args) {
        int sum = 0;
        int i=0;
        for(i=0; i<=100; i++) {
            if(i%3==0) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println("1부터 " + (i-1) + "까지의 정수 중에서 3의 배수의 총합: " + sum);
    }
}
