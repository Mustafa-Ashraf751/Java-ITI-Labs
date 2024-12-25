
import static java.lang.System.getProperties;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao = InMemoryWorldDao.getInstance();
      // write your answer here
      List<City> maxCityByCountry = countryDao.findAllCountries().stream()
            .map(country -> country.getCities())
            .map(cities -> cities.stream()
                  .max(Comparator.comparing(City::getPopulation)))
            .filter(Optional::isPresent).map(city -> city.get()).collect(Collectors.toList());
      System.out.print(maxCityByCountry);
   }

}