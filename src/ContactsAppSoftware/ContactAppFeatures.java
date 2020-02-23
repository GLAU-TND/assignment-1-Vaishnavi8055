package ContactsAppSoftware;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactAppFeatures implements Interface2 {
   Scanner sc=new Scanner(System.in);
   RegexFeature regexFeature=new RegexFeature();

   ArrayList<Person> myContactBook=new ArrayList<>();

   @Override
   public void addNewContact() {
      ArrayList<String> ContactNumbers = new ArrayList<>();
      String firstName = "";
      String lastName = "";
      String emailAddress = "";
      String phoneNumber = "";
      System.out.println("Please enter the name of the Person");
      System.out.println("Enter first Name: ");
      firstName = sc.next();

      if (regexFeature.isFirstName(firstName)) {
         System.out.println("Enter Last Name: ");
         lastName = sc.next();
         if (regexFeature.isLastName(lastName)) {
            char reply;
            do {
               System.out.println("Enter your phone Number");
               phoneNumber = sc.next();
               if (regexFeature.isphoneNumber(phoneNumber)) {
                  ContactNumbers.add(phoneNumber);
               } else {
                  System.out.println("..Syntax Error!..");
                  break;
               }
               System.out.println("Would you like to add another contact number? (y/n): ");
               reply = sc.next().toLowerCase().charAt(0);
            }
            while (reply == 'y');
            System.out.println("Would you like to add email address? (y/n): ");
            char reply1 = sc.next().toLowerCase().charAt(0);
            if (reply1 == 'y') {
               System.out.println("Enter Your EmailAddress");
               emailAddress = sc.next();
            }

         }
      }
   }
   @Override
   public void viewAllContact() {

   }

   @Override
   public void searchForContact() {

   }

   @Override
   public void exitContactApp() {

   }

}
