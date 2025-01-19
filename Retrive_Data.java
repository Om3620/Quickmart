package products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Retrive_Data extends Store {
	@Override
	public  void retrive() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
	
	System.out.println("-----------*PROCESS SELECTED RETRIVE*------------");
	
	
		String str="false";
		String str1="false";
		while(str.equalsIgnoreCase(str1)) {
	System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("\n1)Retrive single product \n\n2)Retrive all products \n\n3)retrive products by catagory \n\n4)Exist");
System.out.println("\n------------------------------------------------------------------------------------------------");
		System.out.println("\nPlease enter your choice ");
	int choice=sc.nextInt();
	
switch(choice) {
case 1:
	String retrive= "Select * from shop where id= ?";
	PreparedStatement ps = con.prepareStatement(retrive);
	System.out.println("Please Enter your product Id for Retrive_Data");
	
	ps.setInt(1, sc.nextInt());

	System.out.println("=====================================================================================================================");
	ResultSet rs = ps.executeQuery();
	rs.next();
	  System.out.println("\n\t\t **HERE IS SOME RESULT ACCORDING TO YOUR CHOICE**");

	System.out.println("\nID :- "+rs.getInt(1)+" ");
	System.out.println("PRODUCT NAME :- "+rs.getString(2)+" ");
	System.out.println("CATAGORY :- "+rs.getString(3)+" ");
	System.out.println("PRICE :- "+rs.getInt(4)+" ");
	System.out.println("RATINGS :- "+rs.getInt(5)+" ");
	System.out.println("DESCRIPTION :- "+rs.getString(6)+" ");
	System.out.println("\n\t\t***------------------------Data Retrived Successfully------------------------***");
	System.out.println("=====================================================================================================================");

	break;
	
case 2: 
	String retrive1= "select * from shop ";
	PreparedStatement ps1 = con.prepareStatement(retrive1);
	ResultSet rs1 = ps1.executeQuery();
	
	sc.nextLine();
	System.out.println("=====================================================================================================================");
	  System.out.println("\n\t\t **HERE IS SOME RESULT ACCORDING TO YOUR CHOICE**");

	while(rs1.next()) {
		
		System.out.println("\nID :- "+rs1.getInt(1)+" ");
		System.out.println("PRODUCT NAME :- "+rs1.getString(2)+" ");
		System.out.println("CATAGORY :- "+rs1.getString(3)+" ");
		System.out.println("PRICE :- "+rs1.getInt(4)+" ");
		System.out.println("RATINGS :- "+rs1.getInt(5)+" ");
		System.out.println("DESCRIPTION :- "+rs1.getString(6)+" ");
		System.out.println("=====================================================================================================================");

	}
	System.out.println("\n\t\t***--------------------All Products Are Retrived Successfully--------------------***");

	break;
	
case 3:
	String retrive2= "select * from shop where catagory=(?)";
	PreparedStatement ps2 = con.prepareStatement(retrive2);
	System.out.println("please Enter Catagory for Retrive data ");
	ps2.setString(1, sc.next());
	ResultSet rs2 = ps2.executeQuery();
	System.out.println("=====================================================================================================================");
  System.out.println("\n\t\t **HERE IS SOME RESULT ACCORDING TO YOUR CHOICE**");
	
	while(rs2.next()) {
		
		System.out.println("\nID :- "+rs2.getInt(1)+" ");
		System.out.println("PRODUCT NAME :- "+rs2.getString(2)+" ");
		System.out.println("CATAGORY :- "+rs2.getString(3)+" ");
		System.out.println("PRICE :- "+rs2.getInt(4)+" ");
		System.out.println("RATINGS :- "+rs2.getInt(5)+" ");
		System.out.println("DESCRIPTION :- "+rs2.getString(6)+" ");
		

 System.out.println("=====================================================================================================================");
	}
	System.out.println("\n\t\t***------------------------Data Retrived Successfully------------------------***");

	break;
case 4:
	 System.out.println("=====================================================================================================================");

	System.out.println("\n\t\t****************EXITED SUCCESSFULLY****************");
	str1="true";
	 System.out.println("=====================================================================================================================");
	break;
default: 
	System.out.println("\n\t\t************OOPS************");

	System.out.println("--------------------YOU ENTERED CHOICE WAS NOT VALID--------------------");

	break;


}
	}

}
		
}