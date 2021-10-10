package gradingsystem;

public class FilterAccount extends Account {
    
    int zeroTransection, TotalTransaction;

    public FilterAccount() {
    }
    
    public FilterAccount(Client c, int currentBalance) {
        super(c, currentBalance);
        zeroTransection = 0;
        TotalTransaction = 0;
    }

    
    
    public double percentFiltered() {
        
        if (TotalTransaction==0) {
            
            return 0.0;
            
        }
        else{
           return (zeroTransection*100.0)/TotalTransaction;
        }
    }
    
    @Override
    public boolean processs(Transaction t) {
        
        TotalTransaction++;
        
        if (t.value() == 0) {
            zeroTransection++;
            return false;
        } else {
            
            return super.processs(t);
        }
        
    }

    @Override
    public String toString() {
       
        return  super.toString()+"FilterAccount{" + "zeroTransection=" + zeroTransection + ", TotalTransaction=" + TotalTransaction + '}';
    }
    
    
    
}
