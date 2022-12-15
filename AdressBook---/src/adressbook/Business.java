/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adressbook  ;

/**
 *
 * @author ansam
 */
public class Business extends ContactInformation {
    String title, genre,website;
    Person contactPerson;
   

    
    public Business(String title, String genre, String website, Person contactPerson, String country, String city, String postalCode, String email, int telephoneNo) {
        super(country, city, postalCode, email, telephoneNo);
        this.title = title;
        this.genre = genre;
        this.website = website;
        this.contactPerson = contactPerson;
        pageNumber ++ ; 
        
    }
    
    
        
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
 
    }
    

    @Override
    public String getInfo(){
    return "Business" + super.getInfo() + "Title:" + title + "Genre:" + genre + "Contact person:" + contactPerson.getInfo() + "Website:" + website ;
    }
    
    
}
