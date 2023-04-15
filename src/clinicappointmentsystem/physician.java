//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;


public class physician extends HealthCarePratitioner {
    private String Spetiality;
    
    physician(){
        
    }

    public physician(String name, String nationality, int year, int month, int day, char gender, String phone, String address, boolean onleave,String Spetiality) {
        super(name, nationality, year, month, day, gender, phone, address, onleave);
        this.Spetiality = Spetiality;
    }


     

    public String getSpetiality() {
        return Spetiality;
    }

    public void setSpetiality(String Spetiality) {
        this.Spetiality = Spetiality;
    }
        
    
}
