import java.util.*;  
   
//create simple class to Calculate Bill  
class Billing
{      
 static double BillToPay;  
    
 static double Bill(long Units)  
 {  
     // check whether units are less than 50  
     if(Units <= 50)  
     {  
         BillToPay = Units*4.15;  
     }  
     // check whether the units are less than 100  
     else if(Units <= 100){  
         BillToPay = 50*4.15+(Units - 50)*6.25;  
     }  
     // check whether the units are less than 200  
     else if(Units <= 200)  
     {  
         BillToPay = 50*4.15+50*6.25+(Units-100)*7.50;
     } 
  // check whether the units are greater than 200  
     else if(Units > 200) {
    	 BillToPay = 50*4.15+50*6.25+100*7.50+(Units-200)*8.15;
     }
     return BillToPay;  
 }      
}  
// create class ElectricityBill to calculate electricity bill using Inheritance  
class ElectricityBill extends Billing
{   
    // main() method start  
    public static void main(String args[])   
    {        
     // create Scanner class object to take input from user  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the Units: ");  
        int Units = sc.nextInt();  
        System.out.println("Net Amount Due: " + Bill(Units));   
    }   
}  
       

