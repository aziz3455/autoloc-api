package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employee;
import java.util.List;

public interface IEmployeeService {
    List<Employee> retrieveAllEmployees();
    Employee retrieveEmployee(Long employeeId);
    Employee addEmployee(Employee employee);
    void removeEmployee(Long employeeId);
    Employee modifyEmployee(Employee employee);

    Employee assignEmployeeToAgence(Long employeeId, Long agenceId);
}