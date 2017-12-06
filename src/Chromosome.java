import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

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

    public double calcDist(ArrayList<City> otherCities) {
        double distance = 0;

        for (int i = 0; i < otherCities.size(); i++) {
            distance += otherCities.get(i).distanceTo(otherCities.get(i+1));
        }

        return distance;
    }

    public void mutate() {
        ArrayList<City> citiesCopy = cities;
        int city1 = (int) (Math.random() + citiesCopy.size());
        int city2 = (int) (Math.random() + citiesCopy.size());
        Collections.swap(citiesCopy, city1, city2);

        if(calcDist(citiesCopy) < calcDist())
            cities = citiesCopy;
    }

    public ArrayList<City> reproduce() {
        cities.subList(cities.size()/2, cities.size()).clear();
        for(int i = 0; i < cities.size(); i++) {

        }
    }

}
