import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your table number : ");
//        int table = sc.nextInt();
//
//        for(int i = 1; i <= 10; i++){
//            System.out.println(table + " * "+ i + " = "+ (i*table) );
//        }

//        int i = 5;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }

//        int i = 10;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i <= 6);

        int[] number  = {10,34,5,67,8,9654,45};
        for(int newValues : number ){
            System.out.println(newValues + 2);
        }
    }
}
//2 *1  = 2
//2 *2  = 4
//2 *3  = 6