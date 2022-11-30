package CustomClasses;

public class EmployeeClass {
    //Fields
    public String Name;
    public String Surname;
    public String Department;

    public AddressClass HomeAddress;


    private String SIN;

    //Constructor  -cons name have to be same name with its class name
    public EmployeeClass() {
        HomeAddress = new AddressClass();
        System.out.println("You created an employee");
    }

    //thios is a constructor
    //we are using same name with different parameters -OVERLOAD
    //@param1 is a String variable that e will use as  Name
    // @param2 is a String variable that e will use Surname
    //@param3 is a String variable that e will use QA
    public EmployeeClass(String param1, String param2, String param3) {
        HomeAddress = new AddressClass();
        Name = param1;
        Surname = param2;
        Department = param3;
    }

    //Methods
    ///SetEmployeeSIN :This method will set employee's SIN number.
    //param1:this is a string type and parameter
//public static ReturnType MethodName(ParameterType parameterName,...)
    public void SetEmployeeSIN(String param1) {//static for common things , we are setting unique thing sin.that s why we don't use static here
        SIN = param1;//we want toi use sin number in other places to that s why public


    }
    //GetEmployeeSIN:this method will return a String type and will return SIN value
    //I don't have any parameters.

    public String GetEmployeeSIN() {
        return SIN;
    }

}




