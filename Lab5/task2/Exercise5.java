import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import java.util.List;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        // write your answer here

        Optional<City> maxCapitals = countryDao.findAllCountries()
                .stream()
                .map(country -> country.getCapital())
                .map(capitalId -> cityDao.findAllCities().stream().filter(c -> c.getId() == capitalId))
                .map(city -> city.collect(toList())) // convert it to list instead of stream
                .filter(list -> list.size() > 0)
                .map(a -> a.get(0))
                .max(Comparator.comparingInt(City::getPopulation));

        System.out.println(maxCapitals.isPresent() ? maxCapitals.get() : "Not found");

    }

}