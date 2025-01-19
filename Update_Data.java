package products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Data extends Store {
@Override
	
	public  void update_Product() throws ClassNotFoundException, SQLException {
		System.out.println("process selected - *UPDATE*");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");

		System.out.println("For updation of the Data you need to remember you Product_Id");
		String str="false";
		String str1="false";
		while(str.equalsIgnoreCase(str1)) {
		  System.out.println("\n1)Name \t\t2)Catagory \t\t3)Price \n\n4)Rating \t\t5)Description  \t\t6)Done");
		  
		  System.out.println("\nplease enter your choice which u want to update"); 
		  int choice = sc.nextInt();
		  switch(choice) {
		  case 1: 
			 
			  String updatedata ="update  shop set Name=(?) where id=(?)";
		  PreparedStatement ps=con.prepareStatement(updatedata);
		  sc.nextLine();
		  System.out.println("please enter new -*Name*-");
		  ps.setString(1, sc.nextLine());
		 System.out.println("enter your product_id here");
		  ps.setInt(2, sc.nextInt());
		  ps.executeUpdate();
		  System.out.println("-----------------------------------------------------------------------------------------------");

		  System.out.println(" data updated Successfully");	
System.out.println("------------------------------------*x*-------------------------------------");
		  break;
		  
		  case 2:
			  String updatedata1 ="update  shop set Catagory=(?) where id=(?)";
			  PreparedStatement ps1=con.prepareStatement(updatedata1);
			  sc.nextLine();
			  System.out.println("please enter new -*Catagory*-");
			  ps1.setString(1, sc.nextLine());
			 
			  System.out.println("enter your product_id here");
			  ps1.setInt(2, sc.nextInt());
			  ps1.executeUpdate();
			  System.out.println("-----------------------------------------------------------------------------------------------");

			  System.out.println(" data updated Successfully");	
	System.out.println("------------------------------------*x*-------------------------------------");
			  break;
		  case 3:
			  String updatedata2="update  shop set Price=(?) where id=(?)";
			  PreparedStatement ps2=con.prepareStatement(updatedata2);
			  sc.nextLine();
			  System.out.println("please enter new -*Price*-");
			  ps2.setInt(1, sc.nextInt());
			  System.out.println("enter your product_id here");
			  ps2.setInt(2, sc.nextInt());
			  ps2.executeUpdate();
			  System.out.println("-----------------------------------------------------------------------------------------------");

			  System.out.println(" data updated Successfully");	
	System.out.println("------------------------------------*x*-------------------------------------");
			  break;
		  case 4:
			  String updatedata3="update  shop set Rating=(?) where id=(?)";
			  PreparedStatement ps3=con.prepareStatement(updatedata3);
			  sc.nextLine();
			  System.out.println("please enter new -*Rating*-");
			  ps3.setInt(1, sc.nextInt());
			  System.out.println("enter your product_id here");
			  ps3.setInt(2, sc.nextInt());
			  ps3.executeUpdate();
			  System.out.println("-----------------------------------------------------------------------------------------------");

			  System.out.println(" data updated Successfully");	
	System.out.println("------------------------------------*x*-------------------------------------");
			  break;
		  case 5:
                 String updatedata4 = "update  shop set Description=(?) where id=(?)";
				PreparedStatement ps4=con.prepareStatement(updatedata4);
				 sc.nextLine();
				System.out.println("please enter new -*Descrption*-");
				ps4.setString(1, sc.nextLine());
				System.out.println("please enter valid product_id");
				ps4.setInt(2, sc.nextInt());
				ps4.executeUpdate();
				 System.out.println("-----------------------------------------------------------------------------------------------");

				  System.out.println(" data updated Successfully");	
		System.out.println("------------------------------------*x*-------------------------------------");
				break;
		
		  case 6 : 
			  str1="true";
			  System.out.println("----------------------------------------- PROCESS END ------------------------------------------------------");

			
				
			  System.out.println(" data updated Successfully");	
			  System.out.println("------------------------------------*x*-------------------------------------");
			  
			  break;
		  
				default:
					System.out.println("\n\t\t***********OOPS************");
					System.out.println("--------------------ENTERED CHOICE WAS NOT VALID--------------------");
	}
		
		
		}
}}
