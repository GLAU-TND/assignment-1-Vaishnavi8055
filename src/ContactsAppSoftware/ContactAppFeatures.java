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
