package Day26_ClassesandConstructors;

import CustomClasses.AnimalClass;
import CustomClasses.StudentClass;

public class Topic3_StudentExp {
    public static void main(String[] args) {
        StudentClass MyStudent=new StudentClass(); //import the related class
        MyStudent.StudentName="Sefa";
        MyStudent.StudentNumber="928";

        AnimalClass MyAnimal=new AnimalClass("Lion","Cat");
      /*  AnimalClass MyAnimal=new AnimalClass(); //instead of using this 3 lines we used above constructor
        MyAnimal.AnimalName="Lion";
        MyAnimal.AnimalType="Cat";
        */
        MyAnimal.AMethod("Something");
        System.out.println(MyAnimal.AnimalName);


        AnimalClass MyPenguin=new AnimalClass("Penguin","Bird","White-Black");
        System.out.println(MyPenguin.AnimalName+" "+MyPenguin.AnimalType+ " "+MyPenguin.AnimalColor);
   /*I don't have to type below lines as we are assigning them in Constructor.
   MyPenguin.AnimalName="Penguin";
   MyPenguin.AnimalType="Bird";
   MyPenguin.AnimalColor="White-Black";
   */

    }
}
