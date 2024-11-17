public class HealthProfessional {
        String name;
        int id;
        String department;
       public  HealthProfessional(){
           this.name=" ";
           this.id=0;
           this.department=" ";

       }
       public HealthProfessional(int id,String name,String department){
              this.name=name;
              this.id=id;
              this.department=department;
          }  
       public void printinfo(){
              System.out.println("医生的名字"+":"+this.name);
              System.out.println("医生的id"+":"+this.id);
              System.out.println("医生的部门"+":"+this.department);
       }
}
