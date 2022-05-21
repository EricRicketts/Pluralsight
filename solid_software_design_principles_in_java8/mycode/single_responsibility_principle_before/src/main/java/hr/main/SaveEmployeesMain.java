package hr.main;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        ConsoleLogger consoleLogger = new ConsoleLogger();
        List<Employee> employees = repository.findAll();

        for (Employee employee : employees){
            try {
                repository.save(employee);
                consoleLogger.writeInfo("Saved employee " + employee.toString());
            } catch (IOException e) {
                consoleLogger.writeError("Error saving employee ", e);
            }
        }
    }
}
