class student{
    String name;
    int rollno;
    int marks;
    student(String name,int rollno,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    public char gradebasedonmarks(){
        if(marks>90)
        return 'A';
        else if(marks<90 && marks>80)
        return 'B';
        else if(marks<80 && marks >70)
        return 'C';
        else if(marks<70 && marks>60)
        return 'D';
        else 
        return 'F';
    }
    public void displaydetails(){
        System.out.println("Name of student"+name);
        System.out.println("roll no "+rollno);
        System.out.println("grade of student:"+gradebasedonmarks());
    }
}

public class SimulateStudentReport {
    public static void main(String[] args) {
        student student1=new student("Avinash", 8, 77);
        student student2=new student("Aman", 19,66);
        student1.displaydetails();
        student2.displaydetails();

    }

    
}
