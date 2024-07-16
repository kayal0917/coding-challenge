package office;

public class Test  {
	
	    public static void main(String[] args) {
	        
	       IobBank bankA = new IobBank(1000);
	        KybBank bankB = new KybBank(1500);
	        Money bankC = new Money(2000);
	        
	        System.out.println("Balance in Bank A(Iob) : $ " + bankA.getBalance());
	        System.out.println("Balance in Bank B(kyb) : $ " + bankB.getBalance());
	        System.out.println("Balance in Bank C: $ " + bankC.getBalance());
	        System.out.println("Rate of interest in IOB: " +bankA.rateOfInterest() + "%");
	        System.out.println("Rate of interest in KYB: " +bankB.rateOfInterest() + "%");
	    }
	}

