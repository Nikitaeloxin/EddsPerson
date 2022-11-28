package telran.java2022.person.dao;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.person.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	Stream<Employee> findBySalaryBetween(int min, int max);

}
