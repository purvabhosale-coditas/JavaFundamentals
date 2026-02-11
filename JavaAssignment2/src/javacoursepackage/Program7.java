package javacoursepackage;

enum OrderStatus{
//	PLACED{
//		public String getMessage(){
//            return "Order has been placed."; 
//            
//        }
//	},
//	SHIPPED{
//		public String getMessage(){
//            return "Order has been shipped."; 
//            
//        }
//	},
//	DELIVERED{
//		public String getMessage(){
//            return "Order has been delivered."; 
//            
//        }
//	},
//	CANCELLED{
//		public String getMessage(){
//            return "Order has been canceled."; 
//            
//        }
//	};
//	public abstract String getMessage();
	
	PLACED("Order has been placed."),
	SHIPPED("Order has been shipped."),
	DELIVERED("Order has been delivered."),
	CANCELLED("Order has been canceled.");
	
	String message;
	
	OrderStatus(String message){
		this.message = message;
	}
	
	String getMessage() {
		return message;
	}
}

public class Program7 {

	public static void main(String[] args) {
		
		OrderStatus status = OrderStatus.PLACED;
		
		System.out.println("Order Status: " + status);
		System.out.println("Status message: " + status.getMessage());
		
		//Changing status
		OrderStatus status2 = OrderStatus.CANCELLED;
		
		System.out.println("Order Status: " + status2);
		System.out.println("Status message: " + status2.getMessage());
		
		System.out.println("\nAll Satuses:");
		for(OrderStatus s : OrderStatus.values()) {
			System.out.println(s + " - " + s.getMessage());
		}
		
//		OrderStatus orderstatus[] = OrderStatus.values();
//		for(int i=0; i<orderstatus.length;i++) {
//			System.out.println(orderstatus[i] + " - " +orderstatus[i].getMessage());
//		}
		
		
	}

}
