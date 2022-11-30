package Day31_CollectionFramework;

public class BankAccount {
    double Balance;
    //Please create a constructor that takes one double parameter

    //public ClassName (Parameter1Type Parameter1Name,...)

    public BankAccount(double param1){
        Balance=param1;
    }

    //Please create method that takes a double as parameter
    //No return
    //This method will add the parameter to you balance
    //Method name=Deposit
    //PublicorPrivate StaticorNot ReturnType MethodName(Parameter1Type Parameter1Name,...)

    public void Deposit(double param1){

       Balance +=param1;
        //Below code same with above
        //Balance+=param1;
        System.out.println("Available Balance of your account : "+Balance);
    }




    //Please create method that takes a double as parameter
    //No return
    //This method will subtract the parameter value from your balance
    //Method name=Withdrawal
    //PublicorPrivate StaticorNot ReturnType MethodName(Parameter1Type Parameter1Name,...)

    public void Withdrawal (double param1) throws InsufficientException{
        if(Balance<param1){
            /*
            try
            catch
            finally
            throw
            throws

            //DON'T CATCH AN EXCEPTION IF YOU CAN NOT HANDLE IT

            */


            System.out.println("You do not have enough balance");
        }else{
            Balance=Balance-param1;
        }

        Balance -=param1;
        //Below code same with above
        //Balance-=param1;
        System.out.println("Available Balance of your account : "+Balance);
    }
}
