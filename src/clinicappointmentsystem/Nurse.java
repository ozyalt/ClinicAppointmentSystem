//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;


public class Nurse extends HealthCarePratitioner{
    private int experianceYears;

    public Nurse(int experianceYears, String name, String nationality, int year, int month, int day, char gender, String phone, String address, boolean onleave) {
        super(name, nationality, year, month, day, gender, phone, address, onleave);
        this.experianceYears = experianceYears;
    }
    
   

    public int getExperianceYears() {
        return experianceYears;
    }

    public void setExperianceYears(int experianceYears) {
        this.experianceYears = experianceYears;
    }

    
}
