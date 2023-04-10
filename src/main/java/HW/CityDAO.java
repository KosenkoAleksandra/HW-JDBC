package HW;

import java.util.List;

public interface CityDAO {
    City add(City city);
    City getById(int id);
    List<City> getAllCity();
    City updateCity(City city);
    void deleteCity(City city);
}
