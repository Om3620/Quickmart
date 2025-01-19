package products;

import java.sql.SQLException;
import java.util.Scanner;

public abstract class Store {
	static Scanner sc = new Scanner(System.in);
private static int id;
protected static String name;
protected static String desc;
protected static String cat;
private static int price ;
private static int rating;

static {
System.out.println("____________________________________________________________________________________________________________________________");
	System.out.println("\n\t\t\t\t******************* WELCOME TO OUR SHOP *********************(^.^)");

	System.out.println("_____________________________________________________________________________________________________________________________");
}
public void setid(int id) {
	this.id =id;
	}
public void setname(String name) {
	this.name=name;
	
}
public  void setdesc(String desc) {
	this.desc=desc;
}
public void setcat(String cat) {
	this.cat=cat;
	
}
public void setprice(int price) {
	this.price=price;
}
public void setrating(int rating) {
	this.rating=rating;
}
public int getid(){
	return id;
}
public String getname() {
	return name;
}
public String getdesc() {
	return desc;
}

public String getcat() {
	return cat;
}
public int getprice() {
	return price;
}
public int getrating() {
	return rating;
}


public  void add_Prouct() throws ClassNotFoundException, SQLException {
	
}
public  void update_Product() throws ClassNotFoundException, SQLException {
	
}
public void lowToHigh() throws ClassNotFoundException, SQLException {
	
}
public  void retrive()throws ClassNotFoundException, SQLException {
	
}
public void delete_Data() throws ClassNotFoundException, SQLException {
	
}
}
