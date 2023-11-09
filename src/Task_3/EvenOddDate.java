package Task_3;

import java.util.Scanner;

public class EvenOddDate {
    public static void main(String[] args) {
        int num; // declaration veriable
        System.out.println("Input number please");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num%2==0) {
            System.out.println("Meaning is EVEN");
        }else
            System.out.println("Meaning is ODD");
    }
}
