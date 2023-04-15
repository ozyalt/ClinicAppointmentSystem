//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;


public class Clinic {
    private int Clinic_Number;
    private int Clinic_Floor;

    public Clinic() {
    }

    public Clinic(int Clinic_Number, int Clinic_Floor) {
        this.Clinic_Number = Clinic_Number;
        this.Clinic_Floor = Clinic_Floor;
    }


    public int getClinic_Number() {
        return Clinic_Number;
    }

    public void setClinic_Number(int Clinic_Number) {
        this.Clinic_Number = Clinic_Number;
    }

    public int getClinic_Floor() {
        return Clinic_Floor;
    }

    public void setClinic_Floor(int Clinic_Floor) {
        this.Clinic_Floor = Clinic_Floor;
    }
    
}
