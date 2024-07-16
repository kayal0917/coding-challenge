package office;

public class KybBank extends Money {
	
		    public KybBank (double balance) {
		        super(balance);
		    }
		    
		    @Override
		    public double rateOfInterest() {
		        return 5.0;
		    }
		    
		}



