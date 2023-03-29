public class Customer {


    private String customerName;
    private int wallet;


    public Customer(String inputName){
        this.customerName= inputName;
        this.wallet = 0;

    }

    public String getName(){
        return this.customerName;
    }

    public int getWallet(){
        return this.wallet;
    }



  // public void setBalance(int newBalance){
  //     this.wallet = newBalance;
  //  }
  //  public void deposit(int amount){
  //      wallet+= amount;
  //  }
  //  public void withdraw(int amount){
  //      wallet-= amount;
  //  }
}
