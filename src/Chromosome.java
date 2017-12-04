import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * Created by student on 12/4/17.
 */
public class Chromosome {

    private ArrayList<City> cities;
    private double mutateChance = 0.8;

    public Chromosome(ArrayList<City> cities) {
        this.cities = cities;
    }

    public void mutate() {
        double chance = Math.random();
        if(chance < mutateChance) return;

        Collections.shuffle(cities);
    }

    public ArrayList<City> reproduce() {
        cities.subList(cities.size()/2, cities.size()).clear();
        for(int i = 0; i < cities.size(); i++) {

        }
    }

}
