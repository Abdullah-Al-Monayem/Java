
package gradingsystem;


public class FilterAccountMain {
    
    public static void main(String[] args) {
        
        FilterAccount filterAccount = new FilterAccount();
        
        Client client = new Client("Mona","Shahja");
        
        Transaction transaction = new Transaction(3000);
        
        
       filterAccount = new FilterAccount(client,5000);
       
       filterAccount.processs(transaction);
       
        System.out.println(filterAccount.toString());
       
       
    }
    
}
