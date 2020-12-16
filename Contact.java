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
public class Contact extends MyDate
{
    private String firstName;
    private String lastName;
    private String homePhone;
    private String workPhone;
    private String homeAddress;
    private String email;
    private MyDate birthday;
    private String notes;

    public Contact(){
        firstName="";
        lastName="";
        homePhone="";
        workPhone="";
        homeAddress="";
        email="";
        notes="";                      
    }
    public Contact(String fName,String lName,String hPhone,String wPhone,String hAddress,String email,MyDate bday,String notes){
        this.firstName = fName;
        this.lastName = lName;
        this.homePhone = hPhone;
        this.workPhone = wPhone;
        this.homeAddress = hAddress;
        this.email = email;
        this.birthday = bday;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }
    
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public String toString(){
        String s;
        s = "firstName: "+firstName+ 
            "\nlastName: "+lastName+
            "\nhomePhone: "+homePhone+
            "\nworkPhone: "+workPhone+
            "\nhomeAddress: "+homeAddress+
            "\nemail: "+email+
            "\nbirthday: "+birthday+
            "\nnotes: "+notes;     
        return s;
    }   
}