import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create random
        Random rand = new Random();

        double intel = 20;

        //calculate damage of each turn
        double modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage1 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage2 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage3 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage4 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage5 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage6 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage7 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage8 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage9 = modifier * intel * 5;

        modifier = rand.nextDouble()*(1.5-0.5)+0.5;
        double damage10 = modifier * intel * 5;

        //killed or not?
        double HPLeft = 1000- (damage1+damage2+damage3+damage4+damage5+damage6+damage7+damage8+damage9+damage10);
        System.out.println(HPLeft);

    }
}
