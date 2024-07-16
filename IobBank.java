package office;

public class IobBank extends Money{
	    
	    public IobBank (double balance) {
	        super(balance);
	    }
	    
	    @Override
	    public double rateOfInterest() {
	        return 8.0;
	    }
	    
	}

