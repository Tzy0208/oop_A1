public class Specialists extends HealthProfessional{
    public String SpecialtyArea;
    public Specialists(){
        super();
        this.SpecialtyArea=" ";
    }
    public Specialists(int id, String name, String SpecialtyArea,String type) {
        super(id, name,type); 
        this.SpecialtyArea = SpecialtyArea;
    }
    public void printDetailsinfo(){
        super.printinfo();
        System.out.println("The doctor's area of expertise is"+":"+this.SpecialtyArea);
    }
}
