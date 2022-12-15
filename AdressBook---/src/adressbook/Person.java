/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adressbook  ;

/**
 *
 * @author ansam
 */


public class Person extends ContactInformation{
    String firstName , lastName;
    BirthDate birthDate ; 

    public Person(String firstName, String lastName, BirthDate birthDate, String country, String city, String postalCode, String email, int telephoneNo) {
        super(country, city, postalCode, email, telephoneNo);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate =  new BirthDate();
        pageNumber ++ ; 
    }

    @Override
    public String getTitle() {
        return firstName + " " + lastName ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
    
    public Person(String firstName, String lastName,int d , int m , int y , String country, String city, String postalCode, String email, int telephoneNo) {
        super(country, city, postalCode, email, telephoneNo);
        this.firstName = firstName;
        this.lastName = lastName;
        birthDate =  new BirthDate(d,m,y);
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

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = new BirthDate();
    }
    @Override 
    public String getInfo(){
    return  "Person" + "Name:" + firstName + " " + lastName  + super.getInfo()  ;
    }
    
    
    
}
