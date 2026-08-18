import java.time.LocalDateTime;
import java.util.Scanner;
public class AttendenceSystem {
    public static double CalculateAverage(int[] marks)
    {
        double total=0;
        for(int i=0;i<marks.length;i++)
        {
            total = total + marks[i];
        }
        double averageMark = total/marks.length;
        return averageMark;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of students : ");
        n = s.nextInt();
        s.nextLine();
        String[] names = new String[n];
        int[] marks = new int[n];
        System.out.println("Enter the details of each students : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the name of student : ");
            names[i] = s.nextLine();
            System.out.print("\nEnter the marks : ");
            marks[i] = s.nextInt();
            s.nextLine();

        }
        System.out.println("The details of each students are : \n");
        for(int i=0;i<n;i++)
        {
            System.out.println("Name : "+names[i]);
            if(marks[i] < 35)
            {
                System.out.println("Marks : "+marks[i]+" - Needs Improvement");
            }
            else
            {
                System.out.println("Marks : "+marks[i]);
            }
            
        }

        double averageMarks = CalculateAverage(marks);
        System.out.println("Average Marks = "+averageMarks);
        System.out.println("Local time and date now : "+LocalDateTime.now());
        s.close();
    }
}
