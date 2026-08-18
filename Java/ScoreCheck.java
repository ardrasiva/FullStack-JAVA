public class ScoreCheck {
    public static void main(String[] args) {
        int[] scores = {95, 82, 68, 45, 90};
        System.out.println("\nMarks of 5 students\t\t\n");
        for(int i=0;i<scores.length;i++)
        {
            if(scores[i] >= 90)
            {
                System.out.println(scores[i]+" - Excellent");
            }
            else if(scores[i] >= 75 && scores[i] <= 89)
            {
                System.out.println(scores[i]+" - Good");
            }
            else if(scores[i] >= 50 && scores[i] <= 74)
            {
                System.out.println(scores[i]+" - Average");
            }
            else if(scores[i] < 50)
            {
                System.out.println(scores[i]+" - Fail");
            }
        }
    }
}
