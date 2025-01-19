package products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Sort_products extends Store{
@Override
	public  void lowToHigh() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
	
		System.out.println("***PROCESS SELECTED SORTING DATA***");

		String str="false";
		String str1="false";
		while(str.equalsIgnoreCase(str1)) {
		System.out.println("\n------------------Please Select option for Sorting According Price------------------");
		System.out.println("\n1) Low to High \n\n2) High to Low \n\n3)Exist");
	
		
		System.out.println("\nplease enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
		String retriveData="select * from shop order by price asc";
		PreparedStatement ps= cn.prepareStatement(retriveData);
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()) {
			

			System.out.println("\nID :- "+rs.getInt(1)+" ");
			System.out.println("PRODUCT NAME :- "+rs.getString(2)+" ");
			System.out.println("CATAGORY :- "+rs.getString(3)+" ");
			System.out.println("PRICE :- "+rs.getInt(4)+" ");
			System.out.println("RATINGS :- "+rs.getInt(5)+" ");
			System.out.println("DESCRIPTION :- "+rs.getString(6)+" ");
			System.out.println(" ");
		}
			System.out.println("\n\t\t***------------------------Data Retrived Successfully------------------------***");
			System.out.println("=====================================================================================================================");
          break;
		case 2:
			
			String retriveData1="select * from shop order by price desc";
			PreparedStatement ps1= cn.prepareStatement(retriveData1);
			ResultSet rs1= ps1.executeQuery();
			System.out.println("=====================================================================================================================");

			while(rs1.next()) {
				

				System.out.println("\nID :- "+rs1.getInt(1)+" ");
				System.out.println("PRODUCT NAME :- "+rs1.getString(2)+" ");
				System.out.println("CATAGORY :- "+rs1.getString(3)+" ");
				System.out.println("PRICE :- "+rs1.getInt(4)+" ");
				System.out.println("RATINGS :- "+rs1.getInt(5)+" ");
				System.out.println("DESCRIPTION :- "+rs1.getString(6)+" ");
				System.out.println(" ");
			}
				System.out.println("\n\t\t***------------------------Data Retrived Successfully------------------------***");
				System.out.println("=====================================================================================================================");
		
		break;
		case 3:
			System.out.println("\n=====================================================================================================================");

			System.out.println("\n\n\t\t-----------------------***EXITED SUCCESSFULLY***-----------------------  ");
			 str1="true";
			System.out.println("\n=====================================================================================================================");
                        
              break;          
		default:
			System.out.println("\n\t\t************OOPS************");

			System.out.println("--------------------YOU ENTERED CHOICE WAS NOT VALID--------------------");

			break;
		}
	}
}
	@Override
	public void delete_Data() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		
		String delete="delete from shop where id=?";
		PreparedStatement ps= cn.prepareStatement(delete);
		System.out.println("**PROCESS SELECTED DELETION**");
		
		System.out.println("\n Please enter Id for delete the product_Data");
		ps.setInt(1, sc.nextInt());
		ps.execute();
		System.out.println("\n=====================================================================================================================");

		System.out.println("\n\nRecords deleted Successfully");
		System.out.println("\n=====================================================================================================================");

		ps.close();
		cn.close();
	}
}