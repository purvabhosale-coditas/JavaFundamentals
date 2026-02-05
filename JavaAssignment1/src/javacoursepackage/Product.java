package javacoursepackage;

public class Product {
	
	int id, available_quantity;
	String name;
	double price, gst;
	
	  Product(int id, int available_quantity, String name, double price, double gst) {
        this.id = id;
        this.available_quantity = available_quantity;
        this.name = name;
        this.price = price;
        this.gst = gst;        
	  }
	  
	  double TotalwithGST(int quantity) {
          return (price * quantity) + (price * gst / 100);
      }
} 


