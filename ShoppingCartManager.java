import java.util.*;
public class ShoppingCartManager {
	public static void main(String args[]) {
		ShoppingCart cart = new ShoppingCart();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Customer name: ");
		cart.setCustomerName(input.nextLine());
		
		System.out.println("Enter today's date: ");
		cart.setCurrentDate(input.nextLine());
		System.out.println();
		System.out.println("Customer Name: "+cart.getCustomerName());
		System.out.println("Today's Date: " +cart.getDate());
		
		char choice = 'q';
		do
		{
			cart.printMenu(cart);
			switch (choice)
            {
                case 'a':
                    cart.addItem(null);
                    break;
                case 'd': 
                    System.out.println("Enter item name:");
                    cart.removeItem(input.nextLine());
                    break;
                case 'c': 
                    cart.getNumItemsInCart();
                    break;
                case 'i':
                    cart.printDescription();;
                    break;
                case 'o':
                    cart.printTotal();
                    break;
            }
            choice = input.nextLine().toLowerCase().charAt(0);
        } while (choice != 'q');
		}
		
		
	
}
