//Chapter 8, Order Entry Problem
//Filename: Order.java
//Programmer: Donovan Neal
//Date: 2/19/2025
public class Order 
{
   private OrderType orderType; 
   private String cus_address; 
   private double delivery_price;
   private String deliveryType;
   private String name; 
   private String item; 
   private int quantity; 
   private double price; 
   private double total;
   
   
   public Order(OrderType orderType)
   {
      this.orderType = orderType; 
      this.cus_address = "1122 Restaurant Avenue"; 
      this.delivery_price = 0; 
   }  
   public Order(String address, double price, OrderType orderType)
   {
      this.orderType = orderType;
      this.cus_address = address; 
      this.delivery_price = 15; 
   }
      public OrderType getOrderType()
      {
         return orderType; 
      }

      public void setAddress(String address)
      {
         cus_address = address;
      }
      public void setDeliveryPrice(double price)
      {
         delivery_price = price; 
      }
      public void setName(String name)
      {
         this.name = name; 
      }
      public String getName()
      {
         return name; 
      }
      public void setItem(String item)
      {
         this.item = item; 
      }
      public String getItem()
      {
         return item;
      }
      public void setQuantity(int quantity)
      {
         this.quantity = quantity; 
      }
      public int getQuantity()
      {
         return quantity; 
      }
      public void setPrice(double price)
      {
         this.price = price;
      }
      public double getPrice()
      {
         return price; 
      }
      public String getAddress()
      {
         return cus_address;
      }
      public double getDeliveryPrice()
      {
         return delivery_price; 
      }
      public void setTotal(double total)
      {
         this.total = total; 
      }
      public double getTotal()
      {
         return total; 
      }
   }
