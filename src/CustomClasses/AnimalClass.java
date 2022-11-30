package CustomClasses;

public class AnimalClass {
    public String AnimalName;
    public String AnimalType;
    public String AnimalColor;
    //This is a constructor below
    //This will call when you create Class
    //How to define a Constructor
    //public ClassName(ParameterType ParameterName,...)
    //@param1 is a String variable, and we will use it as AnimalName
    //@param2 is a String variable, and we will use it as AnimalType
    public AnimalClass(String param1,String param2){
        AnimalName=param1;
        AnimalType=param2;
    }
    public AnimalClass(String param1,String param2,String param3){
        AnimalName=param1;
        AnimalType=param2;
        AnimalColor=param3;
    }
        public void AMethod(String param3){ //we are using method ,you can see how we call it in Topic3
            System.out.println(param3);
        }



    }


