package CustomClasses;

import java.util.ArrayList;

public class StudentClass {
    //Fields
    public String StudentName;
    public String StudentNumber;

    private ArrayList<Integer> HomeworkResults;


    //Constructor

    public StudentClass(){
      HomeworkResults=new ArrayList<Integer>();

        System.out.println("Someone created a student Class");
    }
    ///  AddHomeworkResult:This method will add a result to your homework
    ///  Return Type = No Return ,because I will just add it
    ///  @param1 is an Integer method
    //   PublicorPrivate StaticorNot ReturnType MethodName(ParameterType)
    public void AddHomeworkResult(int param1){
        HomeworkResults.add(param1);
    }

    /// GetMean:ThisMethod will calculate Mean and return
    ///  Return Type = double
    ///  No parameter
    //   PublicorPrivate StaticorNot ReturnType MethodName(ParameterType)
    public double GetMean(){
        int sum=0;
        for (int i= 0;  i< HomeworkResults.size(); i++) {
            sum=sum+ HomeworkResults.get(i);

        }
        double Mean=sum/ HomeworkResults.size();
        return Mean;

    }

}
