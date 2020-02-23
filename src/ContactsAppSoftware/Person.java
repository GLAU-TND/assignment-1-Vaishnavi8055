package ContactsAppSoftware;

import java.util.ArrayList;

public class Person implements Interface1 {
    private String FirstName;
    private String LastName;
    private String EmailAddress;
    private ArrayList<String> ContactNumbers;

    public Person(String firstName, String lastName, String emailAddress, ArrayList<String> ContactNumbers) {
        FirstName = firstName;
        LastName = lastName;
        EmailAddress = emailAddress;
        this.ContactNumbers = ContactNumbers;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public String getEmailAddress() {
        return EmailAddress;
    }

    @Override
    public ArrayList<String> getContactNumbers() {
        return ContactNumbers;
    }
}