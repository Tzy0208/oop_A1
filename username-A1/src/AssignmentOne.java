
public class AssignmentOne {
   // Part 3 – Using classes and objects
     public static void main(String[] args){
        GeneralPractitioner gp1= new GeneralPractitioner(1,"ZhuYufan","generalPractitioner","china");
        GeneralPractitioner gp2= new GeneralPractitioner(2,"WangYang","generalPractitioner","china");
        GeneralPractitioner gp3= new GeneralPractitioner(3,"XuMuyuan","generalPractitioner","china");
        Specialists sl1=new Specialists(4,"ChiGaoyang","Clinical medicine","specialist");
        Specialists sl2=new Specialists(5,"XuJun","stomatology","specialist");
        gp1.printDetailsinfo();
        System.out.println("------------------------------");
        gp2.printDetailsinfo();
        System.out.println("------------------------------");
        gp3.printDetailsinfo();
        System.out.println("------------------------------");
        sl1.printDetailsinfo();
        System.out.println("------------------------------");
        sl2.printDetailsinfo();
        System.out.println("------------------------------");
        
        AppointmentManagement applist=new AppointmentManagement();
          applist.createAppointment("YanYihui",1323312, gp1.name, "8:00");
     }
      //Part 5 – Collection of appointments
        
      
}
