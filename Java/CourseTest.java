class Course{
    String name;
    int weeks;
    int studentsEnrolled;
    final String courseCreator = "CodeMentor Academy";

    static int totalStudents = 0;

    Course(String n,int w,int s){
        this.name = n;
        this.weeks = w;
        this.studentsEnrolled = s;

        totalStudents = totalStudents + studentsEnrolled;
    }
    public void displayCourseDetails(){
        System.out.println("Course Creator : "+courseCreator+"\nCourse Name : "+name+"\nDuration of Course : "+weeks+"\nStudents Enrolled : "+studentsEnrolled);
    }
    static class Platform{
        public static void displayMessage(){
            System.out.println("Courses are hosted on CodeMentor.");
        }
    }
}
public class CourseTest {
    public static void main(String[] args) {
        
        Course c1 = new Course("Java Full Stack", 20, 15);
        Course c2 = new Course("Data Science", 15, 10);
        System.out.println("Course 1 Details : ");
        c1.displayCourseDetails();
        System.out.println("Course 2 Details : ");
        c2.displayCourseDetails();

        System.out.println("\nTotal Students : "+Course.totalStudents);

        Course.Platform.displayMessage();


        
    }
}
