import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chromosome {
    public ArrayList<City> cities = new ArrayList<City>();
    public double dist;
    public int sequences = 100;
    public double mutateChance = 0.8;


    public Chromosome(ArrayList<City> cities){
        this.cities = cities;

    }

    public double calcDist(){

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




    public void mutate(ArrayList<City> c) {
        ArrayList<City> citiesCopy = (ArrayList<City>)(c.clone());
//        ArrayList<City> half1 = new ArrayList<City>(cities.subList(0, cities.size()/2));
//        ArrayList<City> half2 = new ArrayList<City>(cities.subList(cities.size()/2, cities.size()));
//        int city1 = (int) (Math.random() * half1.size());
//        int city2 = (int) (Math.random() * half1.size());
//        int city3 = (int) (Math.random() * half2.size());
//        int city4 = (int) (Math.random() * half2.size());
//        Collections.swap(half1, city1, city2);
//        Collections.swap(half2, city3, city4);


//        if(Math.random() < mutateChance){
//            Collections.shuffle(cities.subList(((int) (Math.random() * citiesCopy.size()/2)), ((int) (Math.random() * citiesCopy.size()/2 + 10))));
//        }
        ArrayList<Integer> rand = new ArrayList<Integer>();
        for (int i = 0; i < cities.size(); i++) {
            rand.add(i);

        }

        Collections.shuffle(rand);
        int city1 = rand.get(0);
        int city2 = rand.get(1);
        int city3 = rand.get(2);
        int city4 = rand.get(3);
//
//
        Collections.swap(citiesCopy, city1, city2);
        Collections.swap(citiesCopy, city3, city4);



//        if(calcDist(half1) < calcDist(new ArrayList<City>(cities.subList(0, cities.size()/2))) && calcDist(half2) < calcDist(new ArrayList<City>(cities.subList(cities.size()/2, cities.size())))) {
//            half1.addAll(half2);
//            cities = half1;
//
////
//        }
//        else if(calcDist(half1) < calcDist(new ArrayList<City>(cities.subList(0, cities.size()/2)))) {
////            cities = citiesCopy;
//            ArrayList<City> citieshalf2 = new ArrayList<City>(cities.subList(cities.size()/2, cities.size()));
//            half1.addAll(citieshalf2);
//            cities = half1;
//
//        }else if(calcDist(half1) < calcDist(new ArrayList<City>(cities.subList(0, cities.size()/2)))) {
////            cities = citiesCopy;
//            ArrayList<City> citieshalf1 = new ArrayList<City>(cities.subList(0, cities.size() / 2));
//            half2.addAll(0, citieshalf1);
//            cities = half2;
//        }


        if(calcDist(citiesCopy) < calcDist()){
            cities = citiesCopy;
        }


    }



    public Chromosome reproduce(Chromosome c) {

        c.mutate(c.cities);
        return c;



    }

}
