import java.util.*;
import java.lang.*;
/**
 * Write a description of class Captial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TechnicalAssistance extends Project
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Captial
     */
    public TechnicalAssistance(String typeOfCapital,String name, String description)
    {
        // initialise instance variables
        super(name,description);
    }
    
      
    public void hireConsultant(String consultant_id, String consultant_name)
    {
        this.consultant_id = consultant_id;
        this.consultant_name= consultant_name;
    }
    

    
}
