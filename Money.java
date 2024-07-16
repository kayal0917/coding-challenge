package office;

public class Money  implements Bank {
	    private double balance;
	    
	    
	    public  Money(double balance) {
	        this.balance = balance;
	    }
	    
	    public double getBalance() {
	        return balance;
	    }

	    @Override
	    public double rateOfInterest() {
	        return 0.0;
	    }
	    
	}
	    
	    
	    
	    
//	    public Money(int i) {
//			// TODO Auto-generated constructor stub
//		}

//		public Money(int i) {
//			// TODO Auto-generated constructor stub
//		}

		
   
	    
	

