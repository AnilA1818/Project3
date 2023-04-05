public class Test1 {

	public static void main(String[] args) {
		 System.out.println("main start");
		 try {
			 System.out.println("try start");
			 try {
				System.out.println(10/0); 
			 }catch(ArithmeticException e) {
				 System.out.println("Hi");
			 }
		 }catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
		 }
		 System.out.println("main end");

	}

}
