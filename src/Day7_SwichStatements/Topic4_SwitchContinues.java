package Day7_SwichStatements;

public class Topic4_SwitchContinues {
    public static void main(String[] args) {


    int day;
    day=5;

       switch(day){

        case 1:
            System.out.println("the 1st day of the week is Monday");
            break;

        case 2:
            System.out.println("the 2nd day of the week is Tuesday");
            break;

        case 3:
            System.out.println("the 3rd day of the week is Wednesday");
            break;  //break where the code stop executing  the code inside the switch statements

        case 4:
            System.out.println("the 4th day of the week is Thursday");
            break;

        case 5:
            System.out.println("the 5th day of the week is Friday");
            break;

        case 6:
            System.out.println("the 6th day of the week is Saturday");
            break;

        case 7:
            System.out.println("the 7th day of the week is Sunday");
            break;

        default:       // like else in if Statements.
            System.out.println("Invalid day of the week");

    }

   }
 }

