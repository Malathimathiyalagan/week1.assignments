package week1.assignments;

public class MyMobile {
	
       String ModelName = "Galaxy S30";
	   String Brand ="Samsung";
	   String Colour = "Black";
	   
	   long MobileNo = 8745632324l;

		public void makeCall() {
			System.out.println("**First Method**");
			System.out.println("Make call");

		}
		public void sendMsg() {
			System.out.println("--------------------");
			System.out.println("**Second Method**");
	        System.out.println("Send message");
		}
		private void payBills(int p) {
			//int Price = 20000;
			System.out.println("paybills");
			System.out.println(p);

		}

		public static void main(String[] args) {
			
			MyMobile ph = new MyMobile();
			ph.makeCall();
			ph.sendMsg();
			System.out.println("--------------------");
			System.out.println("**Main method**");
			System.out.println("--------------------");
			System.out.println("*Public Method*");
			System.out.println(ph.ModelName);
			System.out.println(ph.Brand);
			System.out.println(ph.Colour);
			System.out.println("--------------------");
			System.out.println("**Private Method**");
			System.out.println("--------------------");
			ph.payBills(20000);
			

			
		}
		
	}

