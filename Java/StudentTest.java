class Student{
    private String name;
    private int rollno;
    private int percentage;
    
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollno;
    }
    public int getPercentage(){
        return percentage;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setRollNo(int r){
        this.rollno = r;
    }
    public void setPercentage(int p){
        this.percentage = p;
    }


}

public class StudentTest{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ardra");
        s.setRollNo(17);
        s.setPercentage(90);
        System.out.println("Student Details \nName : "+s.getName()+"\nRoll No : "+s.getRollNo()+"\nPercentage : "+s.getPercentage());
    }
}