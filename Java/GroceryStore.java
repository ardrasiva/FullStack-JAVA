import java.time.LocalDateTime;
import java.util.Scanner;
public class GroceryStore {
    public static double CalculateTotalCost(int[] quantity,int[] prices)
    {
        double total=0;
        for(int i=0;i<prices.length;i++)
        {
            total = total + (quantity[i] * prices[i]);
        }
        if(total > 500)
        {
            double discount = total * 0.1;
            double totalAfterDiscount = total - discount;
            return totalAfterDiscount;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] quantity =  new int[5];
        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] pricePerUnit = {50, 40, 100, 25, 30};

        try{
            for(int i=0;i<items.length;i++)
            {
                System.out.println(items[i]+" - Rs."+pricePerUnit[i]);
                System.out.print("Enter the quantity : ");
                quantity[i] = s.nextInt();
            }
            double total = CalculateTotalCost(quantity,pricePerUnit);
            System.out.println("Total Bill = "+total);
            System.out.println("Purchased Date and Time : "+LocalDateTime.now());
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        s.close();
    }
}
