package by.itstep.vlad.utill;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);


    public static String inputString(String prompt) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        String input = scanner.nextLine();

        return input;
    }

    public static int inputNumber(String prompt) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        int number = scanner.nextInt();

        return number;

    }
}
