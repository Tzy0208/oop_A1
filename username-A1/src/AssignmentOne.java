



public class AssignmentOne {
     public static void main(String[] args){
        GeneralPractitioner gp1= new GeneralPractitioner(1,"ZhuYufan","generalPractitioner","china");
        GeneralPractitioner gp2= new GeneralPractitioner(2,"WangYang","generalPractitioner","china");
        GeneralPractitioner gp3= new GeneralPractitioner(3,"XuMuyuan","generalPractitioner","china");
        Specialists sl1=new Specialists(4,"ChiGaoyang","Clinical medicine","specialist");
        Specialists sl2=new Specialists(5,"XuJun","stomatology","specialist");
        gp1.printDetailsinfo();
        gp2.printDetailsinfo();
        gp3.printDetailsinfo();
        sl1.printDetailsinfo();
        sl2.printDetailsinfo();
        System.out.println(gp1.name);
     }
}
