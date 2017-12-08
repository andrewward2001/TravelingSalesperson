import java.util.*;

public class Main {

    public static void main(String[] args) {
        TestCities population = new TestCities(20);


        for(int i = 0; i < 1000000; i++) {
            population.generation();
        }
        System.out.println(population.chromosomes.get(0).calcDist());
        System.out.println("ITS 11 PM AND THIS THING WILL BE THE DEATH OF ME");
    }
}
