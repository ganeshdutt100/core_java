import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //if
        // if else
//        int a = 61;
//        if(a % 2 == 0){
//            System.out.println("Even" );
//        }else{
//            System.out.println("Odd");
//        }

//        int marks  = 30;
//        if(marks >= 60) {
//            System.out.println("First");
//        }
//        else if(marks >= 40){
//            System.out.println("Second ");
//        }
//        else if(marks >= 30){
//            System.out.println("Third");
//        }
//        else{
//            System.out.println("Fail");
//        }

// nested if else
// int recharge = 250;
// int youTubePremium = 3000;
//
// if(recharge >= 350){
//     System.out.println("Recharge is Valid ");
//     if(youTubePremium >= 300){
//         System.out.println("YouTube Premium is activated ");
//     }
//     else{
//         //stm
//         System.out.println("Recharge don but YouTube Premium not activated ");
//     }
// }
// else{
//     //stm
//     System.out.println("Recharge amount is to low");
// }
//
        System.out.println("Enter a number (1  to 7) :  ");
        int Days  = sc.nextInt();
        switch (Days){
            case 1 :
                System.out.println("Monday");
                break;
                case 2 :
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4 :
                System.out.println("Thursday");
                break;
                case 5 :
                System.out.println("Friday");
                break;
                case 6 :
                System.out.println("Saturday");
                break;
                case 7 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("invalid day");

        }

    }
}
