public class InventoryCheck {
    public static void main(String[] args) {
        int[] items = {20,15,30,0,25};
        int total=0;
        int flag = 0;
        for(int i=0;i<items.length;i++)
        {
            if(items[i] == 0)
            {
                System.out.println("Out of Stock");
                flag = 1;
                break;
            }
            total = total + items[i];

        }
        
        if(flag !=1){
        if(total < 50)
        {
            System.out.print("Total : "+total+" - Low Stock");
        }
        else if(total >=50 && total <=100)
        {
            System.out.print("Total : "+total+" - Moderate Stock");
        }
        else if(total > 100)
        {
            System.out.print("Total : "+total+" - Good Stock");
        }
    }
}
}
