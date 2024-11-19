
import java.util.ArrayList;

public class AppointmentManagement {
    public ArrayList<Appointment> appointments;
    public AppointmentManagement(){
        appointments=new ArrayList<>();
    }
    public void createAppointment(String ptname, int phonenumber, String selectDoctor, String time){
         if (ptname==null & phonenumber== 0 & selectDoctor==null & time==null){
             System.out.println("没满足条件,无法创建appointment");
         }
         else{
            Appointment appointment=new Appointment(ptname,phonenumber,selectDoctor,time);
            appointments.add(appointment);
         }

    }
    public void printExistingAppointments(){
        if(appointments.isEmpty()){
            System.out.println("没有appointment");
        }
        else {
            for(Appointment appointment : appointments){
                appointment.printAppinfo();
            }
        }
    }
    public void cancelBooking(int  phonenumber){
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPhonenumber()==(phonenumber)) {
                // 如果找到匹配项，从列表中移除预约
                appointments.remove(i);
                System.out.println("已取消手机号为：" + phonenumber + "的预约");
                return; // 取消后退出方法
            }else{
                System.out.println("未找到改手机号的预约");
            }
        }
        System.out.println("------------------------------");
    }
    
}
