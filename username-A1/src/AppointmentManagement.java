
import java.util.ArrayList;

public class AppointmentManagement {
    public ArrayList<Appointment> appointments;
    public AppointmentManagement(){
        appointments=new ArrayList<>();
    }
    public void createAppointment(String ptname, int phonenumber, String selectDoctor, String time){
         if (ptname==null & phonenumber== 0 & selectDoctor==null & time==null){
             System.out.println("The condition was not met and the appointment could not be created");
         }
         else{
            Appointment appointment=new Appointment(ptname,phonenumber,selectDoctor,time);
            appointments.add(appointment);
         }

    }
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
    public void cancelBooking(int  phonenumber){
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPhonenumber()==(phonenumber)) {
                // 如果找到匹配项，从列表中移除预约
                appointments.remove(i);
                System.out.println("Cancelled phone number:" + phonenumber + "appointment");
                return; // 取消后退出方法
            }
            else{
                System.out.println("No reservation found for this phone number");
            }
        }
    }
    
}
