import java.util.ArrayList;
import java.util.Collections;

public class Chromosome {
    public ArrayList<City> cities = new ArrayList<City>();
    public double dist;
    public int sequences = 100;
    public double mutateChance = 0.8;

    public Chromosome(ArrayList<City> cities){
        this.cities = cities;
    }

    public double calcDist(){
//        if(dist!=0){
//            return dist;
//        }
        dist = 0;
        for (int i = 0; i < cities.size()-1; i++) {
            dist += cities.get(i).distanceTo(cities.get(i+1));
        }

        return dist;
    }

    public double calcDist(ArrayList<City> otherCities) {
        double distance = 0;

        for (int i = 0; i < otherCities.size()-1; i++) {
            distance += otherCities.get(i).distanceTo(otherCities.get(i+1));
        }

        return distance;
    }

    public void mutate() {
        ArrayList<City> citiesCopy = cities;
        int city1 = (int) (Math.random() * citiesCopy.size());
        int city2 = (int) (Math.random() * citiesCopy.size());
        Collections.swap(citiesCopy, city1, city2);

        if(calcDist(citiesCopy) < calcDist())
            cities = citiesCopy;
    }

    public Chromosome reproduce() {
        Chromosome c = this;
        c.mutate();
        return c;
    }

}
