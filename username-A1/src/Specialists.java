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
        System.out.println("医生的专业领域是"+":"+this.SpecialtyArea);
    }
}
