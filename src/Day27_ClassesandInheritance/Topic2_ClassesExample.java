package Day27_ClassesandInheritance;

import CustomClasses.StudentClass;

import java.sql.SQLOutput;

public class Topic2_ClassesExample {
    public static void main(String[] args) {
        //we will create 2 students
        //we will give them some homeworks
        //we will point their homeworks
        //we will check if they passed or not

        StudentClass FirstStudent=new StudentClass();
        FirstStudent.StudentName="Hayri";
        FirstStudent.StudentNumber="1";
        FirstStudent.AddHomeworkResult(5);
        FirstStudent.AddHomeworkResult(50);
        FirstStudent.AddHomeworkResult(23);
        FirstStudent.AddHomeworkResult(80);

        StudentClass SecondStudent=new StudentClass();
        SecondStudent.StudentName="George";
        SecondStudent.StudentNumber="2";
        SecondStudent.AddHomeworkResult(90);
        SecondStudent.AddHomeworkResult(98);
        SecondStudent.AddHomeworkResult(87);


        if (FirstStudent.GetMean()>=70){
            System.out.println(FirstStudent.StudentName+" Passed");
        }
        else {
            System.out.println(FirstStudent.StudentName+" Failed");
        }

        if (SecondStudent.GetMean()>=70){
            System.out.println(SecondStudent.StudentName+" Passed");
        }
        else {
            System.out.println(SecondStudent.StudentName+" Failed");
        }



    }
}
