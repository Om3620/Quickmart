package products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Implementation extends Store {
	
  
Scanner s = new Scanner(System.in);
//Implementation im = new Implementation();
@Override
	public  void add_Prouct() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		String insert="insert into shop values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insert);
		
		 System.out.println("\n\nplease enter your product **id** ");
		 setid(s.nextInt());
    s.nextLine();
	
	 System.out.println("\nplease enter your product **Name**");
	setname(s.nextLine());

	 System.out.println("\nplease enter your product **Category**");
	setcat(s.nextLine());
     
	 System.out.println("\nplease enter your product **Price**");
	setprice(s.nextInt());
    
	 System.out.println("\nplease enter your product **Ratings**");
 setrating(s.nextInt());
	s.nextLine();
 System.out.println("\nplease enter your product **Description**");
   desc=s.nextLine();
		
			
		

 System.out.println("\n\t\t***Please__Confirm__You__Entered__Data__Are__Correct***");
 System.out.println("-------------------------------------------------------------------------------");
 System.out.println("ID :- "+ getid());
 System.out.println("NAME :- "+ getname() );
 System.out.println("CATEGORY :- "+ getcat());
 System.out.println("PRICE :- "+ getprice());
 System.out.println("RATING :- "+getrating());
 System.out.println("DESCRIPTION :- "+getdesc());
 
 System.out.println("\nYou want to make some changes in the data (type :- *YES* or *NO*)");
 
 String conf= s.next();
 String str= "no";
 

 
 if (conf.equalsIgnoreCase(str)) {
	 
 
 
     ps.setInt(1,getid());
	 ps.setString(2, getname());
	 ps.setString(3, getcat());
	 ps.setInt(4, getprice()); 
	 ps.setInt(5, getrating());
	 ps.setString(6, getdesc());
 }

 else {
	 System.out.println("***");
	 int k=0;
	 System.out.println("\n-------------------Here you can make only *Two* field changes for more changes you can go for updation process----------------");
	 
	 System.out.println("\n***");
	 while(k!=2) {
    System.out.println("\nplz enter choice which you want to correct");
 System.out.println("\n***");
   
  	 System.out.println("\n1)Id \t\t2)Name \t\t3)Category \n\n4)Price \t\t5)Rating \t6)Description \n\n7)Add_data");
  	 System.out.println("\n***");
	 int choice = s.nextInt();
	 
	 switch(choice) {
	 case 1:
		 System.out.println("\nEnter ID here, Which you want to make correction");
		 setid(s.nextInt());
		System.out.println("data modified Successfully");
	break;
	 case 2:
		 System.out.println("\nEnter NAME here, Which you want to make correction");
	s.nextLine();
	setname(s.nextLine());
	System.out.println("data modified Successfully");

	break;
	 case 3:
		 System.out.println("\nEnter CATAGORY, here Which you want to make correction");
			s.nextLine();
		 setcat(s.nextLine());
			System.out.println("data modified Successfully");

	break;
	 case 4:
		 System.out.println("\nEnter PRICE here, Which you want to make correction");
		 setprice(s.nextInt());
			System.out.println("data modified Successfully");

	break;
	 case 5:
		 System.out.println("\nEnter RATINGS here, Which you want to make correction");
		 setrating(s.nextInt());
			System.out.println("data modified Successfully");

     break;
 case 6:
	 System.out.println("\nEnter DESCRIPTON here, Which you want to make correction");
	s.nextLine();
	setdesc(s.nextLine());
	System.out.println("data modified Successfully");

	break;
 case 7:
	 System.out.println("\n---------------------------------------**PROCESS DONE** --------------------------------------");
	 System.exit(0);
	 break;
	 
	default:
		System.out.println("\n\t\t************OOPS************");
		System.out.println("--------------------YOU ENTERED CHOICE WAS NOT VALID--------------------");

		break;
	
	 }
	 k=k+1;
	 
	 
 }

     ps.setInt(1,getid());
	 ps.setString(2, getname());
	 ps.setString(3, getcat());
	 ps.setInt(4, getprice()); 
	 ps.setInt(5, getrating());
	 ps.setString(6, getdesc());
	 
}
 ps.execute();
 ps.close();
 con.close();
		
 System.out.println("-------------------------Data Stored successfuly------------------------- ");
		
		
		
		}}

