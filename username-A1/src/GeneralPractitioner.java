public class GeneralPractitioner extends HealthProfessional{
    public  String workLocation;
//First inherit, then initialize
    public GeneralPractitioner() {
        super(); 
        this.workLocation = "";
    }

    public GeneralPractitioner(int id, String name, String type,String workLocation ) {
        super(id, name,type); 
        this.workLocation = workLocation;
    }

   //Output information
    public void printDetailsinfo() {
        super.printinfo();
        System.out.println("WorkLocation: " + this.workLocation);
        System.out.println("------------------------------");
    }
}

