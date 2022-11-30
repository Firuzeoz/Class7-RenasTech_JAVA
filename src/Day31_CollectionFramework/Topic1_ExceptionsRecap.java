package Day31_CollectionFramework;

public class Topic1_ExceptionsRecap {
    public static void main(String[] args) {


    //Create a bank account with balance $1000
    //DataType VariableName =new Constructor(parameter defined in constructor)


    BankAccount MyAccount=new BankAccount(100);

    MyAccount.Deposit(900);
             try {
                 MyAccount.Withdrawal(1500);

                 }catch(InsufficientException MyError){
                 System.out.println(MyError.Message);
  }
}
}
