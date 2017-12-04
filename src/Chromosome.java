import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by student on 12/2/17.
 */
public class Chromosome {
    private ArrayList<City> cities = new ArrayList<City>();
    private double dist;
    private int sequences = 100;

    public Chromosome(ArrayList<City> cities){
        this.cities = cities;


    }

    public void mutate(){


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

//    public Chromosome[] mate(){
//
//
//    }


}
