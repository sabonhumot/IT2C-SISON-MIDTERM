package it2c.sison.midterm;

import java.util.Scanner;

public class IT2CSISONMIDTERM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String action;

        do {
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();

            Implementation imp = new Implementation();
            switch (choice) {
                case 1:
                    imp.addInstructor();
                    break;

                case 2:
                    imp.viewInstructors();
                    break;

                case 3:
                    imp.viewInstructors();
                    imp.updateInstructor();
                    imp.viewInstructors();
                    break;
                case 4:
                    imp.viewInstructors();
                    imp.deleteInstructor();
                    imp.viewInstructors();
                    break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            action = input.nextLine();

        } while (action.equalsIgnoreCase("yes"));
        System.out.println("Thank You!");
    }

}
