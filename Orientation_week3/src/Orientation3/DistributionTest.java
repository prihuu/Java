package Orientation3;

import eduni.distributions.Negexp;

public class DistributionTest {

    public static void main(String[] args) {

        Negexp generator = new Negexp(5.0);

        for (int i = 0; i < 10; i++) {
            double interval = generator.sample();

            System.out.println(interval);
        }
    }
}