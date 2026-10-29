package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employee;
import tn.esprit.autoloc.service.IEmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private final IEmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.retrieveAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.retrieveEmployee(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setIdEmployee(id);
        return employeeService.modifyEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.removeEmployee(id);
    }

    @PutMapping("/{employeeId}/agence/{agenceId}")
    public Employee assignEmployeeToAgence(@PathVariable Long employeeId, @PathVariable Long agenceId) {
        return employeeService.assignEmployeeToAgence(employeeId, agenceId);
    }
}