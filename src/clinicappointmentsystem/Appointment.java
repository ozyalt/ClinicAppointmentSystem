//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;


public class Appointment extends Clinic {
    private Clinic clinic;
    private int Year;
    private int Month;
    private int Day;
    private int AppointmentTime;
    private boolean Available=true;

    public Appointment() {
    }

    public Appointment(Clinic clinic, int Year, int Month, int Day, int AppointmentTime) {
        this.clinic = clinic;
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
        this.AppointmentTime = AppointmentTime;
    }
    


    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getAppointmentTime() {
        return AppointmentTime;
    }

    public void setAppointmentTime(int AppointmentTime) {
        this.AppointmentTime = AppointmentTime;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }
    
    
    
}
