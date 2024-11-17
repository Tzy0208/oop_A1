public class HealthProfessional {
        String name;
        int id;
        String type;
       public  HealthProfessional(){
           this.name=" ";
           this.id=0;
           this.type=" ";

       }
       public HealthProfessional(int id,String name,String type){
              this.name=name;
              this.id=id;
              this.type=type;
          }  
       public void printinfo(){
              System.out.println("医生的名字"+":"+this.name);
              System.out.println("医生的id"+":"+this.id);
              System.out.println("医生类型"+":"+this.type);
       }
}
