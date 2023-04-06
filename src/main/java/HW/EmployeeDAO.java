package HW;
import java.util.List;
public interface EmployeeDAO {
    Integer add(Employee employee);
    Employee getById(int id);
    List<Employee> getAllEmployee();
    void updateEmployee(Employee employee, int id);
    void deleteEmployee(Employee employee);

}
