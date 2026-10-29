package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Employee;
import tn.esprit.autoloc.repository.AgenceRepository;
import tn.esprit.autoloc.repository.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AgenceRepository agenceRepository;

    @Override
    public List<Employee> retrieveAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee retrieveEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void removeEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee modifyEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee assignEmployeeToAgence(Long employeeId, Long agenceId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        Agence agence = agenceRepository.findById(agenceId).orElse(null);

        if (employee != null && agence != null) {
            employee.setAgence(agence);
            return employeeRepository.save(employee);
        }
        return null;
    }
}