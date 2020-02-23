package ContactsAppSoftware;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n....Welcome to Vaishnavi's Contact List App:.... ");
        boolean cases=true;
        ContactAppFeatures contactAppFeatures=new ContactAppFeatures();

        do {
            System.out.println("\n" + "Press 1 to add a new contact ");
            System.out.println("Press 2 to view all contacts ");
            System.out.println("Press 3 to search for a contact ");
            System.out.println("Press 4 to delete a contact ");
            System.out.println("Press 5 to exit program \n");

            System.out.println("Enter your Choice first! ");
            int yourChoice = sc.nextInt();

            switch (yourChoice) {
                case 1:
                    System.out.println("You have chosen to add a new contact: ");
                    contactAppFeatures.addNewContact();
                    break;
                case 2:
                    System.out.println("You have chosen to view all contacts:");
                    contactAppFeatures.viewAllContact();
                    break;
                case 3:
                    System.out.println("You have chosen to search any contact:");
                    contactAppFeatures.searchForContact();
                    break;
                case 4:
                    System.out.println("You have chosen to delete any contact:");
                    contactAppFeatures.deleteContact();
                    break;
                case 5:
                    System.out.println("You have chosen to exit:");
                    contactAppFeatures.exitContactApp();
                    System.out.println("----THANKU VISIT AGAIN :----");
                    break;
                default:
                    System.out.println("please enter your choice wisely ");
                    break;
            }
        }



        while(cases);
    }
}

