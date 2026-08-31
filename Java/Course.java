public class Course {
    String name;
    int noOfWeeks;
    static int noOfCourse = 0;
    final String trainingCenter = "MashupStack";
    Course(){
        name = "Java Full Stack";
        noOfWeeks = 20;
        noOfCourse = noOfCourse+1;
    }

    Course(String n,int w){
        this.name = n;
        this.noOfWeeks = w;
        noOfCourse = noOfCourse+1;
    }
    public void displayCourseDetails(){
        System.out.println("Training Center : "+trainingCenter+"\nCourse Name : "+name+"\nDuration of Course : "+noOfWeeks);
    }
    class CourseMaterial{
        public void displayMaterials(){
            System.out.println("Materials provided for this course.\n");
        }
    }

    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course("Data Science",25);
        Course.CourseMaterial cm = c1.new CourseMaterial();
        System.out.println("Course 1");
        c1.displayCourseDetails();
        cm.displayMaterials();

        System.out.println("Course 2");
        c2.displayCourseDetails();
        cm.displayMaterials();

        System.out.println("Total Courses Provided : "+noOfCourse);


    }


}
