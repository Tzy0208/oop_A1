public class Specialists extends HealthProfessional{
    public String SpecialtyArea;
    //First inherits the parent class with super () and then initializes SpecialtyArea
    public Specialists(){
        super();
        this.SpecialtyArea=" ";
    }
    //Initialize the instance and receive the parameters
    public Specialists(int id, String name, String SpecialtyArea,String type) {
        super(id, name,type); 
        this.SpecialtyArea = SpecialtyArea;
    }
    //Output information
    public void printDetailsinfo(){
        super.printinfo();
        System.out.println("The doctor's area of expertise is"+":"+this.SpecialtyArea);
        System.out.println("------------------------------");
    }
}
