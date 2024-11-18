
import java.time.LocalTime;

public class Appointment {
    String ptname;
    int phonenumber;
    String selectDoctor;
    LocalTime selecttime;

    public  Appointment(){
        this.ptname=" ";
        this.phonenumber=0;
        this.selectDoctor=" ";
        this.selecttime=LocalTime.of(0,0);
    }

    public Appointment(String ptname,int phonenumber, String selectDoctor,LocalTime time){
         this.ptname = ptname;
         this.phonenumber=phonenumber;
         this.selectDoctor=selectDoctor;
         this.selecttime=time;
    }
    public void printAppinfo(){
        System.out.println("病人的的名字是"+":"+this.ptname);
        System.out.println("病人的的电话号码是"+":"+this.phonenumber);
        System.out.println("病人选择的医生是"+":"+this.selectDoctor);
        System.out.println("病人选择的时间是"+":"+this.selecttime);
    }
}