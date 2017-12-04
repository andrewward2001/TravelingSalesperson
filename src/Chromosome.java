import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
/**
 * Created by student on 12/2/17.
 */
public class Chromosome {
    private ArrayList<City> cities = new ArrayList<City>();
    private double dist;
    private int sequences = 100;
    private double mutateChance = 0.8;

    public Chromosome(ArrayList<City> cities){
        this.cities = cities;


    }
    public double calcDist(){
        if(dist!=0){
            return dist;
        }
        for (int i = 0; i < cities.size(); i++) {
            dist += cities.get(i).distanceTo(cities.get(i+1));
        }

        return dist;
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
