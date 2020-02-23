package ContactsAppSoftware;

import java.util.ArrayList;

public class Person {
  private String firstName;
  private String lastName;
  private String emailAddress;
  private ArrayList<String> contactNumbers;

    public Person(String firstName, String lastName, String emailAddress, ArrayList<String> contactNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contactNumbers = contactNumbers;
    }
}
