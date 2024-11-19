
//Initialize instance
public class Appointment {
    String ptname;
    int phonenumber;
    String selectDoctor;
    String time;

    public  Appointment(){
        this.ptname=" ";
        this.phonenumber=0;
        this.selectDoctor=" ";
        this.time="0";
    }
//Accepted parameter
    public Appointment(String ptname,int phonenumber, String selectDoctor,String time){
         this.ptname = ptname;
         this.phonenumber=phonenumber;
         this.selectDoctor=selectDoctor;
         this.time=time;
    }
    //This encapsulation enables cancelBooking in AppointmentManagement to use phonenumber values
    public int getPhonenumber() {
        return phonenumber;
    }
//Output information
    public void printAppinfo(){
        System.out.println("The patient's name is"+":"+this.ptname);
        System.out.println("The patient's phone number is"+":"+this.phonenumber);
        System.out.println("The patient's choice of doctor is"+":"+this.selectDoctor);
        System.out.println("The time the patient chooses is"+":"+this.time);
    }
    

}
