public class GeneralPractitioner extends HealthProfessional{
    public  String workLocation;

    public GeneralPractitioner() {
        super(); 
        this.workLocation = "";
    }

    public GeneralPractitioner(int id, String name, String type,String workLocation ) {
        super(id, name,type); 
        this.workLocation = workLocation;
    }

   
    public void printDetailsinfo() {
        super.printinfo();
        System.out.println("WorkLocation: " + this.workLocation);
    }
}

