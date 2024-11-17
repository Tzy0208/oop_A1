public class GeneralPractitioner extends HealthProfessional{
    public  String workLocation;

    public GeneralPractitioner() {
        super(); 
        this.workLocation = "";
    }

    public GeneralPractitioner(int ID, String name, String workLocation,String type) {
        super(ID, name,type); 
        this.workLocation = workLocation;
    }

   
    public void printDetails() {
         
        System.out.println("WorkLocation: " + this.workLocation);
    }
}

