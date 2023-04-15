//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ClinicAppointmentSystem {

            // Main Method \\
    public static void main(String[] args) throws FileNotFoundException {
         String temp;
        File file = new File("input.txt");
        if (!file.exists()) {
        System.out.println("File Not availble");
        System.exit(0);
        }

        File fileo = new File("output.txt");
        PrintWriter writer = new PrintWriter(fileo);
        Scanner SC = new Scanner(file);
        
        physician[] Mphysicians=new physician[SC.nextInt()];
        Nurse[] Mnurse=new Nurse[SC.nextInt()];
        patient[] Mpatients=new patient[SC.nextInt()];
        Clinic [] Numclinic=new Clinic[SC.nextInt()];
        Appointment[] Aclinic=new Appointment[SC.nextInt()];
        
        writer.println("\nWelcome to the Clinic Appointment System!\n\n");
        
        
        SET_physicain(Mphysicians, SC, writer);
        
        SET_nurse(Mnurse, SC, writer);
        
        SET_patient(Mpatients, SC, writer);
        
        SET_Clinic(Numclinic, SC, writer);
        
        SET_Appointment(Aclinic, SC, writer);
        
        String tt ="RSRVAppointment";
        String t = "Quit";
        String temper=SC.next();
        // Switch for calling Methods //
        while(true){
            switch (temper){
            case "RSRVAppointment":
            MakeAppointment(Aclinic, Mpatients, SC, writer);
            break;
            case "CancelAppointment":
            CancleAppoitnemnt(Aclinic, Mpatients, SC, writer);
            break;
            case "PrintPatientRecord":
                PrintPatientRecord(Mpatients, SC, writer);
                break;
            case "Quit":
                writer.println("Thank you for using the clinic appointment System, Good Bye!");
                writer.flush();
                writer.close();
                SC.close();
                System.exit(0);
                
                break;
        }
            temper = SC.next();

        
        
        
    }
    }
    // SET physicain Method  \\
    public static void SET_physicain(physician[] Physicain,Scanner SC,PrintWriter writer){
                String temp = SC.next();
                writer.println("COMMAND: SET PHYSICIANS\n");
            for(int i=0; i<Physicain.length; i++){
                String name=SC.next();
                String nationality=SC.next();
                int year=SC.nextInt();
                int month=SC.nextInt();
                int day=SC.nextInt();
                char gender=SC.next().charAt(0);
                String phone=SC.next();
                String address=SC.next();
                boolean onleave=SC.nextBoolean();
                String spetiality=SC.next();
                physician temper=new physician(name,nationality,year,month,day,gender,phone,address,onleave,spetiality);
                Physicain[i]=temper;
                
                writer.println("Name: " + name + " Id: " +Physicain[i].getId());
                
                
            }            
            writer.println("\n------------------------------------------------------------------------------------------------------\n");
    }
       // SET Nurse Method  \\
    public static void SET_nurse(Nurse[] nurse,Scanner SC,PrintWriter writer){
                String temp = SC.next();
                writer.println("COMMAND: SET NURSES\n");
            for(int i=0; i<nurse.length; i++){
                String name=SC.next();
                String nationality=SC.next();
                int year=SC.nextInt();
                int month=SC.nextInt();
                int day=SC.nextInt();
                char gender=SC.next().charAt(0);
                String phone=SC.next();
                String address=SC.next();
                boolean onleave=SC.nextBoolean();
                int experianceYears=SC.nextInt();
                Nurse temper=new Nurse(experianceYears,name,nationality,year,month,day,gender,phone,address,onleave);
                nurse[i]=temper;
                writer.println("Name: " + name + " Id: " +nurse[i].getId() );
                
            }
            writer.println("\n------------------------------------------------------------------------------------------------------\n");
    }
    // SET patient Method  *set general information about patient*  \\
    public static void SET_patient(patient[] Patient,Scanner SC,PrintWriter writer){
                writer.println("COMMAND: SET PATIENTS\n");
                String temp = SC.next();
            for(int i=0; i<Patient.length; i++){
                String name=SC.next();
                String nationality=SC.next();
                int year=SC.nextInt();
                int month=SC.nextInt();
                int day=SC.nextInt();
                char gender=SC.next().charAt(0);
                String phone=SC.next();
                String address=SC.next();
                String diagnosis=SC.next();
                patient temper=new patient(name,nationality,year,month,day,gender,phone,address,diagnosis);
                Patient[i]=temper;
                writer.println("Name: " + name + " Id: " +Patient[i].getId() );
                
        } 
           writer.println("\n------------------------------------------------------------------------------------------------------\n");   
    }
    // SET Clinic Method  *Allows you to get Clinic number and floor*  \\
    public static void SET_Clinic(Clinic[] clinic,Scanner SC,PrintWriter writer){
                writer.println("COMMAND: SET CLINICS\n");
        String temp = SC.next();
            for(int i=0; i<clinic.length; i++){
                int Clinic_Number=SC.nextInt();
                int Clinic_Floor=SC.nextInt();
                Clinic temper=new Clinic(Clinic_Number,Clinic_Floor);
                clinic[i]=temper;
                writer.println("Clinic: Number " +Clinic_Number  + " Floor: " +clinic[i].getClinic_Floor() );
                
            }
                writer.println("\n------------------------------------------------------------------------------------------------------\n");  
    }
    // SET Appointment Method *Set appointment for patients*   \\
    public static void SET_Appointment(Appointment[] appointment,Scanner SC,PrintWriter writer){
                writer.println("COMMAND: SET APPOINTMENTS\n");
          String temp = SC.next();
            for(int i=0; i<appointment.length; i++){
                int Clinic_Number=SC.nextInt();
                int Clinic_Floor=SC.nextInt();
                int year=SC.nextInt();
                int month=SC.nextInt();
                int day=SC.nextInt();
                int AT= SC.nextInt();
                // Create diffrent objects for clinic and appointment //
                Clinic Mclinic=new Clinic(Clinic_Number,Clinic_Floor);
                Appointment temper=new Appointment(Mclinic,year,month,day,AT);
                appointment[i]=temper;
                writer.println("Clinic: Number  " +appointment[i].getClinic().getClinic_Number()+"  Floor:  "+appointment[i].getClinic().getClinic_Floor()+ " Date: "+day+"/"+month+"/"+year+"  "+AT+":00 " );
                
            }
             writer.println("\n------------------------------------------------------------------------------------------------------\n");  
    }
    // Make Appointment Method Resserve appointment for patients  \\
    public static void MakeAppointment(Appointment[] appointment,patient[] Patient,Scanner SC,PrintWriter writer){
        int taken=0;
        int APTime=0;
        int Person=0;
        String name=SC.next();
        int Clinic_Number=SC.nextInt();
        int Clinic_Floor=SC.nextInt();
        int Year=SC.nextInt();
        int Month=SC.nextInt();
        int Day=SC.nextInt();
        int time=SC.nextInt();
        
        int dexter=0;
        for(int i=0; i<Patient.length;i++){
            if(Patient[i].getName().equals(name)){
                Person=1;
                dexter=i;
            }
            }
            if(Person==0){
                writer.println("COMMAND: RESERVE APPOINTMENT\n");
                writer.println("Patient "+name+" is not registered\n\n");
                writer.println("------------------------------------------------------------------------------------------------------\n");
                return;
            }
            // get all appointment informatin //
         int dexterapp=0;
            for(int i=0;i<appointment.length;i++){
                    if(appointment[i].getYear()==Year && appointment[i].getMonth()==Month && appointment[i].getDay()==Day && appointment[i].getAppointmentTime()==time&&appointment[i].getClinic().getClinic_Number()==Clinic_Number){
                           APTime=1;
                 dexterapp=i;
                        }
                    }
                     if(APTime==0){
                       writer.println("COMMAND: RESERVE APPOINTMENT\n");
                       writer.println("Appointment not found in the clinic appointment list\n\n");
                       writer.println("------------------------------------------------------------------------------------------------------\n");
                       return;
                        }
                    
                // see if appointmnet is avalible    
               if(appointment[dexterapp].isAvailable()== false){
                writer.println("COMMAND: RESERVE APPOINTMENT\n");
                writer.println("Appointment is taken by other patient\n\n");
                writer.println("------------------------------------------------------------------------------------------------------\n");
                return;
               }
               if(Patient[dexter].getNumberofAppointment()==2){
                   writer.println("COMMAND: RESERVE APPOINTMENT\n");
                   writer.println("Appointment for paitient "+name+" can not be added as he has 2 appointment     registered\n\n");
                   writer.println("------------------------------------------------------------------------------------------------------\n");
                   return;
               }
           
             Clinic temp=new Clinic(Clinic_Number,Clinic_Floor);
             Patient[dexter].Addappointment(temp, Year, Month, Day, time);
             
             writer.println("COMMAND: RESERVE APPOINTMENT\n");
             writer.println("Appointment for paitient "+name+" is done\n\n");
             writer.println("------------------------------------------------------------------------------------------------------\n");
             appointment[dexterapp].setAvailable(false);
            
        
        
    }
    // Cancle Appointment Method *Canncle appointment to make place for new*  \\
    public static void CancleAppoitnemnt(Appointment[] appoitnment,patient[] Patient,Scanner SC,PrintWriter writer){
                    writer.println("COMMAND: CANCEL APPOINTMENT\n");

        String name=SC.next();
        int Clinic_Number=SC.nextInt();
        int Clinic_Floor=SC.nextInt();
        int Year=SC.nextInt();
        int Month=SC.nextInt();
        int Day=SC.nextInt();
        int time=SC.nextInt();
        int Dexist=0;
        int dextor=0;
        for(int i=0;i<Patient.length;i++){
            if(Patient[i].getName().equals(name)){
                Dexist=1;
                dextor = i;
            }
            
        }
        if(Dexist==0){
            writer.println("Patient: "+name+" is not registered\n\n");
            writer.println("------------------------------------------------------------------------------------------------------\n");
            return;
        }
        int dextorr=Patient[dextor].SearchappointmentAT(Year, Month, Day, time);
            if(dextorr== 2){
                writer.println("Appointment not found in patient "+name+" records\n\n"); 
                writer.println("------------------------------------------------------------------------------------------------------\n");
                return;
            }
        Patient[dextor].DellappointmentAT(dextorr);
        writer.println("Appointment for paitient "+name+" is Canceled ");
        appoitnment[SearchForAppointment(appoitnment, name, Clinic_Number, Clinic_Floor, Year, Month, Day, time)].setAvailable(true);
        
        writer.println("Appointment is Canceled from the clinic appointment list and available for other patient");
        writer.println("\n\n------------------------------------------------------------------------------------------------------\n\n");

        
    }

    // Search Appointment Method *see what is the avilble and what is the appointmnet of the patient*  \\
    public static int SearchForAppointment(Appointment[] appointment,String name,int clinic_num,int clinic_floor,int year,int month,int day,int time){
        for(int i=0; i<appointment.length;i++){
            if(appointment[i].getYear()==year&&appointment[i].getMonth()==month&&appointment[i].getDay()==day&&appointment[i].getAppointmentTime()==time&&appointment[i].getClinic().getClinic_Number()==clinic_num){
                return i;
            }
        }
        return 26;
    }
    // Search Paitient  Method   \\
    public static int SearchForPaitient(patient[] Paitient,String name){
        return 2;
    }
    // Print Patient Record  Method   \\
    public static void PrintPatientRecord(patient[] Paitent,Scanner SC,PrintWriter writer){
        writer.println("COMMAND: PRINT PATIENT APPOINTMENTS RECORD\n");
        int temper=0;
        int Dexist=0;
        int dextor=0;
        String name=SC.next();
        // loop for getting patient name //
        for(int i=0;i<Paitent.length;i++){
            if(Paitent[i].getName().equals(name)){
                Dexist=1;
                dextor = i;
            }
            
        }
        // print wither the patient is registerd or not//
        if(Dexist==0){
            writer.println("Patient: "+name+" is not registered\n");
            writer.println("------------------------------------------------------------------------------------------------------\n");
            return;
         
        }
        // print if the patient has appointment or not //
        if(Paitent[dextor].getNumberofAppointment()==0){
            writer.println("Appointment for "+name+" are:\n\n" +"Patient "+name+" has no appointent\n");
            writer.println("------------------------------------------------------------------------------------------------------\n");
            return;
        }
        // print appointment for this patient //
        writer.println("Appointment for "+name+" are:\n");
        for(int i =0;i<Paitent[dextor].getNumberofAppointment();i++){
            writer.println(Paitent[dextor].appointmentAt(i)+"\n");
            
            
            

        }
        
        
        writer.println("\n------------------------------------------------------------------------------------------------------\n");
    }
}
