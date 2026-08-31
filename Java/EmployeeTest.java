class Employee{
    private String name;
    private int idNum;
    private String dept;
    private double salary;

    public String getName(){
        return name;
    }
    public int getIdNum(){
        return idNum;
    }
    public String getDept(){
        return dept;
    }
    public double getSalary(){
        return salary;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setIdNum(int id){
        this.idNum = id;
    }
    public void setDept(String d){
        this.dept = d;
    }
    public void setSalary(double s){
        this.salary = s;
    }

}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setName("Ardra");
        e1.setIdNum(17);
        e1.setDept("IT");
        e1.setSalary(25000);
        e2.setName("Evaniya");
        e2.setIdNum(24);
        e2.setDept("Finance");
        e2.setSalary(22000);
        System.out.println("Employee 1 details  \nName : "+e1.getName()+"\nID Number : "+e1.getIdNum()+"\nDepartment : "+e1.getDept()+"\nSalary : "+e1.getSalary());
        System.out.println("\nEmployee 2 details  \nName : "+e2.getName()+"\nID Number : "+e2.getIdNum()+"\nDepartment : "+e2.getDept()+"\nSalary : "+e2.getSalary());
    }
    
}
