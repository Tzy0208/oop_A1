
import java.time.LocalTime;
import java.util.ArrayList;

public class AppointmentManagement {
    public ArrayList<Appointment> appointments;
    public AppointmentManagement(){
        appointments=new ArrayList<>();
    }
    public void createApp(String ptname,int phonenumber,String selectDoctor,LocalTime time){
         if (ptname==null & phonenumber== 0 & selectDoctor==null & time==null){
             System.out.println("没满足条件,无法创建appointment");
         }
         else{
            Appointment appointment=new Appointment(ptname,phonenumber,selectDoctor,time);
            appointments.add(appointment);
         }

    }
    public void printExinfo(){
        
    }
}
