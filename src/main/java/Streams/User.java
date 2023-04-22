package Streams;

import java.util.Set;

public class User {
    public final String name;
    public final String lastName;
    public final String country;
    public final Set<String> citiesVisited;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", citiesVisited=" + citiesVisited +
                '}';
    }

    public User(String name, String lastName, String country, Set<String> citiesVisited) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.citiesVisited = citiesVisited;
    }
}
