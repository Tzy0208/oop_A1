
import java.util.ArrayList;

public class AppointmentManagement {
    //Tells the compiler ArrayList to store an object of type Appointment.
    public ArrayList<Appointment> appointments;
    public AppointmentManagement(){
        //create new arraylist
        appointments=new ArrayList<>();
    }
    //Use if to add the contents of the list, if the condition is not met, do not add the contents and output a prompt
    public void createAppointment(String ptname, int phonenumber, String selectDoctor, String time){
         if (ptname==null & phonenumber== 0 & selectDoctor==null & time==null){
             System.out.println("The condition was not met and the appointment could not be created");
         }
         else{
            Appointment appointment=new Appointment(ptname,phonenumber,selectDoctor,time);
            appointments.add(appointment);
         }

    }
    //Use if to determine if there is anything in the arraylist. If there is, output it. If not, output a prompt
    public void printExistingAppointments(){
        if(appointments.isEmpty()){
            System.out.println("No appointment");
        }
        else {
            for(Appointment appointment : appointments){
                appointment.printAppinfo();
                System.out.println("------------------------------");
            }
        }
    }
    //Use the for loop to achieve the deletion function, by querying the phone number one by one to confirm whether there is an appointment, if there is a deletion, if not, the output prompt
    public void cancelBooking(int  phonenumber){
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPhonenumber()==phonenumber) {
                // If a match is found, remove the appointment from the list
                appointments.remove(i);
                System.out.println("Cancelled phone number:" + phonenumber + "appointment");
                
            }
            //If not found, output a prompt
            else{
                System.out.println("No reservation found for this phone number");
                System.out.println("------------------------------");
            }
        }
    }
    
}
