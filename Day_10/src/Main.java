//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] cartItems = new String[5];
        cartItems[0] = "Silver";
        cartItems[1] = "Gold";

//        for(initialization; condition; update){
//            // code to be executed
//        }

//        for(int i = 1; i <= 5; i++){
//            System.out.println("i: " + i);
//        }

//        for(int i = 5; i > 0; i--) {
//            System.out.println("i: " + i);
//        }

        // Sum of first 10 natural numbers
        int sum = 0;
        // the for loop
        for(int i = 1; i <= 10; i++){
            sum += i; // sum = sum + i;
            System.out.println("Sum: " + sum);
        }

        System.out.println("Total Sum of first 10 natural numbers: " + sum);

        }
    }
