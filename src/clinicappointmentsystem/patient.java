//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;


public class patient extends Person  {
    private String Diagnosis;
    private Appointment[] appointment=new  Appointment[2];
    private int numberofAppointment=0;
    public static int numberOfPatient;
    
    patient(){
        
    }

    public patient( String name, String nationality, int year, int month, int day, char gender, String phone, String address,String diagnosis ) {
        super(name, nationality, year, month, day, gender, phone, address);
        this.Diagnosis = diagnosis;
    }
        
     

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }
    public int getNumberofAppointment() {
        return numberofAppointment;
    }


    public  String getappointmentAT(int index){
        String temper="";
       
        return temper;
    }
    public boolean Addappointment(Clinic clinic,int year,int month,int day,int appointmentTime){
        int dexter=numberofAppointment;
        Appointment temper=new Appointment(clinic,year,month,day,appointmentTime);
        appointment[dexter]=temper;
        appointment[dexter].setAvailable(false);
        numberofAppointment++;
        return false;
    }
    public void DellappointmentAT(int index){
        if(index==1){
            appointment[index].setAvailable(true);
            
        }
        if(index==0){
            appointment[index]=appointment[index+1];
        }
        numberofAppointment--;
        
    }
    public int SearchappointmentAT(int year,int month,int day,int Time){
        int dextor=2;
        for(int i=0; i<appointment.length; i++){
            if(appointment[i].getYear()==year && appointment[i].getMonth()==month && appointment[i].getDay()==day && appointment[i].getAppointmentTime()==Time){
                dextor=i;
               break;
            }
             
        }
       return dextor;   
    } 
    
    public String appointmentAt(int i){
        return " Appointment number: "+(i+1)+" Clinic: Number "+appointment[i].getClinic().getClinic_Number()+" Floor: "+appointment[i].getClinic().getClinic_Floor()+" Date: "+appointment[i].getDay()+"/"+appointment[i].getMonth()+"/"+appointment[i].getYear()+" Time: "+appointment[i].getAppointmentTime()+":00";
        
    }
    
}
