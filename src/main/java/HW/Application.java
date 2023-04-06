package HW;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import java.sql.*;
public class Application {
    public static void main(String[] args) throws SQLException {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        Employee employee = entityManager.find(Employee.class, 1);
//        System.out.println(employee);
//
//        entityManager.close();
//        entityManagerFactory.close();

        City city10 = new City(10, "Kemerovo");
        Employee employee = new Employee("Ivan", "Popov", "man", 34, 10);
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.add(employee);
        employeeDao.getById(15);
        employeeDao.getAllEmployee();
        employeeDao.updateEmployee(employee, 10);
        employeeDao.deleteEmployee(employee);
    }
}
