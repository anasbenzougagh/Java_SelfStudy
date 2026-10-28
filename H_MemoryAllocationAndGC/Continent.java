package H_MemoryAllocationAndGC;

public class Continent {//stack
    String country,state,city,town;
                    //Local variables
    public Continent(String country, String state, String city, String town) {
//this.instance variables = Local variables;
        this.country = country;
        this.state = state;
        this.city = city;
        this.town = town;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +'\n'+
                "country: " + country + '\n' +
                "state: " + state + '\n' +
                "city: " + city + '\n' +
                "town: " + town + '\n';
    }
}
