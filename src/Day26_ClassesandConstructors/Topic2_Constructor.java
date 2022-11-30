package Day26_ClassesandConstructors;

import CustomClasses.EmployeeClass;

public class Topic2_Constructor {
    public static void main(String[] args) {
        //instead of using 4 lines , we created another constructor with overload on Employee Class
        EmployeeClass MyEmployee=new EmployeeClass("Firuze","OZ","QA");

       /* EmployeeClass MyEmployee=new EmployeeClass();
        MyEmployee.Name="Firuze";
        MyEmployee.Surname="OZ";
        MyEmployee.Department="QA";
        */
        MyEmployee.SetEmployeeSIN("123 146 789");
    }
}
