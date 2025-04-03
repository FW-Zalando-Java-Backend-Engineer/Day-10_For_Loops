import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 to 10): ");
        int number = scanner.nextInt();

        // Validating the input

        //        if(number < 1 || number > 10){
        //            System.out.println("Please enter a number between 1 and 10.");
        //            return;
        //        }

      while (number < 1 || number > 10){
           System.out.println("Please enter a number between 1 and 10.");
           number = scanner.nextInt();

       }


       multiplicationTable(number);

//       if(number < 1 || number > 10){
//           System.out.println("Please enter a number between 1 and 10.");
//       }else{
//           multiplicationTable(number);
//       }





        // Very important to close the input stream:
        scanner.close();




    }

    public  static  void multiplicationTable(int number){

        int result;
        // we write the for loop
        for(int i = 1; i <= 10; i++){
            result = number * i;
            System.out.println(number + " x " + i + " = " + (result));
        }
    }
}
