package HW;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import java.sql.*;
public class Application {
    public static void main(String[] args) throws SQLException {
        CityDaoImpl cityDao = new CityDaoImpl();
        EmployeeDaoImpl employeeDAO = new EmployeeDaoImpl();

        City city1 = new City(7, "Kemerovo");
        Employee employee1 = new Employee("Ivan", "Popov", "man", 34, city1);
        Employee employee2 = new Employee("Darya", "Doronina", "woman", 43, city1);

        cityDao.add(city1);
        System.out.println(cityDao.getAllCity().contains(city1));






    }
}
