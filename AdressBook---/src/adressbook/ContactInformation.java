/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adressbook  ;

/**
 *
 * @author ansam
 */
 public abstract   class ContactInformation {
    String country, city, postalCode , email ;
    int telephoneNo ; 
    
    public static int pageNumber = 0  ; 
    

    public ContactInformation(String country, String city, String postalCode, String email, int telephoneNo) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.email = email;
        this.telephoneNo = telephoneNo;
    }
    public  abstract String getTitle () ; 
   
    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }
    
    public String getInfo(){
    return "Country:" + country +" "+ "City:"+ city +" "+ "Postal Code:" + postalCode +" "+ "Telephone Number:" + telephoneNo +" "+ " E-mail:" + email +" "; 
    }
    
    
}
