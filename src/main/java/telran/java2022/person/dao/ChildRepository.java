package telran.java2022.person.dao;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.person.model.Child;

public interface ChildRepository extends CrudRepository<Child, Integer> {

}
