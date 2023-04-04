package HW;

import java.sql.*;
public class Application {
    public static void main(String[] args) throws SQLException {

        final String user = "postgres";
        final String password = "0701";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = 5 ")) {

            final ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Integer idOfEmployee = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String gender = resultSet.getString("gender");
                int age = resultSet.getInt("age");

                System.out.println("ID сотрудника: " + idOfEmployee);
                System.out.println("Имя: " + firstName);
                System.out.println("Фамилия: " + lastName);
                System.out.println("Возраст: " + age);
                System.out.println("Пол: " + gender);

            }

        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к БД!");
            e.printStackTrace();
        }
        Employee employee10 = new Employee("Ivan", "Popov", "man", 34, new City(7, "Kemerovo"));
       EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.add(employee10);
        employeeDao.getById(5);
        employeeDao.getAllEmployee();
        employeeDao.updateEmployee(10, employee10);
        employeeDao.deleteEmployee(10);
    }
}
