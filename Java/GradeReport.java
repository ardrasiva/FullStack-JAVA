public class GradeReport {
    public static void main(String[] args) {
        int[] marks = {78, 82, 91, 65, 34};
        int flag=0;
        double total=0;
        double averageMarks;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] < 35)
            {
                System.out.println("\nFail\n");
                flag=1;
                break;
            }
            
        }
        if(flag != 1)
            {
                for(int i=0;i<marks.length;i++)
                {
                    total = total + marks[i];
                }
                averageMarks = total / marks.length;
                //System.out.println(averageMarks);
                if(averageMarks >= 90)
                {
                    System.out.println("\nAverage Marks Above 90 : Grade A!\n");
                }
                else if(averageMarks >=75 && averageMarks <= 89)
                {
                    System.out.println("\nAverage Marks between 75 - 89 : Grade B!\n");
                }
                else if(averageMarks >=60 && averageMarks <= 74)
                {
                    System.out.println("\nAverage Marks between 60 - 74 : Grade C!\n");
                }
                else if(averageMarks < 60)
                {
                    System.out.println("\nAverage Marks below 60 : Grade D!\n");
                }
            }
    }
}
