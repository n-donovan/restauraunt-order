//Chapter 8, Order Entry Problem
//Filename: PlaceOrder.java
//Programmer: Donovan Neal
//Date: 2/19/2025
import java.util.*; 
public class PlaceOrder 
{
   public static void main(String[] args)
   {
      Order orderType;
      Scanner input = new Scanner(System.in); 
      String name;
      String item; 
      int quantity; 
      double price; 
      String address = "1122 Restaurant Avenue"; 
      int fee = 15;
      int del_choice; 
      Order delivery = new Order("", 0.00, OrderType.DELIVERY); 
      Order pickup = new Order(OrderType.PICKUP);
      
      System.out.println("Hello! Welcome to the restaurant!");
      System.out.println("Will this be for delivery (1) or pickup? (2)");
      del_choice = input.nextInt(); 
      
      if(del_choice == 1)
      {
         System.out.println("Please enter a name for the order: ");
         input.nextLine();
         name = input.nextLine(); 
         delivery.setName(name);
         
         System.out.println("Enter the item you wish to purchase: " );
         item = input.nextLine(); 
         delivery.setItem(item);
         
         System.out.println("How many? ");
         quantity = input.nextInt(); 
         delivery.setQuantity(quantity); 
         
         System.out.println("Enter the price of the item: " );
         price = input.nextDouble(); 
         delivery.setPrice(price);
         
         System.out.println("Enter an address for the delivery: " );
         input.nextLine();
         address = input.nextLine(); 
         delivery.setAddress(address);
         
         calculateOrderTotal(delivery, fee);
         displayOrderData(delivery);
      }
      else 
      {
         System.out.println("Please enter a name for the order: ");
         input.nextLine();
         name = input.nextLine(); 
         pickup.setName(name);
         
         System.out.println("Enter the item you wish to purchase: " );
         item = input.nextLine(); 
         pickup.setItem(item); 
         
         System.out.println("How many? ");
         quantity = input.nextInt();
         pickup.setQuantity(quantity); 
         
         
         System.out.println("Enter the price of the item: " );
         price = input.nextDouble(); 
         pickup.setPrice(price);
         
         
         calculateOrderTotal(pickup);
       
         displayOrderData(pickup);
      }
  }   
      public static void calculateOrderTotal(Order order, int fee)
      {
         double total = order.getPrice() * order.getQuantity() + fee; 
         order.setTotal(total);
          
      }
      public static void calculateOrderTotal(Order order)
      {
         double total = order.getPrice() * order.getQuantity();
         order.setTotal(total);
         
      }
      
      public static void displayOrderData(Order order)
      {
         System.out.println("Name: " + order.getName());
         System.out.println("Order Type: " + order.getOrderType());
         System.out.println("Delivery Location: " + order.getAddress());
         System.out.println("Item: " + order.getItem());
         System.out.println("Quantity: " + order.getQuantity());
         System.out.println("Price: $" + order.getPrice());
         System.out.println("Delivery Fee: $" + order.getDeliveryPrice());
         System.out.println("Total: $" + order.getTotal());
      }

   }
