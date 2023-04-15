//********************************//
//Name: Abdulaziz Mohammed Altamimi
//Section Number: IT 
//Assignment Title: Assignment 3
//ID : 1940715
//Date: 3/21/2010
//********************************//
package clinicappointmentsystem;


public class Person {
    private int id=idGenerator;
    private String Name;
    private String Nationality;
    private int Year;
    private int Month;
    private int Day;
    private char Gender;
    private String Phone;
    private String Address;
    public static int idGenerator;

     Person(){
        
    }
    public Person(String name,String nationality,int year,int month,int day,char gender,String phone,String address){
        this.Name=name;
        this.Nationality=nationality;
        this.Year=year;
        this.Month=month;
        this.Day=day;
        this.Gender=gender;
        this.Phone=phone;
        this.Address=address;
        idGenerator++;
    }
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getNationality() {
        return Nationality;
    }

    public int getYear() {
        return Year;
    }

    public int getMonth() {
        return Month;
    }

    public int getDay() {
        return Day;
    }

    public char getGender() {
        return Gender;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
    
}
