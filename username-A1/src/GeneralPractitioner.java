public class GeneralPractitioner extends HealthProfessional{
    public  String workLocation;

    public GeneralPractitioner() {
        super(); 
        this.workLocation = "";
    }

    public GeneralPractitioner(int id, String name, String workLocation,String type) {
        super(id, name,type); 
        this.workLocation = workLocation;
    }

   
    public void printDetailsinfo() {
        System.out.println("WorkLocation: " + this.workLocation);
    }
}

