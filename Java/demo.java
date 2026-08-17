public class demo {

	public static void main(String[] args) {
		int NumberOfBooks = 3;
		int PricePerBook = 275;
		double total = NumberOfBooks * PricePerBook;
		int discount = 10;
		double discountInDouble = discount;
		double DiscountAmt = (discountInDouble/100) * total;
		double TotalAfterDiscount = total - DiscountAmt;
		System.out.print("Number Of books : "+NumberOfBooks+"\nPrice Per Book : "+PricePerBook+"\nTotal Bill : "+total+"\nDiscount Percentage : "+discount+"%\nTotal Bill after discount : "+TotalAfterDiscount);

	}

}


