package Hashpractica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DB implements Methods{
    private ArrayList<Contact>contacts = new ArrayList<>();
    private HashMap<String, String>hashMap = new HashMap<>();

    @Override
    public void addNewContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public ArrayList<Contact> displayAllContacts() {
        return contacts;
    }

    @Override
    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }



    public void arrayToHashMap(ArrayList<Contact> contacts) {
        for (Contact contact : contacts) {
            hashMap.put(contact.getName(), contact.getPhoneNumber());
        }

    }
    @Override
    public Contact searchByName(String name) {
        Contact contact1 = null;
        for (Contact contact : contacts) {
            hashMap.put(contact.getName(), contact.getPhoneNumber());
            if (contact.getName().equals(name)){
                contact1=contact;
            }
        }
        return contact1;

    }

//


    @Override
    public Contact updateContact(String key, String phoneNumber) {


            hashMap.put(key, phoneNumber);

        Contact contact1 = null;
        for (Contact contact:contacts){
            if (contact.getName().equals(key)){
                contact.setPhoneNumber(phoneNumber);
                contact1 = contact;
            }
        }
        contacts.add(contact1);
        return contact1;
    }

    @Override
    public String numberLookup(String key) {

        String phone = hashMap.get(key);
        return phone;
    }



    @Override
    public ArrayList<String> namesFromEmail(ArrayList<Contact> contacts) {
        ArrayList<String>domains = new ArrayList<>();
        String domain= "";
        for (Contact contact : contacts){
            String email;
            email = contact.getEmail();
            int i = email.indexOf("@");
            domain = email.substring(0,i);
            domains.add(domain);
        }
        return domains;
    }

    @Override
    public HashSet<String> displaysDomain(ArrayList<String> domais) {
        HashSet<String> set = new HashSet<>();
        for (String dd:namesFromEmail(contacts)){
            set.add(dd);
        }
        return set;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }
}


