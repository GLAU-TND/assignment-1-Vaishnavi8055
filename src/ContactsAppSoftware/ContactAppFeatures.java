package ContactsAppSoftware;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactAppFeatures implements Interface2 {
    Scanner sc = new Scanner(System.in);
    RegexFeature regexFeature = new RegexFeature();

    ArrayList<Person> myContactBook = new ArrayList<>();

    @Override
    public void addNewContact() {
        ArrayList<String> ContactNumbers = new ArrayList<>();
        String firstName = "";
        String lastName = "";
        String emailAddress = "---";
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
                } while (reply == 'y');
                System.out.println("Would you like to add email address? (y/n): ");
                char reply1 = sc.next().toLowerCase().charAt(0);
                if (reply1 == 'y') {
                    System.out.println("Enter Your EmailAddress");
                    emailAddress = sc.next();
                    if (regexFeature.isEmailAddress(emailAddress)) {
                        System.out.println("Email Address: " + emailAddress);
                    }
                }
                    else{
                        System.out.println("Email Address: " + emailAddress);
                    }
                    if (regexFeature.isFirstName(firstName) && regexFeature.isLastName(lastName) && regexFeature.isEmailAddress(emailAddress) && regexFeature.isphoneNumber(phoneNumber)) {
                        Person person = new Person(firstName, lastName, emailAddress, ContactNumbers);
                        myContactBook.add(person);
                    } else {
                        System.out.println("\n..Please Enter Correct Name , PhoneNumber , email id - Syntax Error!..");
                    }
                } else {
                    System.out.println("..Syntax Error!..");
                }
            }else {
            System.out.println("..Syntax Error!..");

        }

    }

    @Override
    public void viewAllContact() {
        if (myContactBook.size() == 0) {
            System.out.println("-------- * -------- * EMPTY - No Contacts yet *-------- * --------");
        } else {
            System.out.println("---Here are all your contacts---\n" +
                    "-------- * -------- * -------- * --------");
            for (int k = 0; k < myContactBook.size(); k++) {
                if (k != 0) {
                    System.out.println("-------- * -------- **-------- * --------");
                }
                System.out.println("FirstName :" + myContactBook.get(k).getFirstName());
                System.out.println("Last Name :" + myContactBook.get(k).getLastName());
                System.out.println("Email Address :" + myContactBook.get(k).getEmailAddress());
                System.out.println("Contacts Numbers: " + myContactBook.get(k).getContactNumbers());
                System.out.println();
            }
            System.out.println("-------- * -------- * -------- * --------");
        }
    }

    ArrayList<Integer> matched = new ArrayList<>();


    @Override
    public void searchForContact() {
int count = 0;
        if (myContactBook.size() >= 0) {
            System.out.println("You could search for a contact from their first names: ");
            String firstName = sc.next();
            for (int k = 0; k < myContactBook.size(); k++)
                if (myContactBook.get(k).getFirstName().equals(firstName)) {
                    count++;
                    matched.add(k);
                }
            System.out.println(count + " match found!");
            if (matched.size() > 0)
                for (int m = 0; m < matched.size(); m++) {

                    System.out.println("-------- * -------- * -------- * --------");
                    System.out.println("First Name: " + myContactBook.get(matched.get(m)).getFirstName());
                    System.out.println("Last Name: " + myContactBook.get(matched.get(m)).getLastName());
                    System.out.println("Contact Number(s): " + myContactBook.get(matched.get(m)).getContactNumbers());
                    System.out.println("Email Address: " + myContactBook.get(matched.get(m)).getEmailAddress());
                    System.out.println("-------- * -------- * -------- * --------");
                }
        } else{

        System.out.println("..........SORRY NO RESULTS FOUND............");
    }

}
    }

    @Override
    public void deleteContact() {
        int no = 1;
        if (myContactBook.size() > 0) {
            System.out.println("Here are all your Contacts : ");
            for (int s = 0; s < myContactBook.size(); s++) {
                System.out.println(no + ". " + myContactBook.get(s).getFirstName() + " " + myContactBook.get(s).getLastName());
                no++;
            }
            int toDelete = sc.nextInt();
            System.out.println("Press the number against the contact to delete it: " + toDelete);
            System.out.println(myContactBook.get(toDelete - 1).getFirstName() + " " + myContactBook.get(toDelete - 1).getLastName() + "'s " + "contact deleted from list!");
            myContactBook.remove(toDelete - 1);
            myContactBook.trimToSize();
            matched.trimToSize();
        } else {
            System.out.println("..........SORRY NO RESULTS FOUND............");
        }
    }


   @Override
   public void exitContactApp() {
           return;
       }
   }


