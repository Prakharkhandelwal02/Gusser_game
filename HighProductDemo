
// AppMain.java (file)
package com.exampledemo.main;

import com.exampledemo.pojo.Product;
import java.util.Scanner;

public class AppMain {
    public static void main (String[] args)
    {
        Product[] arr = new Product[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;  i<arr.length; i++ ){
            System.out.print(" Enter product id: ");
            int id =sc.nextInt();
            
              System.out.print(" Enter product price: ");
            int prc =sc.nextInt();
            
              System.out.print(" Enter product quantity : ");
            int qty =sc.nextInt();
            
            arr[i] = new Product(id,prc,qty);
        }
        int total = findTotalAmountOfProducts(arr);
        System.out.println("total amount spent"+ "on all products:" + total);
        
        int id = findProductWithHighestPrice(arr);
        System.out.println("id of the product with highest"+ " price : " + id);
                }
    static int findTotalAmountOfProducts (Product[] products){
                int totalAmount = 0;
                
                for (Product p : products){
    totalAmount = totalAmount + (p.getPrice()  *  p.getQuantity());
}
                return totalAmount;
    }
static int findProductWithHighestPrice(Product[] products){
int pid = 0;
int max = products[0].getPrice();

for(Product p : products){
if (max < p.getPrice()){
max = p.getPrice();
pid = p.getPid();
}
}
 return pid;   
}
}

// new file with Product name

package com.exampledemo.pojo;

public class Product {
    private int pid;
    private int price;
    private int quantity;
    
    public Product (){
    }
        public Product(int pid , int price,int quantity){
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }
        public int getPid(){
            return pid ;
        }
        public void  setPid(int pid ){
            this.pid=pid;
        }
         public int getPrice(){
            return price ;
        }
        public void  setPrice(int price ){
            this.price=price;
        }
         public int getQuantity(){
            return quantity ;
        }
        public void  setQuantity(int quantity ){
            this.quantity=quantity;
        }
        
    }
    


