package Hashpractica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public interface Methods {

    //ArrayList
     void addNewContact(Contact contact);

    ArrayList<Contact> displayAllContacts();

    void removeContact(Contact contact);

//            HashMap
//    where the
//    key
//    is the contact’s name and the
//    value
//    is their phone number.
//    Implement methods to:
//    Search for a contact by name and display the corresponding phone number.>>
//    Update the phone number for an existing contact.
//    HashMap<String, Contact> numberLookup();


    Contact searchByName(String name);
    Contact updateContact(String key,String phoneNumber);
    String numberLookup(String key);

//    3. HashSet for Unique Email Domains:
//    Use
//            HashSet
//    to store unique email domains (e.g., gmail.com, yahoo.com) from the contacts’ email addresses.

//    Implement a method that:
//    Extracts the domain names from email addresses.
//    Displays the list of unique domains.

    ArrayList<String> namesFromEmail(ArrayList<Contact>contacts);

    HashSet<String> displaysDomain(ArrayList<String> domais);
}
