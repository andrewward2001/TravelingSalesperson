import java.util.*;

public class TestCities {

    private ArrayList<City> cities;
    private ArrayList<Chromosome> chromosomes;
    private int size = 20;

    public TestCities(int size) {
        this.size = size;
        cities = new ArrayList<>();
        addCities();
        chromosomes = new ArrayList<>();
        fill();
    }

    public void fill() {

    }

    public void generation() {

    }

    public void mutate() {
        for(int i = size/2; i < size; i++) {
            Chromosome c = chromosomes.get(i);
            c.mutate();
        }
    }

    public void reproduce() {

    }

    public void kill() {
        while(chromosomes.size() > size/2) {
            chromosomes.remove(chromosomes.get(chromosomes.size()-1));
        }
    }

    public void sort() {
        Collections.sort(chromosomes, new Comparator<Chromosome>() {
            @Override
            public int compare(Chromosome o1, Chromosome o2) {
                if(o1.calcDist() - o2.calcDist() >= 0)
                    return 1;
                else
                    return -1;
            }
        });
    }

    public void addCities() {
        cities.add(new City(273, 225));
        cities.add(new City(643, 437));
        cities.add(new City(235, 630));
        cities.add(new City(541, 737));
        cities.add(new City(248, 587));
        cities.add(new City(129, 185));
        cities.add(new City(369, 503));
        cities.add(new City(300, 797));
        cities.add(new City(555, 406));
        cities.add(new City(404, 214));
        cities.add(new City(302, 657));
        cities.add(new City(775, 438));
        cities.add(new City(315, 359));
        cities.add(new City(773, 75));
        cities.add(new City(129, 69));
        cities.add(new City(238, 13));
        cities.add(new City(520, 23));
        cities.add(new City(295, 299));
        cities.add(new City(794, 346));
        cities.add(new City(621, 27));
    }

    public ArrayList<City> getCities(){
        return cities;
    }
}
