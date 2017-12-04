
public class Main {

    public static void main(String[] args) {
        TestCities cities = new TestCities();
        City[] cities1 = cities.getCities();
        for(int i = 0; i < cities1.length-1; i++) {
            System.out.println(cities1[i].distanceTo(cities1[i+1]));
        }
    }

}
