//initialize
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
       //exportation
       public void printinfo(){
              System.out.println("Doctor's name"+":"+this.name);
              System.out.println("Doctor's id"+":"+this.id);
              System.out.println("Type of doctor"+":"+this.type);
              
       }
}
