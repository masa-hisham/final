/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressbook ;

/**
 *
 * @author moham
 */
public interface  Search {
    
    public boolean isFound (String title) throws SearchNotFoundException  ; 
    public int getIndexOfObject (String title) throws SearchNotFoundException ; 
    public ContactInformation getObject (String title ) throws SearchNotFoundException ; 
    
}
