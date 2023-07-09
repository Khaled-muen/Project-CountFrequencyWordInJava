package project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        CountFrequency countFrequency = new CountFrequency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a List of Words Separated by Whitespace : \n");
        String inputs = scanner.nextLine();
        System.out.println("***********OutPut****************\n");
        countFrequency.print(countFrequency.wordFrequency(inputs));

        do {
            System.out.println("\nDo you want to do that again Y / N ??");
            String answer = scanner.nextLine();
            if (answer.equals("y") || answer.equals("Y")) {
                System.out.println("Enter a List of Words Separated by Whitespace : \n");
                inputs = scanner.nextLine();
                System.out.println("***********OutPut****************\n");
                countFrequency.print(countFrequency.wordFrequency(inputs));
            } else {
                System.exit(0);
            }
        } while (true);

    }
}