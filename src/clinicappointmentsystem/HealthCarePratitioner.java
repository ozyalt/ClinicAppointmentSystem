//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;


public class HealthCarePratitioner extends Person {
    private boolean onLeave;

     HealthCarePratitioner(){
        
    }

    public HealthCarePratitioner( String name, String nationality, int year, int month, int day, char gender, String phone, String address,boolean onleave) {
        super(name, nationality, year, month, day, gender, phone, address);
        this.onLeave = onleave;
    }


    public boolean isOnLeave() {
        return onLeave;
    }

    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }
    
}
