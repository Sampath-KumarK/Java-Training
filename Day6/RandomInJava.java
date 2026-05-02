import java.util.Random;
public class RandomInJava {
    public static void main(String[] args) {
        Random rn = new Random();
        int randmnum = rn.nextInt(100);
        System.out.println(randmnum);
        boolean randbool = rn.nextBoolean();
        System.out.println(randbool);
        double randg =10 + (2* rn.nextGaussian());
        System.out.println("The random Gaussian number: "+randg);
    }
}
