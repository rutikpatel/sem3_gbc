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
public class Address {
    public String streetInfo1;
    public String streetInfo2;
    public String city;
    public String postalCode;
    public String province;
    public String country;
    
    public Address(){
        streetInfo1="";
        streetInfo2="";
        city="";
        postalCode="";
        province="";
        country="";
    }
    
    public Address(String SI1, String SI2, String city, String postCode, String prov, String country){
        
        this.streetInfo1=SI1;
        this.streetInfo2=SI2;
        this.city=city;
        this.postalCode=postCode;
        this.province=prov;
        this.country=country;
    }

    public String getStreetInfo1() {
        return streetInfo1;
    }

    public void setStreetInfo1(String streetInfo1) {
        this.streetInfo1 = streetInfo1;
    }

    public String getStreetInfo2() {
        return streetInfo2;
    }

    public void setStreetInfo2(String streetInfo2) {
        this.streetInfo2 = streetInfo2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public String toString(){
        String s;
        s = "StreetInfo1: "+streetInfo1+ 
            "\nStreetInfo1: "+streetInfo2+
            "\nCity: "+city+
            "\nPostal Code: "+postalCode+
            "\nProvince: "+province+
            "\nCountry: "+country;
        return s;
             
    }
     
}
