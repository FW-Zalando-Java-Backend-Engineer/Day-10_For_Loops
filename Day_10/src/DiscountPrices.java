public class DiscountPrices {
    public static void main(String[] args) {
        double[] originalPrices = {100.0, 50.0, 30.0, 80.0, 120.0};

        // System.out.println("First price: " + originalPrices[0]);

       // System.out.println("The size of the original prices: " + originalPrices.length);

        // Scenario: Show new prices after applying 10% discount.
      //  int itemsNumber = 2;
        double discountedPrice;
        for (int index = 0; index < originalPrices.length; index++) {
//            if(index >= itemsNumber){
//                break; // stop the loop
//            }
            if(originalPrices[index] <= 50.0){
                continue; // skip this iteration
            }
          //  System.out.println("Price number " + index + ": " + originalPrices[index]);
            discountedPrice = originalPrices[index] * 0.9;

            System.out.println("Original Price: €" + originalPrices[index] + " → Discounted Price: €" + discountedPrice);

        }
    }
}
