package Day26_ClassesandConstructors;

import CustomClasses.CarClass;
import CustomClasses.EmployeeClass;

public class Topic1_PublicClasses {
    public static void main(String[] args) {
        //How to define an Object
        //DataType Variable =new Constructor() ;

        CarClass MyElectricCar = new CarClass();
        MyElectricCar.Make = "Tesla" ;
        MyElectricCar.Model="3";
        MyElectricCar.Color="White";
        MyElectricCar.ModelYear = 2021;


        EmployeeClass MyEmployee=new EmployeeClass();
        MyEmployee.Name="Firuze";
        MyEmployee.Surname="OZ";
        MyEmployee.Department="QA";


        MyEmployee.SetEmployeeSIN("123 146 789");

        System.out.println(MyEmployee.GetEmployeeSIN());
    }
}
