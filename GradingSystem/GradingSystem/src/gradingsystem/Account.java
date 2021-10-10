
package gradingsystem;


public class Account {

    String AcNumber;
    
    Client c;
    
    Transaction  t;
    
    int currentBalance;
    
            
   
    public Account(Client c ,int currentBalance) {
       this.c=c;
       this.currentBalance= currentBalance;
    }

    public Account() {
    }
    
    
    public boolean processs (Transaction  t){
    
        if (t.value()> currentBalance) {
            return false;
        }
        else{
        
        return true;
        }
    
    }

    @Override
    public String toString() {
        return "Account{" + "AcNumber=" + AcNumber + ", c=" + c + ", t=" + t + ", currentBalance=" + currentBalance + '}';
    }
    
    
    
    
}
