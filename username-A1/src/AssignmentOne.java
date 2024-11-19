
public class AssignmentOne {
   // Part 3 – Using classes and objects
   //use class GeneralPractitioner to create objects
     public static void main(String[] args){
        GeneralPractitioner gp1= new GeneralPractitioner(1,"ZhuYufan","generalPractitioner","china");
        GeneralPractitioner gp2= new GeneralPractitioner(2,"WangYang","generalPractitioner","china");
        GeneralPractitioner gp3= new GeneralPractitioner(3,"XuMuyuan","generalPractitioner","china");
        Specialists sl1=new Specialists(4,"ChiGaoyang","Clinical medicine","specialist");
        Specialists sl2=new Specialists(5,"XuJun","stomatology","specialist");
        //Use method printDetailsinfo to output the contents of gp
        gp1.printDetailsinfo();
        gp2.printDetailsinfo();
        gp3.printDetailsinfo();
        sl1.printDetailsinfo();
        sl2.printDetailsinfo();
        //Part 5 – Collection of appointments
        //Use AppointmentManagement to implement the addition, output, and removal of appointment list content
        AppointmentManagement applist=new AppointmentManagement();
          applist.createAppointment("YanYihui",1323312, gp1.name, "08:00");
          applist.createAppointment("YanHa", 12345, gp2.name, "10:00");
          applist.createAppointment("TaoYu", 34567, sl1.name, "15:00");
          applist.createAppointment("GuoHua", 6789, sl2.name, "20:30");
          System.out.println("Existing Appointments:");
          applist.printExistingAppointments();
          applist.cancelBooking(12345);
          System.out.println("The updated appointment:");
          applist.printExistingAppointments();
     }
      
        
      
}
