package tddClass;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int count = 1; count<= 3; count++){
            System.out.println("Enter your number");
            int grade = input.nextInt();
            switch (grade){
                case 90:
                    System.out.println("grade A");
                    break;
                case 60:
                    System.out.println("grade B");
                    break;
                case 50:
                    System.out.println("grade C");
                    break;
                default:
                    break;
            }

        }
    }
}
