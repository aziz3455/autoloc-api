package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}