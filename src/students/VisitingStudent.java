
import javax.swing.JOptionPane;

public class VisitingStudent extends Student
{

    private String nativeLanguage;
    private String country;
    
    public VisitingStudent()
    {
        super();
    }
    public VisitingStudent(String firstName, String lastName, String SID, String language, String country )
    {
        super(firstName, lastName, SID);
        this.nativeLanguage = language;
        this.lastName = lastName;
       
    }
    
    
    public String toString() 
    {
        return "Name: " + firstName + " " + lastName +
               " SID: " + SID + " First language: " + nativeLanguage +
               " Country: ";
    }
    
    public String getLanguage() 
    {
        return nativeLanguage;
    }
    
    public String getCountry() 
    {
        return country;
    }
        }
    
    
}


