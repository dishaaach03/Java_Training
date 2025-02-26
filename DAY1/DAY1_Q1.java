/*Problem statement:-
        -> develop an app to find the Good cities in given array.
- in main method: declare an array having cities
- in findGoodCities method: write the logic and print the Good cities.
eg:-cities=['Ahmedabad', 'Chennai', 'Hyderabad', 'Nijamabad', 'Blore']
good cities: Chennai, Blore|*/

public class DAY1_Q1 {
    public static void findGoodCities(String[] cities) {
        StringBuilder ct = new StringBuilder();
        for (String city : cities) {
            if (!city.endsWith("bad")) {  // Condition changed: NOT ending with "bad"
                if (ct.length() > 0) {
                    ct.append(", ");
                }
                ct.append(city);
            }
        }

        if (ct.length() > 0) {
            System.out.println("The good cities are: " + ct);
        } else {
            System.out.println("No good cities exist.");
        }
    }

    public static void main(String args[]) {
        String cities[] = {"Ahmedabad", "Chennai", "Hyderabad", "Nijamabad", "Blore"};
        findGoodCities(cities);
    }
}

