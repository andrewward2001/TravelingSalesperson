import java.util.*;

public class Main {

    public static void main(String[] args) {
        TestCities population = new TestCities(20);

        for(int i = 0; i < 500000; i++) {
            population.generation();
        }
        System.out.println(population.chromosomes.get(0).calcDist());
    }
}
