package Task_4;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int t;
        System.out.println("Input current temperature ");
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        if (t >= -5) {
            System.out.println("Warm");
        } else if ((t <= -5) && (t > -20)) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
