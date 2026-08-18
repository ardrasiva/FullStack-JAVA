public class DailySales {
    public static void main(String[] args) {
        int total;
        int[][] salesData = {
            {100, 60, 10},  
            {120, 70, 20},  
            {110, 80, 30},  
            {90, 100, 40},  
            {100, 90, 45}
        };
        for(int i = 0;i<3;i++)
        {
            total = 0;
            for(int j=0;j<5;j++)
            {
                total = total + salesData[j][i];
            }
            if(total >= 500)
            {
                System.out.println("Product Sales - "+total+" - Target Achieved");
            }
            else if( total >=300 && total <=499)
            {
                System.out.println("Product Sales - "+total+" - Average Performance");
            }
            else if(total<300)
            {
                System.out.println("Product Sales - "+total+" - Needs Improvement");
            }
        
        }
        
    }
}
