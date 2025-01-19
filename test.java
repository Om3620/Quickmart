package products;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class test  {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
  
Implementation t = new  Implementation();
 Retrive_Data rd = new Retrive_Data();
Sort_products sp= new Sort_products();
Update_Data u = new Update_Data();
		
	System.out.println("\n\n--------------Please Select Option for Oprations-------------------");
	
	System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
	while(true) {
	System.out.println("\n\n1) INSERT DATA \t\t 2) RETRIVE DATA \t\t3) UPDATE DATA \n\n 4) SORT BY PRICE \t\t5) DELETE DATA \t\t6)EXITE FROM SYSTEM");
	System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
  System.out.println("\n *.* Please enter your choice *.* ");
   int choice=s.nextInt();
   switch(choice) {
   
   case 1 :
	   try {
	   System.out.println("================--------------==============-------------===============--------==============----------=============");
	   t.add_Prouct();
	   }catch(SQLIntegrityConstraintViolationException e) {
		   System.out.println("\n\n\tplease Enter Another Id----*Product should contain unique Id*----");
	   }
	   
	   System.out.println("\n\n================--------------==============-------------===============--------==============----------=============");
break;
   case 2:
	   try {
	   System.out.println("================--------------==============-------------===============--------==============----------=============");
	   rd.retrive();
	   }catch(SQLException e) {
		   System.out.println("\n\t\t----------------------Record not found--------------------------");
		   System.out.println("\n\t please enter valid Id");
		   System.out.println("\n\n================--------------==============-------------===============--------==============----------=============");

	   }
break;
   case 3:
	   System.out.println("================--------------==============-------------===============--------==============----------=============");
	   u.update_Product();
	   System.out.println("\n\n================--------------==============-------------===============--------==============----------=============");
break;
   case 4: 
	   System.out.println("================--------------==============-------------===============--------==============----------=============");
	   sp.lowToHigh();
	   System.out.println("\n\n================--------------==============-------------===============--------==============----------=============");
break;
   case 5://try
	   System.out.println("================--------------==============-------------===============--------==============----------=============");
sp.delete_Data();
	   System.out.println("\n\n================--------------==============-------------===============--------==============----------=============");
   //}
	 //  catch(SQLException e) {
	  
   //}
break;
   case 6:
	   System.out.println("================--------------==============-------------===============--------==============----------=============");
System.out.println("\n ***********************Exted Successfully ***********************");
	   System.out.println("\n\n================--------------==============-------------===============--------==============----------=============");
	   System.exit(0);
break;
default:
	System.out.println("\n\t\t************OOPS************");
	System.out.println("--------------------ENTERED CHOICE WAS NOT VALID--------------------");

   }
	}
	}
}
