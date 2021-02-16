import java.math.BigInteger;

public class Thead implements Runnable{
    private int number;

    public Thead(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        BigInteger fact = BigInteger.valueOf(1);
        for(int i = 1; i <= number; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Поток - " + number + " - факториал = " + fact);
    }
}