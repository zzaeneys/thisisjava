package ch04.verify;

public class Num4 {
    public static void main(String[] args) {
        while(true) {
            int num1 = (int)(Math.random()*6 + 1);
            int num2 = (int)(Math.random()*6 + 1);
            int hap = num1 + num2;
            System.out.println("(" + num1 + ", " + num2 + ")");
            if(hap != 5) {
                continue;
            } else {
                break;
            }
        }
    }

}
