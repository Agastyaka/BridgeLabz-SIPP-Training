class Employe{
    String name;
    public Employe(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("name of employe"+name);
    }

}
class Departmant{
    String deprtname;
    Employe[] employes;
    public Departmant(String deprtname,Employe[] employes){
        this.deprtname=deprtname;
        this.employes=employes;
    }
    public void display(){
        System.out.println("department name"+deprtname);
        for(int i=0;i<=employes.length-1;i++){
            employes[i].display();
        }
    }
}
class Company{
    String companyname;
    Departmant[] departmants;
    public Company(String companyname,Departmant[] departmants){
        this.companyname=companyname;
        this.departmants=departmants;
    }
    public void display(){
        System.out.println("company name is "+companyname);
        for(int i=0;i<=departmants.length-1;i++){
            departmants[i].display();
        }
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Employe employe1=new Employe("tehwa");
        Employe employe2=new Employe("radjf");
        Employe employe3=new Employe("asdf");
        Departmant departmant1=new Departmant("cs ", new Employe[]{employe1});
        Departmant departmant2=new Departmant("sales", new Employe[]{employe2,employe3});
        Company company=new Company("atsn", new Departmant[]{departmant1,departmant2});
        company.display();
    }

    
}