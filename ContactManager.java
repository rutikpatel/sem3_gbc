/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Rutik Patel-101235165
// Harsh Patel-101243993
// Prishita Ribadia-101284685
package assignment2javafx;
/**
 *
 * @author rutikpatel
 */
public class ContactManager {
    
    protected int maxContacts;
    protected int numContacts;

    public int getNumContacts() {
        return numContacts;
    }
    protected Contact[] contactList;
    
    public ContactManager()
    {
        contactList = new Contact[maxContacts];
    }
    public ContactManager(int maxContacts)
    {
        this.maxContacts = maxContacts;
        this.numContacts = 0;
    }
    
    public boolean addContact(String fName,String lName,String hPhone,String wPhone,String hAddress,String email,MyDate bday,String notes)
    {
        if(numContacts < maxContacts)
        {
            Contact temp = new Contact(fName,lName,hPhone,wPhone,hAddress,email, bday,notes);
            contactList[numContacts] = temp;
            numContacts++;
            System.out.println("Contact added successfully");
            return true;
        }
        return false;
    }
    private int findContact(String homePhone)
    {
        for(int x = 0; x < numContacts; x++)
        {
            if(contactList[x].getHomePhone() == homePhone)
                return x;
        }
        return -1;
    }
    public String findContact(String fname, String lName)
    {
        String s="Contact List: ";
        for(int x = 0; x< numContacts;x++)
        {
            if(contactList[x].getFirstName()==fname && contactList[x].getLastName()==lName)
            {
               s += "\n" + contactList[x].getFirstName()+
                    "\n" + contactList[x].getLastName()+
                    "\n" + contactList[x].getHomePhone()+
                    "\n" + contactList[x].getWorkPhone()+
                    "\n" + contactList[x].getEmail()+
                    "\n" + contactList[x].getBirthday()+
                    "\n" + contactList[x].getNotes();
            }
            
            else
            {
                s = "string not found";
            }
        }
        return s;
    }
    public String lookContact(String homePhone)
    {
        String i = "";
        for(int x = 0; x < numContacts; x++)
        {
            if(contactList[x].getHomePhone() == homePhone)
            i = contactList[x].getHomePhone();
            else
            {
                i = "Contact Not Found" ;
            }
        }
        return i;
    }
    
    public boolean editContact(String fName,String lName,String hPhone,String wPhone,String hAddress,String email,int day,int month,int year,String notes)
    {
        int loc = findContact(hPhone);
        if(loc == -1){System.out.println("Contact not found");return false;}
        else
        {
            contactList[loc].setFirstName(fName);
            contactList[loc].setLastName(lName);
            contactList[loc].setHomePhone(hPhone);
            contactList[loc].setWorkPhone(wPhone);
            contactList[loc].setHomeAddress(hAddress);
            contactList[loc].setEmail(email);
            contactList[loc].setDay(day);
            contactList[loc].setMonth(month);
            contactList[loc].setYear(year);
            contactList[loc].setNotes(notes);
            
        }
        return true;
    }
    
    public boolean deleteContact(String homePhone)
    {
        int loc = findContact(homePhone);
        if(loc == -1){return false;}
        contactList[loc] = contactList[numContacts - 1];
        numContacts--;
        return true;
    }
    
    public String getContactList()
    {
        String s = "Contact List:";
        for(int x = 0; x< numContacts;x++)
        {
            s += "\n" + contactList[x].getFirstName()+
                    "\n" + contactList[x].getLastName()+
                    "\n" + contactList[x].getHomePhone()+
                    "\n" + contactList[x].getWorkPhone()+
                    "\n" + contactList[x].getEmail()+
                    "\n" + contactList[x].getBirthday()+
                    "\n" + contactList[x].getNotes();
        }
        return s;
    }
}