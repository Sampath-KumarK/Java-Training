
public class ManualArrayCopy {
    public static void main(String[] args) {

        double[] prices = { 199.99, 49.50, 320.00, 89.75, 15.00 };

        
        double[] backup = new double[prices.length];

        
        for (int i = 0; i < prices.length; i++) {
            backup[i] = prices[i];
        }

       
        System.out.println("--- Backup Price List ---");
        for (int i = 0; i < backup.length; i++) {
            System.out.println("Product " + (i + 1) +
                               ": Rs. " + backup[i]);
        }
    }
}